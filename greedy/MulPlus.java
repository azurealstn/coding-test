package com.minsu.algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열 입력

        // 첫 번째 문자를 숫자로 변경한 값을 대입, 0이 출력
       long result = str.charAt(0) - '0';

       for (int i=0; i<str.length(); i++) {
           // 두 수 중에서 하나라도 '0' 또는 '1'인 경우, 더할 것!
           int num = str.charAt(i) - '0'; // 숫자로 변경
           if (num <= 1 || result <= 1) {
               result += num;
           }
           else {
               result *= num; // 그렇지 않으면 곱할 것!
           }
       }
        System.out.println(result);
    }
}
