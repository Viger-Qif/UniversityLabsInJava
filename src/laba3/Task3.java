package laba3;

public class Task3 {
    public static void main(String[] args) {
        boolean[] values = {false, true};

        for (boolean x : values) {
            for (boolean y : values) {
                for (boolean z : values) {
                    boolean i1 = !(x||y)&&(!x||!z);
                    boolean i2 = !(!x&&y)||(x&&!z);
                    boolean i3 = x||!y&&!(x||!z);
                    System.out.println("x = " + x + " y = " + y + " z = " + z +
                            " | i1 = " + i1 + " i2 = " + i2 + " i3 = " + i3);
                }
            }
        }
    }
}
