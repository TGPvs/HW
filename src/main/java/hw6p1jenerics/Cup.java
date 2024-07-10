package hw6p1jenerics;

public class Cup<T extends ILiquid> {
    private T content;

    public Cup(T content) {
        this.content = content;
    }

    public void pour() {
        if (content != null) {
            content.pourOut();
            content = null;
        } else {
            System.out.println("Чашка пуста.");
        }
    }

    public void fill(T newContent) {
        content = newContent;
        System.out.println("Чашка заполнена " + newContent.getClass().getSimpleName() + ".");
    }
}