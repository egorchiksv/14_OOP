package com.exemple.uni.model.impl;

import com.exemple.uni.model.StudentGroup;

import java.util.List;

public class Stream {
    private List<StudentGroup> studentGroups;

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public String toString() {
        return "Stream{" +
                studentGroups +
                '}';
    }
}
