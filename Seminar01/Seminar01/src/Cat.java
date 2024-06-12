import cat.Animal;

import java.time.LocalDate;

public class Cat extends Animal {
    Owner owner;


    public Cat(String name, LocalDate birthDate, Owner owner) {
        super(name, birthDate);
        this.owner = owner;
    }

    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

//    @Override //Вызывается класс родителя
//    public String getName() {
//        return "Кошка";
//    }


    public Owner getOwner() {
        return owner;
    }
}
