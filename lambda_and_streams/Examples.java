package lambda_and_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Examples {

  Predicate<String> p = s -> {return s.equals(s);};
  Runnable r = new Runnable() {
    @Override
    public void run() {

    }
  };

  public static void main(String[] args) {
    Examples examples = new Examples();
    Thread t = new Thread(examples.r);

    List<String> animals = new ArrayList<>();
    animals.add("dog");
    animals.add("cat");
    animals.add("mouse");
    animals.add("giraffe");

    List<String> longNames = animals.stream().filter(s -> s.length() >= 3).collect(Collectors.toList());
    longNames.forEach(s -> System.out.println(s));


    record Person(int id, String name) {
    }

    // code fragment
    List<Person> persons = List.of(new Person(5, "jack"),
            new Person(7, "john"),
            new Person(3, "kurt"),
            new Person(1, "arnold")
    );
    Predicate<Integer> is = i -> i >= 3;
    for (Person person : persons) {
      System.out.print(is.test(person.id()) + " ");
    }

    List<Integer> ints = new ArrayList<>();
    int number = 1;
//    (ints.get(0))++;
    Integer i = Integer.valueOf(10);
    i++;

//    Consumer<List<Integer>> consumer = o -> ints.get(number);

//    final List<Integer> ints = new ArrayList<>();
//    Consumer<List<Integer>> consumer = o -> ints = new ArrayList<>();
  }
}
