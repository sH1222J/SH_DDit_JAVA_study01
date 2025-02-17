
package kr.or.ddit.homework10;

import java.util.Scanner;

public class HomeWork10 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork10 obj = new HomeWork10();
        obj.process();
    }

    public void process() {
        System.out.println("반지름 입력 하세요");
        int r = sc.nextInt();
        System.out.println("높이를 입력 하세요");
        int h = sc.nextInt();

        // 원기둥 부피 출력
        Cylinder c1 = new Cylinder(r, h);
        System.out.println(c1); // c1 객체의 정보 출력
    }
}

class Circle {
    int r;
    double area;

    // 반지름을 입력 할때 원의 넓이를 구하시오.
    public Circle(int r) {
        this.r = r;
        this.area = Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Circle [r=" + r + ", area=" + area + "]";
    }
}

class Cylinder {
    int h;
    Circle c;
    double volume;

    // 원, 높이를 입력 받아 부피를 구하시오
    public Cylinder(int r, int h) {
        this.h = h;
        this.c = new Circle(r);
        this.volume = c.area * h;
    }

    @Override
    public String toString() {
        return "Cylinder [h=" + h + ", c=" + c + ", volume=" + volume + "]";
    }
}

