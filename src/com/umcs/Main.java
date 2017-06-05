package com.umcs;

import com.umcs.domain.Lecture;
import com.umcs.domain.Student;
import com.umcs.domain.Teacher;
import com.umcs.domain.University;
import com.umcs.enums.LectureMaterial;

import static com.umcs.enums.ScienceField.*;

public class Main {

    public static void main(String[] args) {
        University university = University.getInstance();
        Lecture java = new Lecture(JAVA);
        Teacher cppTeacher = new Teacher("Jan", CPP);
        Teacher javaTeacher = new Teacher("Jacek", JAVA);
        Teacher mathTeacher = new Teacher("Adam", MATH);
        Student wojtek = new Student("Wojtek");
        Student andzia = new Student("Andzia");
        Student michal = new Student("Michał");
        Student krzysiek = new Student("Krzysiek");
        Student tomek = new Student("Tomek");
        university.add(cppTeacher);
        university.add(javaTeacher);
        university.add(mathTeacher);
        university.add(wojtek);
        university.add(andzia);
        university.add(michal);
        university.add(krzysiek);
        university.add(tomek);

        university.login(tomek);
        university.login(javaTeacher);
        university.login(cppTeacher);
        university.login(andzia);
        university.login(wojtek);
        university.logout(tomek);

        java.signUp(tomek);
        java.signUp(andzia);
        java.signUp(wojtek);
        java.signUp(michal);
        java.signUp(krzysiek);
        java.signUp(javaTeacher);
        university.logout(cppTeacher);
        java.signUp(cppTeacher);
        java.addMaterials(javaTeacher, LectureMaterial.VIDEOCLIP);
        java.addMaterials(cppTeacher, LectureMaterial.DRAWING);
        System.out.println(university);
    }
}
