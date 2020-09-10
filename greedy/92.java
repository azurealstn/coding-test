package com.minsu.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M, K를 공백 기준으로 입력
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // 배열 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 배열 정렬
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 다음으로 큰 수

        // 가장 큰 수가 더해지는 횟수
        int cnt = (m / (k+1)) * k;
        cnt += m % (k+1); // m으로 나누어 떨어지지 않는 경우

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (m - cnt) * second; // 나머지 다음 큰 수 더하기

        System.out.println(result);
    }
}

