package io.Task04_1;

public class LoopOne {

    private double epsilon = 0.001;
    private double a = 1;

    public double calculate(int n) {
        double a = (double) 1 / ((n + 1) * (n + 1));
        return a;
    }


    public void getTable(int numRaws) {
        for (int i = 0; a > epsilon && i < numRaws; i++) {
            a = calculate(i);
            System.out.println(" № " + i + " " + a);
        }
    }

    public static void main(String[] args) {
        LoopOne loop = new LoopOne();
        loop.getTable(50);
    }
}
