package com.umcs.domain;

public class Student extends UniversityMember {
    @Override
    public String toString() {
        return this.getName() + " - student";
    }

    public Student(String name) {
        super(name);
    }
}
