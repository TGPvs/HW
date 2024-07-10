package hw6p1jenerics;

public class Oil implements ILiquid {
    @Override
    public void pourOut() {
        System.out.println("Oil выливается");
    }
}
