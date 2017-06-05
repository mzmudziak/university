package com.umcs.domain;

import com.umcs.enums.LoginStatus;

import java.util.HashMap;
import java.util.Map;

import static com.umcs.enums.LoginStatus.LOGGED_IN;
import static com.umcs.enums.LoginStatus.LOGGED_OUT;

public class University {
    private static University instance;
    private Map<UniversityMember, LoginStatus> members = new HashMap<>();

    private University() {
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public Map<UniversityMember, LoginStatus> getMembers() {
        return this.members;
    }

    public void add(UniversityMember member) {
        this.members.put(member, LOGGED_OUT);
    }

    public void login(UniversityMember member) {
        this.members.put(member, LOGGED_IN);
        System.out.println(this.members.get(member) + ": " + member);
    }

    public void logout(UniversityMember member) {
        this.members.put(member, LOGGED_OUT);
        System.out.println(this.members.get(member) + ": " + member);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (Map.Entry<UniversityMember, LoginStatus> m : members.entrySet()) {
            sb
                    .append("    ")
                    .append(m.getKey())
                    .append(": ")
                    .append(m.getValue())
                    .append("\n");
        }
        return "University: " + sb.toString();
    }
}
