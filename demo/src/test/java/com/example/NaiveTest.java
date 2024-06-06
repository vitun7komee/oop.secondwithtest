package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NaiveTest {

    //step1 tests

    @Test
    void centermatch(){
        Naive naive = new Naive();
        assertTrue(naive.step1("hello", "ll"));
    }
    @Test
    void nomatch1(){
        Naive naive = new Naive();
        assertFalse(naive.step1("hello", "world"));
    }
    @Test
    void nomatch2(){
        Naive naive = new Naive();
        assertFalse(naive.step1("abcabc", "cb"));
    }
    @Test
    void dividedstrmatch1(){
        Naive naive = new Naive();
        assertTrue(naive.step1("hello world", "lo wo"));
    }
    @Test
    void dividedstrmatch2(){
        Naive naive = new Naive();
        assertFalse(naive.step1("this is a test", "is test"));
    }
    @Test
    void dividedstrnomatch(){
        Naive naive = new Naive();
        assertFalse(naive.step1("programming is fun", "fun is"));
    }
    @Test
    void reversdividedstrnomatch(){
        Naive naive = new Naive();
        assertFalse(naive.step1("hello world", "world hello"));
    }
    @Test
    void dividedstrmatch3(){
        Naive naive = new Naive();
        assertTrue(naive.step1("programming is fun", "ming is fu"));
    }

    //naivestringmatchertests

    @Test
    void strmatch1(){
        Naive naive = new Naive();
        assertEquals(naive.NaiveStringMatcher("hello", "ll"), 2);
    }
    @Test
    void strnomatch1(){
        Naive naive = new Naive();
        assertEquals(naive.NaiveStringMatcher("hello", "world"), -1);
    }
    @Test
    void strmatch2(){
        Naive naive = new Naive();
        assertEquals(naive.NaiveStringMatcher("abcabc", "ca"), 2);
    }
    @Test
    void strnomatch2(){
        Naive naive = new Naive();
        assertEquals(naive.NaiveStringMatcher("abcabc", "cb"), -1);
    }

}
