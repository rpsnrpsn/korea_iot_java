package org.example.z_project.phr_soultion.dto.patients.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PatientCreateRequestDto {
    private String name;
    private int age;
    private String gender;
}
