package oop.Task02_1;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen(39, 10, "aaa");
        Pen pen2 = new Pen(39, 10, "aaa");
        Pen pen3 = new Pen(29, 8, "bbb");

        System.out.println(pen1.equals(pen1));
        System.out.println(pen1.equals(pen2));
        System.out.println(pen2.equals(pen1));
        System.out.println(pen1.equals(pen3));
        System.out.println(pen2.equals(pen3));

        System.out.println(pen1.hashCode());
        System.out.println(pen2.hashCode());
        System.out.println(pen3.hashCode());

        System.out.println(pen1.toString());
    }
}
