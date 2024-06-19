package model;

import java.time.LocalDate;

public class Student extends User<Student>{
    private int id;
    private String name;
    private String lastName;
    private LocalDate birthday;

    @Override
    public Student get() {
        return null;
    }
}
