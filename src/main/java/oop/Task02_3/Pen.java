package oop.Task02_3;

import oop.Task02_3.interfaces.PaperStuff;
import oop.Task02_3.interfaces.ToWrite;

public class Pen implements ToWrite {
    private final String name = "Pen";
    private final int price = 5;

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
        System.out.println("Pen write on " + paper.getName());
    }

    @Override
    public String toString(){
        return name + " " + price;
    }
}
