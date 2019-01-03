package com.stackroute.unittest.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WordFrequencyTest {
    WordFrequency wordCount;

    @Before
    public void setUp() throws Exception {
        wordCount = new WordFrequency();
    }

    @Test
    public void wordCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
        assertThat(wordCount.wordCount("one one -one_two,,three,one @three*one?two"), is(expected));
    }

    @Test
    public void wordCountSize() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
        assertThat(wordCount.wordCount("one one -one_two,,three,one @three*one?two").size(), is(3));
    }

    @Test
    public void wordCountNull() {
        assertNull(wordCount.wordCount(" "));
    }


    @Test
    public void wordCountNotNull() {
        assertNotNull(wordCount.wordCount("one one -one_two,,three,one @three*one?two"));
    }

    @Test
    public void wordCountTrue() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
        assertTrue(wordCount.wordCount("one one -one_two,,three,one @three*one?two").equals(expected));
    }

    @Test
    public void wordCountTrueFailure() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
        assertTrue(!wordCount.wordCount("one one -one_two,,three,one @three*one?two").isEmpty());
    }

    @Test
    public void wordCountFalse() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 3);
        assertFalse(wordCount.wordCount("one one -one_two,,three,one @three*one?two").equals(expected));
    }

    @Test
    public void wordCountFalseFailure() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
        assertFalse(wordCount.wordCount("one one -one_two,,three,one @three*one?two").isEmpty());
    }

}