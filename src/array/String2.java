package array;

public class String2 {
    public static void main(String[] args) {
        String str = "The table below summarizes some of the most common string methods available in Java";
        System.out.println(str.charAt(4)); // Returns the character's index of the parameter
        System.out.println(str.substring(2,7)); //Returns the characters from indexes 2 - 7,
        System.out.println(str.length()); //Returns the length of the string.
        System.out.println(str.indexOf('a')); //Returns the index for the first occurrence of ‘a’,
        System.out.println(str.toUpperCase()); //Changes all alphabetic characters in the string to UPPERCASE or lowercase, respectively.
        System.out.println(str.toLowerCase());
        System.out.println(str.contains("some")); //Searches for the specified text within a string and returns true or false.
        //str.equals(otherString)  Compares strings for equality and returns a boolean.

    }
}
