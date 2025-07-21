package org.example.chapter14;

// == 성적 계산 프로그램 == //

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class Student {
    private String name;
    private int score;
}

// 인터페이스
interface Grading {
    String calculateGrade(Student student);
}

public class C_Anonymous {
    public static void main(String[] args) {
        Student student1 = new Student("ㅂㅈㄷ", 60);
        Student student2 = new Student("ㅂㅁㅋ", 70);
        Student student3 = new Student("ㅂㄱㄱ", 90);
        Student student4 = new Student("ㅂㄹㅇ", 80);
        Student student5 = new Student("ㅁㅇㄷ", 80);

        Student[] students = { student1, student2, student3, student4, student5 };

        Grading grading = new Grading() {
            @Override
            public String calculateGrade(Student student) {

                int score = student.getScore();

                if (score > 100 || score < 0) {
                    System.out.println("잘못된 점수입니다.");
                    return null;
                } else if (score >= 90) {
                    return "A";
                } else if (score >= 80) {
                    return "B";
                } else if (score >= 70) {
                    return "C";
                } else if (score >= 60) {
                    return "D";
                } else {
                    return "F";
                }


            }
        };

        for (Student s: students) {
            String grade = grading.calculateGrade(s);

            if (grade != null ) {
                System.out.println(s.getName() + "의 성적: " + grade);
            }
        }
    }
}
