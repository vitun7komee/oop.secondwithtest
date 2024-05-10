package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RabinKarpTest {

    @Test
    void testStep1() {
        RabinKarp rabinKarp = new RabinKarp();
        assertTrue(rabinKarp.step1("hello", "ll"));
        assertFalse(rabinKarp.step1("hello", "world"));
        assertTrue(rabinKarp.step1("abcabc", "ca"));
        assertFalse(rabinKarp.step1("abcabc", "cb"));
        assertTrue(rabinKarp.step1("hello world", "lo wo"));
        assertFalse(rabinKarp.step1("hello world", "world hello"));
        assertTrue(rabinKarp.step1("the quick brown fox", "quick"));
        assertFalse(rabinKarp.step1("the quick brown fox", "lazy"));
        assertTrue(rabinKarp.step1("this is a test", "is a"));
        assertFalse(rabinKarp.step1("this is a test", "is test"));
        assertTrue(rabinKarp.step1("programming is fun", "ming is fu"));
        assertFalse(rabinKarp.step1("programming is fun", "fun is"));
    }

    @Test
    void testPrefixFunction() {
        RabinKarp rabinKarp = new RabinKarp();
        assertEquals(rabinKarp.PrefixFunction("hello", "ll"), new ArrayList<>(Arrays.asList(2)));
        assertEquals(rabinKarp.PrefixFunction("hello", "world"), new ArrayList<>());
        assertEquals(rabinKarp.PrefixFunction("abcabca", "ca"), new ArrayList<>(Arrays.asList(2, 5)));
        assertEquals(rabinKarp.PrefixFunction("abcabc", "cb"), new ArrayList<>());
    }

    @Test
    void testCompareText() {
        RabinKarp rabinKarp = new RabinKarp();
        assertTrue(rabinKarp.CompareText("hello", 2, "ll"));
        assertFalse(rabinKarp.CompareText("hello", 2, "wo"));
        assertTrue(rabinKarp.CompareText("abcabc", 2, "ca"));
        assertFalse(rabinKarp.CompareText("abcabc", 2, "cb"));
    }
}
