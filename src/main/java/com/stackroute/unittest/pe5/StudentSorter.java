package com.stackroute.unittest.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAge() != student2.getAge()) {
            return student1.getAge() - student2.getAge();
        }
        else if (student1.getName().compareTo(student2.getName()) != 0) {
            return student1.getName().compareTo(student2.getName());
        } else {
            return student1.getId() - student2.getId();
        }
    }
}
