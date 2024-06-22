package com.exemple.uni.model.impl;

import com.exemple.uni.model.User;

public class Student extends User {

    int groupId;

    public Student(int id, String name, String lastname, int groupId) {
        super(id, name, lastname);
        this.groupId = groupId;
    }
}
