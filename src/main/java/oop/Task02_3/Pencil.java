package oop.Task02_3;

import oop.Task02_3.interfaces.*;
public abstract class Pencil implements ToWrite {
    private final String name = "Pencil";
    private final int price = 3;
    protected String color;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public void write(PaperStuff paper){
        System.out.println("Pencil draw on " + paper.getName() + " with" + color + " color");
    }

    @Override
    public String toString(){
        return name + " " + price + " " + color + "\n";
    }
}
