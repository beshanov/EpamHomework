package oop.Task02_3;

import oop.Task02_3.interfaces.PaperStuff;

public class Copybook implements PaperStuff{
    private final String name = "Copybook";
    private final int price = 10;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return name + " " + price + "\n";
    }
}
