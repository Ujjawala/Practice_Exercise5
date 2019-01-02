package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Assert.assertThat(keysValuesPair.replaceValues(map).size(), is(4));
        Assert.assertEquals(" ", keysValuesPair.replaceValues(map).get("val1"));

    }
    @Test
    public void checkValues() {
//        System.out.println("data" + keysValuesPair.replaceValues(map).get("val2"));
        Assert.assertEquals(expected.get("val2"), keysValuesPair.replaceValues(map).get("val2"));
    }
}