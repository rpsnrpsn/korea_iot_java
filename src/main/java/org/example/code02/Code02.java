package org.example.code02;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("시행 횟수를 입력해주세요.");
        int N = sc.nextInt();
        sc.nextLine();

        int min = Integer.MAX_VALUE;

        for (int n = 0; n < N; n++) {
            System.out.println("숫자를 입력해주세요");
            int num = sc.nextInt();
            sc.nextLine();

            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
        sc.close();
    }
}