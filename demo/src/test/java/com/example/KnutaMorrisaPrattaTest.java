package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class KnutaMorrisaPrattaTest {

    @Test
    void testStep1() {
        KnutaMorrisaPratta kmp = new KnutaMorrisaPratta();
        assertTrue(kmp.step1("hello", "ll"));
        assertFalse(kmp.step1("hello", "world"));
        assertTrue(kmp.step1("abcabc", "ca"));
        assertFalse(kmp.step1("abcabc", "cb"));
        assertTrue(kmp.step1("hello world", "lo wo"));
    }
}
