package ru.task.sort;

public class SelectSort {
    private static int[] selectsort(int[] nonsort) {
        for (int index = 0; index < nonsort.length; index++) {
            for (int indexrevers = index + 1; indexrevers < nonsort.length; indexrevers++) {
                if (nonsort[indexrevers] < nonsort[index]) {
                    int temp = nonsort[index];
                    nonsort[index] = nonsort[indexrevers];
                    nonsort[indexrevers] = temp;
                }
            }
        }
        return nonsort;
    }

    public static void main(String[] args) {
        int[] sourc = new int[]{2, 4, 9, 5, 3, 1, 8, 7, 6};
        int[] res = selectsort(sourc);
        for (int el : res) {
            System.out.print(el + " ");
        }

    }
}
