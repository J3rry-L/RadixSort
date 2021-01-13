public class Radix{
  public static int nth(int n, int col){
    long nLong = n;
    return (int) (Math.abs(nLong) / ((int) Math.pow(10, col)) % 10);
  }
  public static int length(int n){
    if (n == 0){
      return 1;
    }
    else{
      return((int) Math.log10(Math.abs(n)) + 1);
    }
  }
  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
    for (int i = 0; i < buckets.length; i++){
      original.extend(buckets[i]);
    }
  }
  public static void radixSortSimple(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    int maxLength = 0;
    for (int i = 0; i < 10; i++){
      buckets[i] = new SortableLinkedList();
    }
    while(data.size() > 0){
      if(length(data.get(0)) > maxLength){
        maxLength = length(data.get(0));
      }
      buckets[nth(data.get(0), 0)].add(data.get(0));
      //System.out.println(buckets[nth(data.get(0), 0)]);
      data.remove(0);
    }
    merge(data, buckets);
    for (int i = 1; i < maxLength; i++){
      while(data.size() > 0){
        buckets[nth(data.get(0), i)].add(data.get(0));
        //System.out.println(buckets[nth(data.get(0), i)]);
        data.remove(0);
      }
      merge(data, buckets);
    }
  }
  public static void radixSort(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    SortableLinkedList[] signs = new SortableLinkedList[2];
    int maxLength = 0;
    for (int i = 0; i < 10; i++){
      buckets[i] = new SortableLinkedList();
    }
    for (int i = 0; i < 2; i++){
      signs[i] = new SortableLinkedList();
    }
    while(data.size() > 0){
      if(length(data.get(0)) > maxLength){
        maxLength = length(data.get(0));
      }
      buckets[nth(data.get(0), 0)].add(data.get(0));
      //System.out.println(buckets[nth(data.get(0), 0)]);
      data.remove(0);
    }
    merge(data, buckets);
    for (int i = 1; i < maxLength; i++){
      while(data.size() > 0){
        buckets[nth(data.get(0), i)].add(data.get(0));
        //System.out.println(buckets[nth(data.get(0), i)]);
        data.remove(0);
      }
      merge(data, buckets);
    }
    while(data.size() > 0){
      if(data.get(0) > 0){
        signs[1].add(data.get(0));
        //System.out.println(signs[1]);
      }
      else{
        signs[0].add(0, data.get(0));
        //System.out.println(signs[0]);
      }
      data.remove(0);
    }
    merge(data, signs);
  }
}
