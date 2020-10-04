package com.minsu.algorithm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        //배열 A의 모든 원소 입력받기
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //배열 B의 모든 원소 입력받기
        Integer[] b = new Integer[n]; //기본타입이 아닌 참조타입으로
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        //배열 A는 오름차순(작은 수부터)
        Arrays.sort(a);

        //배열 B는 내림차순(큰 수부터)
        Arrays.sort(b, Collections.reverseOrder());

        //1번째 인덱스부터 확인하며, 두 배열의 원소를 최대 K번 비교
        for (int i = 0; i < k; i++) {
            //A의 원소가 B원소보다 작은 경우
            if (a[i] < b[i]) {
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            else break;
        }
        //A의 모든 원소의 합
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];
        }
        System.out.println(result);
    }
}

