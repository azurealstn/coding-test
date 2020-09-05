package com.minsu.algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, K를 공백을 기준으로 입력
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 0; // 최소 횟수

        while (true) { // 계속 반복
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int target = (N / K) * K; // target: 나누어 떨어질 수 있게 만든 수
            result += (N - target); // 횟수 증가
            N = target; // N을 target으로
            // N이 K보다 작을 때 반복문 탈출
            if (N < K) break;
            result += 1;
            // K로 나누기
            N /= K;
        }
        // 마지막 남은 수에 1 빼기
        result += (N - 1);
        System.out.println(result);
    }
}
