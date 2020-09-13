package ru.task;

import java.util.Arrays;

/**
 * Given a non-empty array of integers,
 * every element appears twice except for one.
 * Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 */

public class Singlenumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = nums[0];
        for (int index = 0; index < nums.length; index++) {
            if (index == nums.length -1 || nums[index] != nums[index + 1]) {
                res = nums[index];
                break;
            }
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Singlenumber().singleNumber(new int[]{4, 1, 3, 1, 3}));
    }
}
