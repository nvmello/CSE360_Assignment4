/**
 *  Author: Nicholas Morello
 *  Class ID: ASU CSE360
 *  PalindromeTest.java is a JavaDoc file used in testing the different parts of Palindrome.java file
 */

package com.company;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome pal;
    private String input;

    @Before
    public void setUpTest(){
        input = null;
        pal = new Palindrome();
    }

    @Test
    public void isAPalindrome(){
        input = "racecar";
        assertEquals(true,pal.isPalindrome(input));
        System.out.println("Input \"" + input + "\" is a Palindrome." );
    }

    @Test
    public void nonAlphaPalindrome(){
        input = "&*$   @#?";
        assertEquals(true,pal.isPalindrome(input));
        System.out.println("Input \"" + input + "\" is a Palindrome." );
    }

    @Test
    public void notPalindrome(){
        input = "Puppy";
        pal.isPalindrome(input);
        assertEquals(false,pal.isPalindrome(input));
        System.out.println("Input \"" + input + "\" is not a Palindrome." );
    }

    @Test
    public void stringIsEmpty(){
        input = "";
        pal.isPalindrome(input);
        assertEquals(true,pal.getTestString().isEmpty());
        System.out.println("Input " + input + " is empty." );
    }

    @Test
    public void isNull(){
        assertNull(pal.getTestString());
        System.out.println("Input value is Null" );
    }

    @Test
    public void checkToLower(){
        input = "AbCdEfGh";
        pal.isPalindrome(input);
        assertEquals("abcdefgh", pal.getTestString());
        System.out.println("toLowerCase is functional");
    }

    @After
    public void deleteOutputFile() {
        input = null;
    }
}