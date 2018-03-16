package oop.Task02_2.items;

public class Eraser implements OfficeItem {

    private final int price = 2;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Eraser";
    }
}
