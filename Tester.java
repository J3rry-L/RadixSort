import java.util.*;
public class Tester{
  public static void main(String[] args){
    System.out.println(Radix.nth(123,1));
    System.out.println(Radix.nth(-123,1));
    System.out.println(Radix.nth(123,2));
    System.out.println(Radix.nth(-123,2));
    System.out.println(Radix.length(0));
    System.out.println(Radix.length(15));
    System.out.println(Radix.length(-10));
    System.out.println(Radix.length(5112));
    SortableLinkedList list1 = new SortableLinkedList();
    Random rngSeed = new Random();
    int seed = rngSeed.nextInt();
    Random rng = new Random(seed);
    System.out.println(seed);
    for (int i = 0; i < 10; i++){
      list1.add(Math.abs(rng.nextInt() % 1000));
    }
    System.out.println(list1);
    Radix.radixSortSimple(list1);
    System.out.println(list1);
  }
}
