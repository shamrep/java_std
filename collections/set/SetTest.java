package collections.set;

import java.util.*;

public class SetTest {
  public static void main(String[] args) {

    // = new HashMap<>();
    // stores unique values
    //static <E> Set<E> of(E e1) {
    //        return new ImmutableCollections.Set12<>(e1);
    //    }
    Set<String> set = new HashSet<>();
    set.add(null);
    set.add("one");
    set.add("two");
    set.add("add");
    set.add(null);

    //exception on null element
    set.stream().forEach(s -> {
      if (s != null) {
        System.out.println(s + " " + s.length());

      }
    });

    System.out.println("set size is " + set.size());

    Set<Integer> setOfIntegers = Set.of(1, 2, 3);
    //Immutable
    //setOfIntegers.add(1);

    Set<Integer> linkedSet = new LinkedHashSet<>();

    linkedSet.add(1);
    linkedSet.add(5);
    linkedSet.add(3);

    linkedSet.stream().forEach(integer -> {
      System.out.println(integer);
    });

    Set<Integer> treeSet = new TreeSet<>();
    treeSet.add(1);
    treeSet.add(20);
    treeSet.add(5);

    treeSet.stream().forEach(integer -> System.out.println(integer));
    NavigableSet<Integer> navigableSet = (NavigableSet<Integer>) treeSet;
    System.out.println(navigableSet.lower(5));

  }
}
