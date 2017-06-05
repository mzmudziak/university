package com.umcs.domain;

import com.umcs.enums.ScienceField;

public class Teacher extends UniversityMember {
    private ScienceField field;

    public Teacher(String name, ScienceField field) {
        super(name);
        this.field = field;
    }

    @Override
    public String toString() {
        return this.getName() + " - teacher of " + this.field;
    }
}
