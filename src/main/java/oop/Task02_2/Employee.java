package oop.Task02_2;

import oop.Task02_2.items.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Employee {
    private String firstName;
    private String secondName;


    private int eraserCount;
    private int penCount;
    private int pencilCount;

    private List<OfficeItem> itemList = new ArrayList<>();

    public Employee(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void addPen(int count) {
        for (int i = 0; i < count; i++) {
            itemList.add(new Pen());
        }
        penCount += count;
        System.out.println(count + " pens were added");
    }

    public void addPencil(int count) {
        for (int i = 0; i < count; i++) {
            itemList.add(new Pencil());
        }
        pencilCount += count;
        System.out.println(count + " pencils were added");
    }

    public void addEraser(int count) {
        for (int i = 0; i < count; i++) {
            itemList.add(new Eraser());
        }
        eraserCount += count;
        System.out.println(count + " erasers were added");
    }

    public void removePen(int numberToRemove) {
        if (numberToRemove <= penCount) {
            int i = 0;
            Iterator<OfficeItem> iter = itemList.iterator();
            while (i < numberToRemove) {
                OfficeItem next = iter.next();
                if (next instanceof Pen) {
                    iter.remove();
                    i++;
                }
            }
            penCount -= numberToRemove;
            System.out.println(i + " pens were removed");
        } else {
            System.out.println("Employee doesn't have so many pens");
        }
    }

    public void removePencil(int numberToRemove) {
        if (numberToRemove <= pencilCount) {
            int i = 0;
            Iterator<OfficeItem> iter = itemList.iterator();
            while (i < numberToRemove) {
                OfficeItem next = iter.next();
                if (next instanceof Pencil) {
                    iter.remove();
                    i++;
                }
            }
            pencilCount -= numberToRemove;
            System.out.println(i + " pencils were removed");
        } else {
            System.out.println("Employee doesn't have so many pencils");
        }
    }

    public void removeEraser(int numberToRemove) {
        if (numberToRemove <= eraserCount) {
            int i = 0;
            Iterator<OfficeItem> iter = itemList.iterator();
            while (i < numberToRemove) {
                OfficeItem next = iter.next();
                if (next instanceof Eraser) {
                    iter.remove();
                    i++;
                }
            }
            eraserCount -= numberToRemove;
            System.out.println(i + " erasers were removed");
        } else {
            System.out.println("Employee doesn't have so many erasers");
        }
    }

    public void showAllItems() {
        System.out.println(firstName + " " + secondName + " has:");
        System.out.printf("%s\n%s\n%s\n",
                "Pens: " + penCount,
                "Pencils: " + pencilCount,
                "Erasers: " + eraserCount);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (OfficeItem item : itemList) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }


}
