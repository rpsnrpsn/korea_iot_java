package org.example.z_project.phr_soultion.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

//환자 정보 클래스
@Data
@AllArgsConstructor
public class Patient {
    private Long id;
    private String name;
    private int age;
    private String gender;
}
