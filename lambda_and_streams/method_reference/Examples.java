package lambda_and_streams.method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;

public class Examples {
  public static void main(String[] args) {
    Map<String, String> names = Map.of(
            "Johnny", "Mnemonic",
            "Rick", "Deckard",
            "Kevin", "Flynn");

// Imperative style
    for (Map.Entry<String, String> entry : names.entrySet()) {
      String firstname = entry.getKey();
      String lastname = entry.getValue();
      System.out.println(firstname + " " + lastname);
    }

    class MyBiConsumer implements BiConsumer<String, String> {
      @Override
      public void accept(String s, String s2) {

      }
    }

// Functional style{
//
//    names.forEach((firstname, lastname) ->
//            System.out.println(firstname + " " + lastname));

    Collection<String> names1 = new ArrayList<>(Arrays.asList("Mnemonic", "Deckard", "Flynn"));
    names1.removeIf(name -> name.length() > 5);
    names1.forEach(System.out::println);
  }
}
