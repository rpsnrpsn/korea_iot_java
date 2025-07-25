package org.example.z_project.phr_soultion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

// 환자 의료 기록 정보 클래스
@Data
@AllArgsConstructor
public class HealthRecord {
    private Long id;
    private Long patientId;
    private String dateOfVisit;
    private String diagnosis;
    private String treatment;
}
