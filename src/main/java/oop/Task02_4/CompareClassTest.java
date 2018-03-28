package oop.Task02_4;

import oop.Task02_3.interfaces.OfficeItem;
import oop.Task02_3.*;
import java.util.Comparator;

public class CompareClassTest {
    public static Comparator<OfficeItem> priceComparator = (o1, o2) -> o1.getPrice() - o2.getPrice();

    public static Comparator<OfficeItem> nameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

    public static void main(String[] args) {
        StarterKit starterKit = new StarterKit();
        System.out.println(starterKit.itemList);
        starterKit.itemList.sort(priceComparator);
        System.out.println(starterKit.itemList);
        starterKit.itemList.sort(nameComparator);
        System.out.println(starterKit.itemList);
    }
}
