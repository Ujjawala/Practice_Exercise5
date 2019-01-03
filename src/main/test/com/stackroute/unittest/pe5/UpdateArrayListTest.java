package com.stackroute.unittest.pe5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class UpdateArrayListTest {
    private UpdateArrayList updateArrayList;
    private ArrayList<String> expected = new ArrayList<>();
    private ArrayList<String> list = new ArrayList<>();;
    @Before
    public void setUp() {
        updateArrayList = new UpdateArrayList();
//        list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

    }
    @Test
    public void updateList() {
//        expected = new ArrayList<>();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Apple");
//        list.add("Grape");
//        list.add("Melon");
//        list.add("Berry");
        updateArrayList.updateList(list, "Apple", "Kiwi");
        updateArrayList.updateList(list, "Melon", "Mango");
        Assert.assertEquals(expected, list);
        Assert.assertTrue(expected.equals(list));
    }

    @Test
    public void updateListFailure() {
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
        updateArrayList.updateList(list, "Apple", "Melon");
        updateArrayList.updateList(list, "Melon", "Mango");
//        Assert.assertEquals(expected, list);
        Assert.assertFalse(expected.equals(list));
    }


    @Test
    public void emptyList() {
//        list.clear();
        expected.clear();
        Assert.assertEquals(expected.size(), updateArrayList.emptyList(list).size());
    }
}