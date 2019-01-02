package com.stackroute.unittest.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WordCountTest {
    WordCount wordCount = new WordCount();
    @Test
    public void wordCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
        assertThat(wordCount.wordCount("one one -one_two,,three,one @three*one?two"), is(expected));
        assertThat(wordCount.wordCount("one one -one_two,,three,one @three*one?two").size(), is(3));
    }
}