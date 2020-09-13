package ru.task;

import java.util.LinkedList;

/**
 * Реализовать метод проверки корректности открытых и закрытых скобок.
 * Например, ()(()((()))) - true, ()) - false
 */
class Parentheses {
    public static boolean valid(char[] data) {
        LinkedList<Character> rs = new LinkedList<>();
        for (char el : data) {
            rs.add(el);
        }
        while (rs.peek() != null) {
            if (rs.peek() == ')') {
                return false;
            }
            rs.poll();
            if (rs.contains(')')) {
                rs.removeFirstOccurrence(')');
            } else {
                return false;
            }
        }
        return true;
    }
}


