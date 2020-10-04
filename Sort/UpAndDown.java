package com.minsu.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 입력받기
        int n = sc.nextInt();

        // N개의 정수를 입력받아 리스트에 저장
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 정렬 라이브러리 이용하여 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

