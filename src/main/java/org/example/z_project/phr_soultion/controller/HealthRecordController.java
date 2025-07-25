package org.example.z_project.phr_soultion.controller;

import org.example.z_project.phr_soultion.dto.health_record.request.RecordCreateRequestDto;
import org.example.z_project.phr_soultion.dto.health_record.response.RecordListResponseDto;
import org.example.z_project.phr_soultion.service.HealthRecordService;
import org.example.z_project.phr_soultion.service.impl.HealthRecordServiceImpl;

import java.util.List;

public class HealthRecordController {
    private HealthRecordService healthRecordService;

    public HealthRecordController() {
        this.healthRecordService = new HealthRecordServiceImpl();
    }

    public void createRecord(RecordCreateRequestDto dto) {
        healthRecordService.createdRecord(dto);
    }
    public List<RecordListResponseDto> getAllRecords() {
        return healthRecordService.getAllRecords();
    }

    public List<RecordListResponseDto> filterRecordsByDiagnosis(String diagnosis) {
        return healthRecordService.filterRecordsByDiagnosis(diagnosis);
    }

    public void deleteRecord(long id) {
        healthRecordService.deleteRecord(id);
    }
}
