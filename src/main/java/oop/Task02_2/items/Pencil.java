package oop.Task02_2.items;

public class Pencil implements OfficeItem {

    private final int price = 5;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pencil";
    }
}