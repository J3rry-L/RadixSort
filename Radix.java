public class Radix{
  public static int nth(int n, int col){
    return (Math.abs(n / ((int) Math.pow(10, col))) % 10);
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
}
