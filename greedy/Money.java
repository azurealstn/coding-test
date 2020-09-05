package com.minsu.algorithm;

public class Main {
    public static void main(String[] args) {
        int n = 1260; // 거스름돈
        int cnt = 0; // 최소 갯수
        int[] coinTypes = {500, 100, 50, 10}; // 동전 종류

        for (int i=0; i<coinTypes.length; i++) {
            int coin = coinTypes[i]; // 각 동전을 coin에 담는다.
            cnt += n / coin; // 개수를 구한다.
            n %= coin; // 앞에서 나눈 n의 나머지
        }
        System.out.println(cnt);
    }
}
