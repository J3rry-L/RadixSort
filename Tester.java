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
    System.out.println("seed: " + seed);
    for (int i = 0; i < 10; i++){
      list1.add(Math.abs(rng.nextInt() % 1000));
    }
    //System.out.println(list1);
    long start = System.nanoTime();
    Radix.radixSortSimple(list1);
    long finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list1);

    SortableLinkedList list2 = new SortableLinkedList();
    for (int i = 0; i < 100; i++){
      list2.add(Math.abs(rng.nextInt() % 1000));
    }
    //System.out.println(list2);
    start = System.nanoTime();
    Radix.radixSortSimple(list2);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list2);

    SortableLinkedList list3 = new SortableLinkedList();
    for (int i = 0; i < 1000; i++){
      list3.add(Math.abs(rng.nextInt() % 1000));
    }
    //System.out.println(list3);
    start = System.nanoTime();
    Radix.radixSortSimple(list3);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list3);

    SortableLinkedList list4 = new SortableLinkedList();
    for (int i = 0; i < 10000; i++){
      list4.add(Math.abs(rng.nextInt() % 1000));
    }
    //System.out.println(list4);
    start = System.nanoTime();
    Radix.radixSortSimple(list4);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list4);

    SortableLinkedList list5 = new SortableLinkedList();
    for (int i = 0; i < 100000; i++){
      list5.add(Math.abs(rng.nextInt() % 1000));
    }
    //System.out.println(list5);
    start = System.nanoTime();
    Radix.radixSortSimple(list5);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list5);

    SortableLinkedList list6 = new SortableLinkedList();
    for (int i = 0; i < 1000000; i++){
      list6.add(Math.abs(rng.nextInt() % 1000));
    }
    //System.out.println(list6);
    start = System.nanoTime();
    Radix.radixSortSimple(list6);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list6);

    SortableLinkedList list7 = new SortableLinkedList();
    for (int i = 0; i < 10000000; i++){
      list7.add(Math.abs(rng.nextInt() % 1000));
    }
    //System.out.println(list7);
    start = System.nanoTime();
    Radix.radixSortSimple(list7);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list7);

    System.out.println(list1);
    System.out.println(list2);

  }
}
