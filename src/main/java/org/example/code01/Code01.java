package org.example.code01;

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 A를 입력해주세요. A: ");
        int A = sc.nextInt();
        sc.nextLine();

        System.out.print("숫자 B를 입력해주세요. B: ");
        int B = sc.nextInt();
        sc.nextLine();

        System.out.println(A % B == 0 ? "0으로 나눌 수 없습니다" : A % B);

        sc.close();

//        Scanner sc1 = new Scanner(System.in);
//
//        System.out.print("숫자 A를 입력해주세요. A: ");
//        int C = sc.nextInt();
//        sc.nextLine();
//
//        System.out.print("숫자 B를 입력해주세요. B: ");
//        int D = sc.nextInt();
//        sc.nextLine();
//        System.out.println();
//
//        System.out.println(C % D == 0 ? "0으로 나눌 수 없습니다" : C%D);

//        sc.close();
    }
}
