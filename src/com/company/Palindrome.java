package com.company;

public class Palindrome {
    private String testString;

    public String getTestString() {
        return testString;
    }

    Palindrome(String testStr){
        this.testString = testStr.toLowerCase();
    }

    public boolean isPalindrome(){
        int i = 0;
        int len = this.testString.length();
        boolean isPal = true;

        while ( (i<=len/2) && isPal){
            if ((Character.compare(this.testString.charAt(i),this.testString.charAt(len-1-i) ) == 0)
            || ((int)this.testString.charAt(i) < 48
                    || ((int)this.testString.charAt(i) > 57 && ((int)this.testString.charAt(i) < 97))
                    || (int)this.testString.charAt(i) > 122)){
                System.out.println("True");
            }
            else {
                System.out.println("False");
                isPal = false;
            }
            i++;
        }
        return isPal;
    }

}
