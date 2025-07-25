package org.example.z_project.phr_soultion.service.impl;

import org.example.z_project.phr_soultion.dto.patients.request.PatientCreateRequestDto;
import org.example.z_project.phr_soultion.dto.patients.request.PatientUpdateRequestDto;
import org.example.z_project.phr_soultion.dto.patients.response.PatientDetailResponseDto;
import org.example.z_project.phr_soultion.dto.patients.response.PatientListResponseDto;
import org.example.z_project.phr_soultion.entity.Patient;
import org.example.z_project.phr_soultion.repository.PatientRepository;
import org.example.z_project.phr_soultion.service.PatientService;

import java.util.List;
import java.util.stream.Collectors;

public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;
    private static long currentId = 1;

    public PatientServiceImpl() {
        this.patientRepository = PatientRepository.getInstance(); // 싱글톤 패턴 사용
    }


    // ID 생성 로직
    private Long generatedId() {
        return currentId++;
    }

    @Override
    public void registerPatient(PatientCreateRequestDto dto) {
        // 환자 등록 기능
        // 1) 요청, 응답
        //      - 등록이니까 요청값 필요, 응답 필요에 따라 결정
        // 2) 요청값이 있을 경우 데이터 검증
        //      - ex) 해당 환자 정보가 이미 저장되어 있는지 확인, 잘못된 이름, 나이, 성별인지 확인


        Patient patient = new Patient(
            generatedId(), dto.getName(), dto.getAge(), dto.getGender()
        );

        patientRepository.save(patient);
    }

    @Override
    public List<PatientListResponseDto> listAllPatients() {
        List<Patient> patients = patientRepository.findAll();

        List<PatientListResponseDto> responseDtos = patients.stream()
                .map(patient -> new PatientListResponseDto(patient.getName(), patient.getGender()))
                .collect(Collectors.toList());

        return responseDtos;
    }

    @Override
    public PatientDetailResponseDto getPatientById(Long id) {
        PatientDetailResponseDto data = null;

        try {
//            Optional<Patient> optionalPatient = patientRepository.findById(id);
//
//            if (optionalPatient.isEmpty()) {
//                new IllegalArgumentException("해당 ID를 가진 환자를 조회할 수 없습니다: " + id);
//            }
//
//            Patient patient = optionalPatient.get();

            Patient patient = patientRepository.findById(id)
                    .orElseThrow(() -> new IllegalArgumentException("해당 ID를 가진 환자를 조회할 수 없습니다: " + id));

            data = new PatientDetailResponseDto(patient.getId(), patient.getName(), patient.getAge());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return data;
    }

    @Override
    public void updatePatient(Long id, PatientUpdateRequestDto dto) {
        try {
            Patient patient = patientRepository.findById(id)
                    .orElseThrow(() -> new IllegalArgumentException("해당 ID를 가진 환자를 조회할 수 없습니다: " + id));

            patient.setName(dto.getName());
            patient.setAge(dto.getAge());

            patientRepository.save(patient);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deletePatient(Long id) {
        try {
            Patient patient = patientRepository.findById(id)
                    .orElseThrow(() -> new IllegalArgumentException("해당 ID를 가진 환자를 조회할 수 없습니다: " + id));

            patientRepository.delete(patient);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
