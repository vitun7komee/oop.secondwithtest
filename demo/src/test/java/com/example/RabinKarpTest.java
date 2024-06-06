package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RabinKarpTest {

    //step1 tests

    @Test
    void centermatch(){
        RabinKarp rabinKarp = new RabinKarp();
        assertTrue(rabinKarp.step1("hello", "ll"));
    }
    @Test
    void nomatch1(){
        RabinKarp rabinKarp = new RabinKarp();
        assertFalse(rabinKarp.step1("hello", "world"));
    }
    @Test
    void nomatch2(){
        RabinKarp rabinKarp = new RabinKarp();
        assertFalse(rabinKarp.step1("abcabc", "cb"));
    }
    @Test
    void dividedstrmatch1(){
        RabinKarp rabinKarp = new RabinKarp();
        assertTrue(rabinKarp.step1("hello world", "lo wo"));
    }
    @Test
    void dividedstrmatch2(){
        RabinKarp rabinKarp = new RabinKarp();
        assertFalse(rabinKarp.step1("this is a test", "is test"));
    }
    @Test
    void dividedstrnomatch(){
        RabinKarp rabinKarp = new RabinKarp();
        assertFalse(rabinKarp.step1("programming is fun", "fun is"));
    }
    @Test
    void reversdividedstrnomatch(){
        RabinKarp rabinKarp = new RabinKarp();
        assertFalse(rabinKarp.step1("hello world", "world hello"));
    }
    @Test
    void dividedstrmatch3(){
        RabinKarp rabinKarp = new RabinKarp();
        assertTrue(rabinKarp.step1("programming is fun", "ming is fu"));
    }

    //prefix function tests

    @Test
    void arrmatch1(){
        RabinKarp rabinKarp = new RabinKarp();
        assertEquals(rabinKarp.PrefixFunction("hello", "ll"), new ArrayList<>(Arrays.asList(2)));
    }
    void arrnomatch1(){
        RabinKarp rabinKarp = new RabinKarp();
        assertEquals(rabinKarp.PrefixFunction("hello", "world"), new ArrayList<>());
    }
    @Test
    void arrmatch2(){
        RabinKarp rabinKarp = new RabinKarp();
        assertEquals(rabinKarp.PrefixFunction("abcabca", "ca"), new ArrayList<>(Arrays.asList(2, 5)));
    }
    @Test
    void arrnomatch2(){
        RabinKarp rabinKarp = new RabinKarp();
        assertEquals(rabinKarp.PrefixFunction("abcabc", "cb"), new ArrayList<>());
    }

    //comparetext tests
    
    @Test
    void indexmatch1(){
        RabinKarp rabinKarp = new RabinKarp();
        assertTrue(rabinKarp.CompareText("hello", 2, "ll"));
    }
    @Test
    void indexnomatch1(){
        RabinKarp rabinKarp = new RabinKarp();
        assertFalse(rabinKarp.CompareText("hello", 2, "wo"));
    }
    @Test
    void indexnomatch2(){
        RabinKarp rabinKarp = new RabinKarp();
        assertFalse(rabinKarp.CompareText("hello", 4, "ro"));
    }
    void indexmatch2(){
        RabinKarp rabinKarp = new RabinKarp();
        assertTrue(rabinKarp.CompareText("abcabc", 0, "ab"));
    }

}
