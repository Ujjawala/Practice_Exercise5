package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.hamcrest.CoreMatchers.is;
public class KeysValuesPairTest {
    KeysValuesPair keysValuesPair = new KeysValuesPair();
    Map<String, String> expected;
    Map<String, String> map;
    @Before
    public void setUp() {
        expected = new TreeMap<>();
        expected.put("val1", " ");
        expected.put("val2", "java");
        expected.put("val3", "c++");
        expected.put("val4", "c");
        map = new TreeMap<>();
        map.put("val1", "java");
        map.put("val2", "c++");
        map.put("val3", "c");
        map.put("val4", "c#");
    }

    @After
    public void tearDown() {
        expected = null;
        map = null;
    }

    @Test
    public void replaceValues() {
        Assert.assertThat(keysValuesPair.replaceValues(map), is(expected));
    }

    @Test
    public void replaceValuesSize() {
        Assert.assertThat(keysValuesPair.replaceValues(map).size(), is(4));
    }

    @Test
    public void replaceValuesSizeFailure() {
        Assert.assertNotEquals(keysValuesPair.replaceValues(map).size(), 5);
    }

    @Test
    public void checkValues() {
        Map<String, String> actual = keysValuesPair.replaceValues(map);
        Assert.assertEquals(expected.get("val1"), actual.get("val1"));
        Assert.assertEquals(expected.get("val2"), actual.get("val2"));
    }

    @Test
    public void checkValuesFailure() {
        Map<String, String> actual = keysValuesPair.replaceValues(map);
        Assert.assertNotEquals("java", actual.get("val1"));
        Assert.assertNotEquals("c++", actual.get("val2"));
    }

    @Test
    public void replaceValuesNull() {
        Map<String, String> map = new HashMap<>();
        Assert.assertNull(keysValuesPair.replaceValues(map));
    }
    @Test
    public void replaceValuesNotNull() {
        Assert.assertNotNull(keysValuesPair.replaceValues(map));
    }
}