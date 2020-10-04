package com.minsu.algorithm;

import java.util.*;

// Comparable 인터페이스는 객체를 정렬하는 데 사용되는 메소드인 compareTo()를 정의
class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    //점수가 낮은 순서
    @Override
    public int compareTo(Student other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //N명의 학생정보를 리스트에 저장
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next(); //공백을 기준으로, nextLine: 라인을 기준으로
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }
        Collections.sort(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getName() + " ");
        }
    }
}

