package oop.Task02_3;

import oop.Task02_3.interfaces.OfficeItem;
import java.util.ArrayList;
import java.util.List;

public class StarterKit {
    public int count = 1;
    public List<OfficeItem> itemList = new ArrayList<>();

    public StarterKit() {
        addItem(Pen.class, 2);
        addItem(GreyPencil.class, 2);
        addItem(RedPencil.class, 1);
        addItem(Eraser.class, 1);
        addItem(Copybook.class, 1);
        addItem(Calendar.class, 1);
    }

    private void addItem(Class<? extends OfficeItem> clazz, int count) {
        for (int i = 0; i < count; i++)
            try {
                itemList.add(clazz.getConstructor().newInstance());
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
    }
}
