package com.lipan.s1512;

import com.lipan.PrintUtil;

public class Solution {

    /**
     * 好数对的数目
     * 给你一个整数数组 nums 。
     *
     * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
     *
     * 返回好数对的数目。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/number-of-good-pairs
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public static int numIdenticalPairs(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 0, 3, 1, 5, 0};
        int result = numIdenticalPairs(nums);
        System.out.println("result:" + result);
    }
}
