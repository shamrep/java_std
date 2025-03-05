package classes.interfaces.pecs;

import java.util.ArrayList;
import java.util.List;

//PECS - PRODUCER EXTENDS CONSUMER SUPPORT

public class Test {

    //? extends Animal
    // Mammal
    // Dog
    // Cat
    public static void read(List<? extends Animal> animals) {

        animals.forEach(System.out::println);
        // compilation error
        // animals.add(new Animal());

        //OK
        animals.add(null);
        animals.getFirst();

    }

    public static void readMammal(List<? extends Mammal> mammals) {

        mammals.getFirst().breathe();
        mammals.getFirst().drinkMilk();

    }

    // ? super Dog - can add Dog and children of Dog
    //Mammal
    //Animal
    public static void write(List<? super Dog> animals) {

        animals.add(new Dog());
        animals.add(new Husky());
        System.out.println(animals.getFirst());

    //  compilation error
    //  animals.getFirst().breathe();

    }

    public static void main(String[] args) {
        // compilation error
        // write(new ArrayList<Husky>());

        //OK
        write(new ArrayList<Animal>());
        write(new ArrayList<Object>());

        List<Animal> animals = new ArrayList<>();
        write(animals);
        System.out.println(animals.size());

    }

}
