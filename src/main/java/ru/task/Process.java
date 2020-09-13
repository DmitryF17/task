package ru.task;

import java.util.*;

/**
 * public class User {
 * private String name;
 * private TreeSet<String> emails;
 * -------
 * Преобрзование
 * emails    name
 * ----------------
 * email1 -> name
 * email2 -> name
 * emsil3 -> name
 */
public class Process {

    private Map<String, String> process(ArrayList<User> source) {
        Map<String, String> rs = new TreeMap<>();
        source.forEach(user -> {
            user.getEmails().forEach(email -> rs.put(email, user.getName()));
        });
        return rs;
    }

    private static class User {
        private String name;
        private TreeSet<String> emails;

        User(String name, TreeSet<String> emails) {
            this.name = name;
            this.emails = emails;
        }

        String getName() {
            return name;
        }

        TreeSet<String> getEmails() {
            return emails;
        }

        public static void main(String[] args) {
            TreeSet<String> emails1 = new TreeSet<>(Arrays.asList("mail1", "mail2"));
            TreeSet<String> emails2 = new TreeSet<>(Arrays.asList("mail2", "mail3"));
            ArrayList<User> source = new ArrayList<>(Arrays.asList(new User("user1", emails1),
                    new User("user2", emails2)));
            System.out.println(new Process().process(source));
        }
    }
}
