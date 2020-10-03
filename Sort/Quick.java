package com.minsu.algorithm;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8}; //0부터9까지 랜덤 배치

        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return; //원소가 1개인 경우
        int pivot = start;
        int left = start + 1;
        int right = end;
        while (left <= right) { //서로 엇갈리지 않을 동안 반복
            while (left <= end && arr[left] <= arr[pivot]) left++; //피벗보다 큰 데이터 찾을때까지
            while (right > start && arr[right] >= arr[pivot]) right--;//피벗보다 작은 데이터 찾을때까지
            //엇갈린 경우
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            //엇갈리지 않은 경우
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        //분할 이후 각각(왼쪽, 오른쪽) 재귀 함수로 수행 반복
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }
}

