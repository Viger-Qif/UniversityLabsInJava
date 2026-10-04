package laba2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();

        double y = Math.pow((Math.pow(Math.sin(x), 2)) +
                Math.pow( Math.cos(x) - (Math.pow(Math.sin(x*x), 4) + x*x) / x -
                ( (Math.pow(x, 4) + 0.96*x - 1) / (Math.pow(x, 4) + Math.pow(x, 3) - 2.37) ), 3) +
                Math.sqrt(x), 4);

        System.out.println(y);
    }
}
