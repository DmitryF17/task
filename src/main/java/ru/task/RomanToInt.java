package ru.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * Example 1:
 * Input: "III"
 * Output: 3
 * Example 2:
 * Input: "IV"
 * Output: 4
 * Example 3:
 * Input: "IX"
 * Output: 9
 * Example 4:
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 5:
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * I - 1
 * V - 5
 * X - 10
 * L - 50
 * C - 100
 * D - 500
 * M - 1000
 * If I comes before V or X, subtract 1 eg: IV = 4 and IX = 9
 * If X comes before L or C, subtract 10 eg: XL = 40 and XC = 90
 * If C comes before D or M, subtract 100 eg: CD = 400 and CM = 900
 */
public class RomanToInt {
    private static Map<String, Integer> revers;
    private static Map<String, Integer> revers1;
    private int res = 0;
    private String sourc;

    private RomanToInt(String st) {
        this.sourc = st;
    }

    private void setSourc(String st) {
        this.sourc = st;
    }

    static {
        revers = new HashMap<>();
        revers.put("I", 1);
        revers.put("V", 5);
        revers.put("X", 10);
        revers.put("L", 50);
        revers.put("C", 100);
        revers.put("D", 50);
        revers.put("M", 1000);
        revers1 = new HashMap<>();
        revers1.put("IV", 4);
        revers1.put("IX", 9);
        revers1.put("XL", 40);
        revers1.put("XC", 90);
        revers1.put("CD", 400);
        revers1.put("CM", 900);
    }

    private int romanToInt() {
        revers1.keySet().forEach(key -> {
            if (sourc.contains(key)) {
                res += revers1.get(key);
            }
            setSourc(sourc.replace(key, " "));
        });
        char[] sr = sourc.toCharArray();
        for (char temp : sr) {
            var key = String.valueOf(temp);
            if (revers.containsKey(key)) {
                res += revers.get(key);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Roman number");
        String romannumber = in.nextLine();
        int res = new RomanToInt(romannumber).romanToInt();
        System.out.println(res);
    }
}
