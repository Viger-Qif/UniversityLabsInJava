package laba2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        double s = Math.pow(9+Math.pow(x-y, 2), 1.0/3) / (x*x+y*y+2) -
                Math.exp(Math.abs(x-y))*Math.pow(Math.tan(z), 3);

        System.out.println(s);
    }
}
