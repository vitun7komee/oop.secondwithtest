package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NaiveTest {

    @Test
    void testStep1() {
        Naive naive = new Naive();
        assertTrue(naive.step1("hello", "ll"));
        assertFalse(naive.step1("hello", "world"));
        assertTrue(naive.step1("abcabc", "ca"));
        assertFalse(naive.step1("abcabc", "cb"));
        assertTrue(naive.step1("hello world", "lo wo"));
        assertFalse(naive.step1("hello world", "world hello"));
        assertTrue(naive.step1("the quick brown fox", "quick"));
        assertFalse(naive.step1("the quick brown fox", "lazy"));
        assertTrue(naive.step1("this is a test", "is a"));
        assertFalse(naive.step1("this is a test", "is test"));
        assertTrue(naive.step1("programming is fun", "ming is fu"));
        assertFalse(naive.step1("programming is fun", "fun is"));
    }

    @Test
    void testNaiveStringMatcher() {
        Naive naive = new Naive();
        assertEquals(naive.NaiveStringMatcher("hello", "ll"), 2);
        assertEquals(naive.NaiveStringMatcher("hello", "world"), -1);
        assertEquals(naive.NaiveStringMatcher("abcabc", "ca"), 2);
        assertEquals(naive.NaiveStringMatcher("abcabc", "cb"), -1);
    }
}
