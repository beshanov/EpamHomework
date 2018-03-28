package oop.Task02_3;

import oop.Task02_3.interfaces.ToErase;

public class Eraser implements ToErase {

    private final String name = "Eraser";
    private final int price = 2;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public void erase(){
        System.out.println("Text is erased");
    }

    @Override
    public String toString(){
        return name + " " + price + "\n";
    }

}
