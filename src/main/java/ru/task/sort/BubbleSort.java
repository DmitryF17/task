package ru.task.sort;

public class BubbleSort {

    private static int[] bubblesort(int[] nonsort) {
        for (int index = nonsort.length - 1; index > 1; index--) {
            for (int indexrevers = 0; indexrevers < index; indexrevers++) {
                if (nonsort[indexrevers] > nonsort[indexrevers + 1]) {
                    int temp = nonsort[indexrevers];
                    nonsort[indexrevers] = nonsort[indexrevers + 1];
                    nonsort[indexrevers + 1] = temp;
                }
            }
        }
        return nonsort;
    }

    public static void main(String[] args) {
        int[] sourc = new int[]{2, 4, 9, 5, 3, 1, 8, 7, 6};
        int[] res = bubblesort(sourc);
        for (int el : res) {
            System.out.print(el + " ");
        }

    }
}


