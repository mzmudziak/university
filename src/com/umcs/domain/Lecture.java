package com.umcs.domain;

import com.umcs.enums.LectureMaterial;
import com.umcs.enums.LoginStatus;
import com.umcs.enums.ScienceField;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private ScienceField scienceField;
    private List<UniversityMember> attendees = new ArrayList<>();
    private List<LectureMaterial> materials = new ArrayList<>();

    @Override
    public String toString() {
        return scienceField.toString() + " " + attendees;
    }

    public Lecture(ScienceField lectureName) {
        this.scienceField = lectureName;
    }

    public void signUp(UniversityMember student) {
        if (LoginStatus.LOGGED_IN.equals(University.getInstance().getMembers().get(student))) {
            this.attendees.add(student);
            System.out.println("JOINED " + this + " - " + student);
        } else {
            System.out.println("CANNOT JOIN " + this + " - " + student + " (not logged in)");
        }
    }

    public void addMaterials(Teacher teacher, LectureMaterial lectureMaterial) {
        if (attendees.contains(teacher)) {
            this.materials.add(lectureMaterial);
            System.out.println("ADDED MATERIALS: " + teacher + " added " + lectureMaterial + " to " + this);
        } else {
            System.out.println("CANNOT ADD MATERIALS: " + teacher + " is not a member of " + this);
        }
    }
}

