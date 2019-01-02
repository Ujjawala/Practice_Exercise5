package com.stackroute.unittest.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
public class StringOccurrence2OrMoreTest {
    StringOccurrence2OrMore stringOccurrence2OrMore = new StringOccurrence2OrMore();
    @Test
    public void stringOccurence() {
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        String[] strings = {"a","b","c","d","a","c","c"};
        assertThat(stringOccurrence2OrMore.stringOccurence(strings), is(expected));
        assertThat(stringOccurrence2OrMore.stringOccurence(strings).size(), is(4));
        assertTrue(stringOccurrence2OrMore.stringOccurence(strings).containsKey("a"));
        assertFalse(stringOccurrence2OrMore.stringOccurence(strings).containsKey("f"));
    }
}