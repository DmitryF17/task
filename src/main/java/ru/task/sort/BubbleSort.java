package ru.task.sort;

import java.util.Arrays;

public class BubbleSort {

    int[] sourc;

    public BubbleSort(int[] ints) {
        this.sourc = ints;
    }

    void bubblesort() {
        for (int index = sourc.length - 1; index > 1; index--) {
            for (int indexrevers = 0; indexrevers < index; indexrevers++) {
                if (sourc[indexrevers] > sourc[indexrevers + 1]) {
                    int temp = sourc[indexrevers];
                    sourc[indexrevers] = sourc[indexrevers + 1];
                    sourc[indexrevers + 1] = temp;
                }
            }
        }
        for (int el : this.sourc) {
            System.out.print(el + " ");
        }

    }

    public static void main(String[] args) {
        int[] res = new int[]{2, 4, 9, 5, 3, 1, 8, 7, 6};
        new BubbleSort(res).bubblesort();
    }
}


