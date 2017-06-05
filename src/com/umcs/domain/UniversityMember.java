package com.umcs.domain;

public class UniversityMember {
    public UniversityMember(String name) {
        this.name = name;
    }

    private String name;

    public UniversityMember() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
