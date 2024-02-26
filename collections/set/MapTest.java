package collections.set;

import java.util.*;

public class MapTest {
  public static void main(String[] args) {
    Map<Integer, String> hashMap = new HashMap<>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    NavigableMap<Integer, String> navigableMap = new TreeMap<>();

    //output
    //1  one
    //2  three
    hashMap.put(1, "one");
    hashMap.put(2, "two");
    hashMap.put(3, "four");
    hashMap.put(3, "three");
    hashMap.put(null, null);
    hashMap.put(null, "five");

    hashMap.forEach((integer, s) -> System.out.println(integer + "  " + s));
    hashMap.entrySet().stream().forEach(integerStringEntry -> System.out.println(integerStringEntry.getValue()));

    System.out.println(hashMap.get(1));
    System.out.println(hashMap.remove(2));

    hashMap.forEach((integer, s) -> System.out.println(integer + "  " + s));

    System.out.println(hashMap.containsKey(1));
    hashMap.entrySet().stream().forEach(integerStringEntry -> System.out.println(integerStringEntry));

//    System.out.println;

  }
}
