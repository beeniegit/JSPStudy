package com.example.JSPStudy.Daily;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class Jan12 {

    @PostConstruct
    private void example01() {
        int n = 1;
        int m = 2;
        System.out.println(n + m);
        System.out.println(n - m);
        System.out.println(n * m);
        System.out.println(n / m);
        System.out.println(n % m);
    }

    @PostConstruct
    private void example02() {
        int m = 1;
        int z = 20;
        System.out.println(m++);
        System.out.println(z--);
        System.out.println(++z);
        System.out.println(--m);
    }

    @PostConstruct
    private void example03() {
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a /= b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        
    }

    @PostConstruct
    private void example04() {
        String fake = "김철수";
        String trick = "김민식";
        String trap = "김도빈";

        if (fake == "김철수") {
            System.out.println(1);
        } else if (trick == "김민식") {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }

    @PostConstruct
    private void example05() {
        String goldenglove = "강두";
        String worldsFmvp = "오탄희";
        String coach = "메갓";

        if (goldenglove == "강두") {
            System.out.println("크리스티아누호날두");
        } if (worldsFmvp == "오탄희") {
            System.out.println("오타니쇼헤이");
        } else {
            System.out.println("리오넬메시");
        }
    }
    
    @PostConstruct
    private void example06() {
        int a = 1;
        int b = 2;
        if ((a > b) || (a == 1)) {
            System.out.println("21");
        } else {
            System.out.println("zzz");
        }

        if ((a < b) || (b == 1)) {
            System.out.println("코렉또");
        } else {
            System.out.println("땡");
        }
    }

    @PostConstruct
    private void example07() {
        String name = "김도빈";

        switch (name) {
            case "김도빈" : 
            System.out.println("내 이름은 김도빈입니다.");
            
            case "호날두" : 
            System.out.println("그게내이름아님");

            default : 
            System.out.println("개똥벌레");
        }
    }

    @PostConstruct
    private void example08() {
        for (int a = 1; a < 10; a += 10) {
            System.out.println(a);
        }
        for (int b = 0; b < 100; b++) {
            System.out.println(b);
        }
    }

    @PostConstruct
    private void example09() {
        int d = 30;
        int i = 1;
        while(true) {
            if (i == d) break;
            System.out.println(i);
            i++;
        }
    }

    @PostConstruct
    private void example10() {
        for (int i = 1; i < 102; i++) {
            if (i == 100) {
                continue;
            }
            System.out.println(i);
        }
    }
}
