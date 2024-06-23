package com.exemple.uni.model;

public class User {
    protected int id;
    protected String name;
    protected String lastname;

    public User(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + ": id = %s, name = %s, lastname = %s", id, name, lastname );
    }

    public int getId(){
        return id;
    }
}
