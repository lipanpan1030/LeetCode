package com.lipan.s1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 两数之和
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        // for(int i = 0 ; i < nums.length; i++) {
        //     for(int j = i + 1;  j < nums.length; j ++) {
        //         if (target == nums[i] + nums[j]) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return null;

        // Map<Integer, Integer> map = new HashMap();
        // for(int i = 0 ; i < nums.length; i++) {
        //     map.put(nums[i], i);
        // }

        // for(int i = 0 ; i < nums.length; i++) {
        //     int value = target - nums[i];
        //     if (map.containsKey(value) && map.get(value) != i) {
        //         int j = map.get(value);
        //         return new int[] {i, j};
        //     }
        // }
        // return null;

        Map<Integer, Integer> map = new HashMap();
        for(int i = 0 ; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value) && map.get(value) != i) {
                int j = map.get(value);
                if (i < j) {
                    return new int[] {i, j};
                } else {
                    return new int[] {j, i};
                }

            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{5, 6, 7, 10, 60, 1, 0, 14};
        int[] result = solution.twoSum(nums, 7);
        if (result != null && result.length == 2) {
            System.out.println("result:" + result[0] + "," + result[1]);
        }
    }

}
