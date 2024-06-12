import cat.Animal;
import cat.Dog;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik",
                LocalDate.of(1990, 1, 1),
                new Owner());
        
        Animal animal1 = new Animal(LocalDate.now(), "cat.Animal-1");

        System.out.println(barsik.getName());

        barsik.setName("Tom");

//        System.out.println(barsik.getName());
        System.out.println(barsik.getType());

        Dog dog1 = new Dog("cat.Dog-1", LocalDate.now());
        System.out.println(dog1.getType());

        Owner o = new Owner();

        Cat animalCat = new Cat("Cat-1", LocalDate.now(), o);
        Animal animalDog = new Dog("Dog-1", LocalDate.now());

        System.out.println(animalCat.getOwner());

        List<Animal> animals = List.of(animal1, animalDog, barsik);
        System.out.println(animals);
    }
}