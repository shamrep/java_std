package lambda_and_streams.streams_test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
  public static void main(String[] args) {
    List<String> words =
            List.of("john", "jack", "phillip", "antoni", "pit");
    List<String> result = words.stream()
            .filter(w -> w.length() > 4)
            .map(w -> w.substring(3))
            .toList();
    System.out.println(result);


    List<String> words1 =
            List.of("john", "jack", "phillip", "antoni", "pit");
    List<Integer> result1 = words.stream()
            .filter(w -> w.compareTo("melani") > 0)
            .map(w -> w.length())
            .toList();
    System.out.println(result1);

    List<String> words3 =
            List.of("john", "jack", "phillip", "antoni", "pit");
    List<Character> result3 = words.stream()
            .filter(w -> w.matches("[a-p]+"))
            .map(w -> w.charAt(2))
            .toList();
    System.out.println(result3);

    var stream1 = Stream.iterate("", s -> s+= 77);
    var stream2 = Arrays.stream(new int[]{1, 2, 3});
//    var stream3 = Stream.generate({1,2,3});

    //result = 9
    var result5 = IntStream.range(1, 4).map(n -> ++n).sum();
    System.out.println(result5);

    var i = 1;
    var result6 = IntStream.generate(() -> 5).limit(3).sum();
    System.out.println(result6);

//    List<String> stringList =

  }


}