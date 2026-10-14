package laba3;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Task1 {
    public static void main(String[] args) {
        double y = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 'x': ");
        float x = sc.nextFloat();

        if (x <= 0) {
            y = 1.5 * x + 4;
        }
        else if (x > 5 && x < 10) {
            y = -pow(x, 5) + pow(x, 4) - pow(x, 3) - 2;
        }
        else if (x >= 0 && x <= 5) {
            y = sin(x+2) / (10-x);
        }
        else {
            System.out.println("Число не входит в нужный диапазон");
            return;
        }
        System.out.println("y = " + y);
    }
}
