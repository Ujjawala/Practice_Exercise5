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
    public void setUp() throws Exception {
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
    }

    @Test
    public void sortedStringFailure() {
        List<String> expected = new ArrayList<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("John");
        Assert.assertNotEquals(expected, sortedStringSet.sortedString(arr));
    }

    @Test
    public void sortedStringTrue() {
        List<String> expected = new ArrayList<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        Assert.assertTrue(expected.equals(sortedStringSet.sortedString(arr)));
    }

    @Test
    public void sortedStringFalse() {
        List<String> expected = new ArrayList<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("John");
        Assert.assertFalse(expected.equals(sortedStringSet.sortedString(arr)));
    }

    @Test
    public void sortedStringNotNull() {
        List<String> expected = new ArrayList<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        Assert.assertNotNull(sortedStringSet.sortedString(arr));
    }

    @Test
    public void sortedStringNull() {
        List<String> array = new ArrayList<>();
        Assert.assertNull(sortedStringSet.sortedString(array));
    }
}