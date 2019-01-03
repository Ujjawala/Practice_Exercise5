package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public static void main(String[] arg) {
//        List<Student> studentList = new ArrayList<>();
//        Student student1 = new Student();
//        student1.setName("ujjawala");
//        student1.setAge(24);
//        student1.setId(1);
//        studentList.add(student1);
//        Student student2 = new Student();
//        student2.setName("anju");
//        student2.setAge(23);
//        student2.setId(2);
//        studentList.add(student2);
//        Student student3 = new Student();
//        student3.setName("shubhi");
//        student3.setAge(24);
//        student3.setId(3);
//        studentList.add(student3);
//        Student student4 = new Student();
//        student4.setName("anj");
//        student4.setAge(25);
//        student4.setId(4);
//        studentList.add(student4);
//        Collections.sort(studentList, new StudentSorter().reversed());
//        for (Student s: studentList) {
//            System.out.println(s.getAge()+s.getName()+s.getId());
//        }
    }
    public List<Student> sortStudent() {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setName("ujjawala");
        student1.setAge(24);
        student1.setId(1);
        studentList.add(student1);
        Student student2 = new Student();
        student2.setName("anju");
        student2.setAge(23);
        student2.setId(2);
        studentList.add(student2);
        Student student3 = new Student();
        student3.setName("shubhi");
        student3.setAge(24);
        student3.setId(3);
        studentList.add(student3);
        Student student4 = new Student();
        student4.setName("anj");
        student4.setAge(25);
        student4.setId(4);
        studentList.add(student4);
        Collections.sort(studentList, new StudentSorter());
        return studentList;
    }
}
