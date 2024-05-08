package org.example;

public class Test {
    public static void main(String[] args) {
        System.out.println(tc1());
        System.out.println(tc2());
        System.out.println(tc3());
        System.out.println(tc4());
        System.out.println(tc5());
        System.out.println(tc6());
        System.out.println(tc8());
        System.out.println(tc9());
        System.out.println(tc10());
        System.out.println(tc7());
    }

    public static String toUppercase(String str) {
        String result = "";
        for (int i = 0, e = str.length() - 1; i <= e; ++i) {
            if (Character.isLetter(str.charAt(i)) && Character.isLowerCase(str.charAt(i))) {
                result += (char) (str.charAt(i) - 32);
            }
            else{
                result +=str.charAt(i);
            }
        }
        return result;
    }

    // Test case 1: Single lowercase letter
    public static boolean tc1() {
        String expected = "R";
        String input = "r";
        String result = toUppercase(input);
        return result.equals(expected);
    }

    // Test case 2: Multiple lowercase letters
    public static boolean tc2() {
        String expected = "HELLO";
        String input = "hello";
        String result = toUppercase(input);
        return result.equals(expected);
    }

    // Test case 3: Uppercase letter remains unchanged
    public static boolean tc3() {
        String expected = "A";
        String input = "A";
        String result = toUppercase(input);
        return result.equals(expected);
    }

    // Test case 4: string of Uppercase letters remains unchanged
    public static boolean tc4() {
        String expected = "ABCD";
        String input = "ABCD";
        String result = toUppercase(input);
        return result.equals(expected);
    }

    // Test case 5: Empty string
    public static boolean tc5() {
        String expected = "";
        String input = "";
        String result = toUppercase(input);
        return result.equals(expected);
    }

    // Test case 6: Whitespace
    public static boolean tc6() {
        String expected = " ";
        String input = " ";
        String result = toUppercase(input);
        return result.equals(expected);
    }

    // Test case 7: Null input
    public static boolean tc7() {
        String expected = "error message";
        String input = null;
        String result = toUppercase(input);
        return result.equals(expected);
    }

    // Test case 8: number in between
    public static boolean tc8() {
        String expected = "1HII";
        String input = "1hii";
        String result = toUppercase(input);
        return result.equals(expected);
    }

    // Test case 9: Special character
    public static boolean tc9() {
        String expected = "ROHITH@";
        String input = "rohith@";
        String result = toUppercase(input);
        return result.equals(expected);
    }

    // Test case 11: Long mixed string
    public static boolean tc10() {
        String expected = "THIS IS A TEST-STRING@10";
        String input = "This is a Test-String@10";
        String result = toUppercase(input);
        return result.equals(expected);
    }

}


