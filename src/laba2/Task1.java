package laba2;

public class Task1 {
    public static void main(String[] args) {
        float a = 3.5f;
        float b = -2.1f;
        float A = 0.1f;

        double y1, y2, z1, z2;

        y1 = (a*a-b*b) / (a-b) - (Math.pow(a, 3) - Math.pow(b, 3)) / (a*a - b*b);

        y2 = a*b / (a+b);

        z1 = Math.cos(2*A) / (Math.pow(1.0/Math.tan(A), 2) - Math.pow(Math.tan(A), 2));

        z2 = 0.25 * Math.pow(Math.sin(2*A), 2);

        System.out.println(y1);
        System.out.println(y2);
        System.out.println(z1);
        System.out.println(z2);
    }
}
