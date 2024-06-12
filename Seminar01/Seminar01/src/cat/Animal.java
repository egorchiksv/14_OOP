package cat;

import java.time.LocalDate;

public class Animal {

    protected String name;
    protected LocalDate birthDate;

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Animal(LocalDate a4gt4t, String ragt) {
        this.name = ragt;
        this.birthDate = a4gt4t;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
