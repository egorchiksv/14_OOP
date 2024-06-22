package com.exemple.uni.model.impl;

import com.exemple.uni.model.User;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {

    private final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastname) {
        super(id, name, lastname);
    }

    public void addGroupID(int id) {// убрать в TeacherService
        groups.add(id);
    }
}
