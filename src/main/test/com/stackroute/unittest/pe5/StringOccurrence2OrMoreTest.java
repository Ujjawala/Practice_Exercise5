package com.stackroute.unittest.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
public class StringOccurrence2OrMoreTest {
    StringOccurrence2OrMore stringOccurrence2OrMore;

    @Before
    public void setUp() throws Exception {
        stringOccurrence2OrMore = new StringOccurrence2OrMore();
    }

    @Test
    public void stringOccurence() {
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        String[] strings = {"a","b","c","d","a","c","c"};
        assertThat(stringOccurrence2OrMore.stringOccurence(strings), is(expected));
        assertEquals(stringOccurrence2OrMore.stringOccurence(strings), expected);
    }

    @Test
    public void stringOccurenceFailure() {
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", true);
        String[] strings = {"a","b","c","d","a","c","c"};
        assertNotEquals(stringOccurrence2OrMore.stringOccurence(strings), expected);
    }

    @Test
    public void stringOccurenceSize() {
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        String[] strings = {"a","b","c","d","a","c","c"};
        assertThat(stringOccurrence2OrMore.stringOccurence(strings).size(), is(4));
    }

    @Test
    public void stringOccurenceSizeFailure() {
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        String[] strings = {"a","b","c","d","a","c","c", "e"};
        assertNotEquals(stringOccurrence2OrMore.stringOccurence(strings).size(), 4);
    }

    @Test
    public void stringOccurenceTrue() {
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        String[] strings = {"a","b","c","d","a","c","c"};
        assertTrue(stringOccurrence2OrMore.stringOccurence(strings).containsKey("a"));
        assertTrue(stringOccurrence2OrMore.stringOccurence(strings).containsKey("d"));
    }

    @Test
    public void stringOccurenceFalse() {
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        String[] strings = {"a","b","c","d","a","c","c"};
        assertFalse(stringOccurrence2OrMore.stringOccurence(strings).containsKey("f"));
    }

    @Test
    public void setStringOccurrenceNull() {
        String[] strings = {};
        assertNull(stringOccurrence2OrMore.stringOccurence(strings));
    }

    @Test
    public void setStringOccurrenceNotNull() {
        String[] strings = {"a","b","c","d","a","c","c"};
        assertNotNull(stringOccurrence2OrMore.stringOccurence(strings));
    }
}