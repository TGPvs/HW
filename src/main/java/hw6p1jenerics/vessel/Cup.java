package hw6p1jenerics.vessel;

import hw6p1jenerics.actions.ILiquid;

public class Cup<T extends ILiquid> {
    private T contains;

    public Cup(T contains) {
        this.contains = contains;
    }

    public void pour() {
        if (contains != null) {
            contains.pourOut();
            contains = null;
        } else {
            System.out.println("Чашка пуста.");
        }
    }

    public void fill(T newContains) {
        contains = newContains;
        System.out.println("Чашка заполнена " + newContains.getClass().getSimpleName() + ".");
    }
}