package hw6p1jenerics.drinkable;

import hw6p1jenerics.actions.ILiquid;

public class Oil implements ILiquid {
    @Override
    public void pourOut() {
        System.out.println("Oil выливается");
    }
}
