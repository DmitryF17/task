package ru.task;

/**
 * Необходимо реализовать метод, который принимает строку, которую необходимо зашифровать таким образом, чтобы на выходе отражались только 4 последних элемента, все остальные были заменены на #. При этом соблюсти условия:
 * 1. Если входная строка пустая - необходимо вернуть строку "empty";
 * 2. Если входная строка содержит больше 0 и не более 4 символов - метод должен вернуть исходную строку.
 * Для решения используйте StringBuilder и его метод setCharAt().
 */

public class Cryptography {
    public static String code(String s) {
        if (s.length() == 0) {
            return "empty";
        }
        if (s.length() > 3) {
            StringBuilder source = new StringBuilder(s);
            for (int index = 0; index != s.length() - 4; index++) {
               source.setCharAt(index, '#');
            }
            return String.valueOf(source);
        }
        return s;
    }
}
