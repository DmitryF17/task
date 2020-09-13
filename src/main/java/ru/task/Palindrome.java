package ru.task;

/**
 * Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem,
 * we define empty string as valid palindrome.
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 * Input: "race a car"
 * Output: false
 * Constraints:
 * s consists only of printable ASCII characters.
 */

public class Palindrome {
    private boolean isPalindrome(String s) {
        String sourc = s.toLowerCase().replaceAll("(?U)[\\W]", "");
        String revers = new StringBuilder(sourc).reverse().toString();
        return sourc.equals(revers);
    }

    public static void main(String[] args) {
        var s = new Palindrome().isPalindrome("A man, a plan, a canal: Panama");
        var s1 = new Palindrome().isPalindrome("`l;`` 1o1 ??;l`");
        System.out.println(s);
        System.out.println(s1);
    }
}
