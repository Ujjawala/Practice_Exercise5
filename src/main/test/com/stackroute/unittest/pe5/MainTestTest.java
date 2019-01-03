package com.stackroute.unittest.pe5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class MainTestTest {
    private MainTest mainTest;
    private List<Student> expected;

    @Before
    public void setUp() throws Exception {
        mainTest = new MainTest();
        expected = new ArrayList<>();
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
    }

    @Test
    public void sortStudent() {
        Collections.sort(expected, new StudentSorter());
        assertEquals(expected.toString(), mainTest.sortStudent().toString());
//        assertThat(mainTest.sortStudent(), is(4));
    }

    @Test
    public void sortStudentSize() {
        Collections.sort(expected, new StudentSorter());
//        assertEquals(expected.toString(), mainTest.sortStudent().toString());
        Assert.assertThat(mainTest.sortStudent().size(), is(4));
    }

    @Test
    public void sortStudentNotNull() {
        assertNotNull(mainTest.sortStudent().toString());
    }
}