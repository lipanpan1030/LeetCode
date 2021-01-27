package com.lipan;

public class PrintUtil {

    public static final void printIntArray(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            if (i != nums.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println("result:" + sb.toString());
    }
}
