package oop.Task02_2;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Smith");

        emp1.addPen(2);
        emp1.addPencil(2);
        emp1.addEraser(2);

        emp1.showAllItems();
        System.out.println(emp1.getTotalPrice());

        emp1.removePen(3);
        emp1.removePencil(1);
        emp1.removeEraser(1);

        emp1.showAllItems();
        System.out.println(emp1.getTotalPrice());

    }

}
