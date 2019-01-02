package com.stackroute.unittest.pe5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
public class MainTestTest {
    MainTest mainTest = new MainTest();
    @Test
    public void sortStudent() {
        List<Student> expected = new ArrayList<>();
        Student student1 = new Student();
        student1.setName("ujjawala");
        student1.setAge(24);
        student1.setId(1);
        expected.add(student1);
        Student student2 = new Student();
        student2.setName("anju");
        student2.setAge(23);
        student2.setId(2);
        expected.add(student2);
        Student student3 = new Student();
        student3.setName("shubhi");
        student3.setAge(24);
        student3.setId(3);
        expected.add(student3);
        Student student4 = new Student();
        student4.setName("anj");
        student4.setAge(25);
        student4.setId(4);
        expected.add(student4);
        assertThat(mainTest.sortStudent(), is(expected));
        assertThat(mainTest.sortStudent(), is(4));
    }
}