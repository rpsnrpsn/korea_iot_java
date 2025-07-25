package org.example.z_project.phr_soultion.service;

import org.example.z_project.phr_soultion.dto.patients.request.PatientCreateRequestDto;
import org.example.z_project.phr_soultion.dto.patients.request.PatientUpdateRequestDto;
import org.example.z_project.phr_soultion.dto.patients.response.PatientListResponseDto;
import org.example.z_project.phr_soultion.dto.patients.response.PatientDetailResponseDto;

import java.util.List;

public interface PatientService {
    // CR(전체/단건)UD
    void registerPatient(PatientCreateRequestDto dto);
    List<PatientListResponseDto> listAllPatients();
    PatientDetailResponseDto getPatientById(Long id);
    void updatePatient(Long id, PatientUpdateRequestDto dto);
    void deletePatient(Long id);
}
