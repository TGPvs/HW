package hw6p1jenerics;

public class Cup<T> {
 T liquid;
 public void fill(T liquid) {
     this.liquid = liquid;
     System.out.println("This cup is filled with " + liquid );
 }
}

