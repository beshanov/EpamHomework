package oop.Task02_2.items;

public class Pen implements OfficeItem {

    private final int price = 10;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pen";
    }
}
