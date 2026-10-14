package laba3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double y = 0;
        double a = 0;
        double b = 0;
        System.out.println("Введите целочисленное i: ");
        int i = sc.nextInt();

        switch (i) {
            case(1):
                a = 1.37;
                b = 10.21;
                y = ((21.3-b)/Math.sqrt(Math.abs(a-b))) * Math.sin(Math.cos(a));
                break;
            case(2):
                a = 10.5;
                b = 3.257;
                y = Math.sqrt(a*a-b) / a * Math.log(4.3+a*a);
                break;
            case(3): {
                double x = sc.nextDouble();
                if (x > 2 && x < 11)
                    y = -Math.sqrt(x+2.5);
                else if (x <= 2)
                    y = -3.2;
                else
                    y = Math.cos(x+1);
                break;
            }
            default:
                System.out.println("Неверное значение i");
                y = 0;
                break;
        }
        System.out.println("y =" + y);
    }
}
