package com.example.JSPStudy.Daily;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class Jan14 {

    // @PostConstruct
    // public void example01(int age) {
    //     System.out.println(age); // @PostConstruct가 붙은 메서드에는 매개변수가 들어갈 수 없다
    // }

    // @PostConstruct
    // private void example02() {
    //     int a = 10;
    //     int s = 100;
    //     Jan14 ap = new Jan14();
    //     ap.use(a, s);
    //     System.out.println("아잉" + a); // 아잉10
    //     System.out.println("아잉아잉" + s); // 아잉아잉100
    // }
    // void use(int a, int s) {
    //     a = a + 1;
    //     s = s + 1000;
    //     System.out.println("뿌잉" + a); // 뿌잉11
    //     System.out.println("뿌잉뿌잉" + s); // 뿌잉뿌잉1100
    // }

    // @PostConstruct
    // private void example03() {
    //     int n[] = new int[2];
    //     n[0] = 100;
    //     n[1] = 200;
    //     Jan14 p = new Jan14();
    //     p.use(n);
    //     System.out.println(n[0]); // 1
    //     System.out.println(n[1]); // 121
    // }
    // void use(int[] n) {
    //     n[0] = 1;
    //     n[1] = 121;
    //     System.out.println(n[0] + n[1]); // 122
    // }

    // @PostConstruct
    // private void example04() {
    //     String q = "카트";
    //     Jan14 aa = new Jan14();
    //     aa.q += q + "는재밌다";
    //     System.out.println(aa.q);
        
    
    // }

    @PostConstruct
    private void example05() {
        J14 x = new J14();
        x.name = "페라리";
        x.age = 130;
        System.out.println(x.name + "는 올해로 " + x.age + "살이래"); // 페라리는 올해로 130살이래
    }
    @PostConstruct
    private void example06() {
        int qkqh = 34;
        int ajdcjddl = 21;
        Jan14 qq = new Jan14();
        qq.use(qkqh, ajdcjddl);
        System.out.println(qkqh + ajdcjddl); // 55
    }
    void use(int qkqh, int ajdcjddl) {
        qkqh = qkqh + 100;
        ajdcjddl = ajdcjddl + 10;
        System.out.println(qkqh); // 134
    }
}
