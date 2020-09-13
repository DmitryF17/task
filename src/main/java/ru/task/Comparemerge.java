package ru.task;

import java.util.*;

public class Comparemerge {
    /**
     * Iterators return ordered non-null elements.
     *
     * @return Merged ordered list.
     */
    private static <T> List<T> merge(Iterator<T> i1, Iterator<T> i2, Comparator<T> comparator) {
        List<T> list = new ArrayList<>();
      i1.forEachRemaining(list::add);
      i2.forEachRemaining(list::add);
      list.sort(comparator);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 5, 12, 66, 66, 67);
        List<Integer> l2 = Arrays.asList(2, 3, 6, 7, 8, 12, 33, 66, 92, 134);
        List<Integer> expected = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 12, 12, 33, 66, 66, 66, 67, 92, 134);
        List<Integer> merged1 = merge(l1.iterator(), l2.iterator(), Integer::compareTo);
        System.out.println(expected.equals(merged1) ? "Test PASSED" : "Test FAILED");
        System.out.println(merged1);
        List<Integer> merged2 = merge(l2.iterator(), l1.iterator(), Integer::compareTo);
        System.out.println(expected.equals(merged2) ? "Test PASSED" : "Test FAILED");
        System.out.println(merged2);
    }
}

