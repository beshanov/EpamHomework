package intro.Task01_3;

import static java.lang.Math.tan;

public class LoopTwo {

    public static double calculateFunc(double x) {
        return tan(2 * x) - 3;
    }

    public void getTable(double a, double b, double step) {
        double x = a;
        while (x < b) {
            System.out.println(x + "    " + calculateFunc(x));
            x += step;
        }
    }

    public static void main(String[] args) {
        LoopTwo loop = new LoopTwo();
        loop.getTable(2.0, 3.0, 0.05);
    }

}
