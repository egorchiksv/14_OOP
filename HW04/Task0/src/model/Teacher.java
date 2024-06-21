package model;

public class Teacher extends User{

    public Teacher (int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Integer getTeacherId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void lastname(String lastname) {
        this.lastName = lastname;
    }

    @Override
    public String toString() {
        return String.format("Teacher [id=%d, name=%s, lastName=%s]", id, name, lastName);
    }
}
