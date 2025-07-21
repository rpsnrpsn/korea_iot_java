package org.example.정보처리기사_실기;

public class Java01 {
    public static void change(String[] data, String s) {
        data[0] = s;
        s = "Z";
    }

    public static void main(String[] args) {
        String data[] = {"A"};
        String s = "B";

        change(data, s);
        System.out.println(data[0] + s);
    }
}
