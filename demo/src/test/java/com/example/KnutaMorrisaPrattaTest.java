package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class KnutaMorrisaPrattaTest {

     //step1 tests

    @Test
    void centermatch(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertTrue(kmp.step1("hello", "ll"));
    }
    @Test
    void nomatch1(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertFalse(kmp.step1("hello", "world"));
    }
    @Test
    void nomatch2(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertFalse(kmp.step1("abcabc", "cb"));
    }
    @Test
    void dividedstrmatch1(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertTrue(kmp.step1("hello world", "lo wo"));
    }
    @Test
    void dividedstrmatch2(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertFalse(kmp.step1("this is a test", "is test"));
    }
    @Test
    void dividedstrnomatch(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertFalse(kmp.step1("programming is fun", "fun is"));
    }
    @Test
    void reversdividedstrnomatch(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertFalse(kmp.step1("hello world", "world hello"));
    }
    @Test
    void dividedstrmatch3(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertTrue(kmp.step1("programming is fun", "ming is fu"));
    }

    //prefix function tests
    
    @Test
    void arrmatch1(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertEquals(kmp.PrefixFunction("hello", "ll"), new ArrayList<>(Arrays.asList(2)));
    }
    void arrnomatch1(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertEquals(kmp.PrefixFunction("hello", "world"), new ArrayList<>());
    }
    @Test
    void arrmatch2(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertEquals(kmp.PrefixFunction("abcabca", "ca"), new ArrayList<>(Arrays.asList(2, 5)));
    }
    @Test
    void arrnomatch2(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertEquals(kmp.PrefixFunction("abcabc", "cb"), new ArrayList<>());
    }

    //find border tests

    @Test
    void simplecase(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertEquals(createLinkedList(0, 0, 1, 2, 0, 1, 2),
        kmp.FindBorders("ababcab"));
    }

    @Test
    void norepcase(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertEquals(createLinkedList(0, 0, 0, 0, 0, 0),
        kmp.FindBorders("abcdef"));
    }
    @Test
    void singlecharcase(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertEquals(createLinkedList(0),
        kmp.FindBorders("a"));
    }
    @Test
    void allsamecase(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertEquals(createLinkedList(0, 1, 2, 3, 4, 5),
        kmp.FindBorders("aaaaaa"));
    }
    @Test
    void emptycase(){
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertEquals(createLinkedList(),
        kmp.FindBorders(""));
    }
    
    private LinkedList<Integer> createLinkedList(Integer... values) {
        return new LinkedList<>(Arrays.asList(values));
    }
}
