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

    SortableLinkedList empty = new SortableLinkedList();
    Radix.radixSortSimple(empty);
    System.out.println(empty);

    SortableLinkedList test1 = new SortableLinkedList();
    test1.add(100000);
    test1.add(10000);
    test1.add(1000);
    test1.add(100);
    test1.add(10);
    test1.add(1);
    test1.add(0);
    Radix.radixSortSimple(test1);
    System.out.println(test1);

    SortableLinkedList test2 = new SortableLinkedList();
    test2.add(100000);
    test2.add(-10000);
    test2.add(1000);
    test2.add(-100);
    test2.add(10);
    test2.add(-1);
    test2.add(0);
    Radix.radixSort(test2);
    System.out.println(test2);

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


    SortableLinkedList list8 = new SortableLinkedList();
    for (int i = 0; i < 10; i++){
      list8.add(rng.nextInt() % 1000);
    }
    //System.out.println(list8);
    start = System.nanoTime();
    Radix.radixSort(list8);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list8);

    SortableLinkedList list9 = new SortableLinkedList();
    for (int i = 0; i < 100; i++){
      list9.add(rng.nextInt() % 1000);
    }
    //System.out.println(list9);
    start = System.nanoTime();
    Radix.radixSort(list9);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list9);

    SortableLinkedList list10 = new SortableLinkedList();
    for (int i = 0; i < 1000; i++){
      list10.add(rng.nextInt() % 1000);
    }
    //System.out.println(list10);
    start = System.nanoTime();
    Radix.radixSort(list10);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list10);

    SortableLinkedList list11 = new SortableLinkedList();
    for (int i = 0; i < 10000; i++){
      list11.add(rng.nextInt() % 1000);
    }
    //System.out.println(list11);
    start = System.nanoTime();
    Radix.radixSort(list11);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list11);

    SortableLinkedList list12 = new SortableLinkedList();
    for (int i = 0; i < 100000; i++){
      list12.add(rng.nextInt() % 1000);
    }
    //System.out.println(list12);
    start = System.nanoTime();
    Radix.radixSort(list12);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list12);

    SortableLinkedList list13 = new SortableLinkedList();
    for (int i = 0; i < 1000000; i++){
      list13.add(rng.nextInt() % 1000);
    }
    //System.out.println(list13);
    start = System.nanoTime();
    Radix.radixSort(list13);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list13);

    SortableLinkedList list14 = new SortableLinkedList();
    for (int i = 0; i < 10000000; i++){
      list14.add(rng.nextInt() % 1000);
    }
    //System.out.println(list14);
    start = System.nanoTime();
    Radix.radixSort(list14);
    finish = System.nanoTime();
    System.out.println((finish - start) / 1000000.0);
    //System.out.println(list14);

    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list8);
    System.out.println(list9);
  }
}
