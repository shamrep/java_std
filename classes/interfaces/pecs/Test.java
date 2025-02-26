package classes.interfaces.pecs;

import java.util.List;

public class Test {

    //? extends Animal
    // Mammal
    // Dog
    // Cat
    public void read(List<? extends Animal> animals) {
        animals.forEach(System.out::println);
// compilation error
//        animals.add(new Animal());


    }

    // ? super Dog
    //Mammal
    //Animal
    public void write(List<? super Dog> animals) {
        animals.add(new Dog());

    }

}
