package com.lipan.s1407;

import com.lipan.PrintUtil;

public class Solution {

    /**
     * 重新排列数组
     * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
     *
     * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/shuffle-the-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @param n
     * @return
     */
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            result[j++] = nums[i];
            result[j++] = nums[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 7, 9, 10, 50, 80, 100};
        int[] result = shuffle(nums, 4);
        PrintUtil.printIntArray(result);
    }
}
