package org.example.z_project.phr_soultion.dto.health_record.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class RecordListResponseDto {
    private Long id;
    private Long patientId;
    private String dateOfVisit;
    private String diagnosis;
    private String treatment;

    private Date inquiryTime;
}
