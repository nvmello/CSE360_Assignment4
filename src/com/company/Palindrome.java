/**
 *  Author: Nicholas Morello
 *  Class ID: ASU CSE360
 *  Palindrome.java is a class that checks if a string is a palindrome or not,
 *      (a palindrome is a string that reads the same forwards and backwards ex: "racecar")
 */

package com.company;

public class Palindrome {
    private String testString;

    /**
     * Constructor for the Palindrome class
     * sets testString = to null to start
     */
    Palindrome(){
        this.testString = null;
    }

    /**
     * getTestString is a method that simply returns the value of the private String variable testString
     * @return
     */
    public String getTestString() {
        return testString;
    }

    /**
     * isPalindrome: testStr parameter is the String is being checked if it is a palindrome or not
     * @return      returns true if the inputted string is a palindrome
     *                  or if the string contains no alphanumeric characters
     *              returns false if string is not a palindrome
     */
    public boolean isPalindrome(String testStr){
        int i = 0;
        this.testString = testStr.toLowerCase();
        int len = this.testString.length();
        boolean isPal = true;

        if (this.testString.isEmpty()){
            isPal = true;
        } else{
            while ( (i<=len/2) && isPal){
                if ((Character.compare(this.testString.charAt(i),this.testString.charAt(len-1-i) ) == 0)
                        || ((int)this.testString.charAt(i) < 48
                        || ((int)this.testString.charAt(i) > 57 && ((int)this.testString.charAt(i) < 97))
                        || (int)this.testString.charAt(i) > 122)){
                }
                else {
                    isPal = false;
                }
                i++ ;
            }
        }
        return isPal;
    }
}
