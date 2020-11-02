package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        Palindrome pal = new Palindrome("Racecar");
        assertEquals("Racecar", pal.getTestString());
    }

    @Test
    void name() {
        Palindrome pal = new Palindrome("Racecar");
        
    }
}