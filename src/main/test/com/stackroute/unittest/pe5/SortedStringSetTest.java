package com.stackroute.unittest.pe5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SortedStringSetTest {
    SortedStringSet sortedStringSet;
    List<String> arr;
    @Before
    public void setUp() {
        sortedStringSet = new SortedStringSet();
        arr = new ArrayList<>();
        arr.add("Harry");
        arr.add("Olive");
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Eugene");
    }
    @Test
    public void sortedString() {
        List<String> expected = new ArrayList<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        Assert.assertEquals(expected, sortedStringSet.sortedString(arr));
        Assert.assertNotNull(sortedStringSet.sortedString(arr));
    }
}