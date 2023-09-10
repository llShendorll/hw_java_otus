package hw.otus.generic.box;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Items>  {
    private List<T> items = new ArrayList<>();

    public List<T> getItems() {
        return items;
    }
    public int weight() {
        return items.stream().mapToInt(T::getWeight).sum();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public boolean compare(Box<? extends Items> box) {
        if (box == null) {
            return false;
        }
        return this.weight() == box.weight();
    }

    public void shift(Box<? super T> newBox) {
        System.out.println(this);
        System.out.println(newBox);
        if (newBox != this && newBox != null) {
            for (T oldItem: getItems()) {
                newBox.addItem(oldItem);
            }
            items.clear();
        }
    }
}

