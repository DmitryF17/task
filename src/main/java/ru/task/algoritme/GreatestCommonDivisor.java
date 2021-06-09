package ru.task.algoritme;

import java.util.Scanner;

public class GreatestCommonDivisor {

    private static int greatestcommondivisor(int firstnumber, int secondnumber) {
        while (secondnumber != 0) {
            int remainder = firstnumber % secondnumber;
            firstnumber = secondnumber;
            secondnumber = remainder;
        }
        return firstnumber;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Первое число");
        int firstnumber = Integer.parseInt(in.nextLine());
        System.out.println("Второе число");
        int secondnumber = Integer.parseInt(in.nextLine());
        int res = GreatestCommonDivisor.greatestcommondivisor(firstnumber, secondnumber);
        System.out.println("Наибольший общий делитель чисел " + firstnumber + " и " + secondnumber + " = " + res);
    }
}
