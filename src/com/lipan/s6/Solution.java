package com.lipan.s6;

public class Solution {

    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        //负数
        if (x < 0) {
            return false;
        }
        //末尾数为0
        if (x != 0 && x % 10 == 0) {
            return false;
        }

        /**
         * 12321
         * revertedNum 0    ->1   ->12 ->123
         * x           12321->1232->123->12
         */
        int revertedNum = 0;
        while (x > revertedNum) {
            revertedNum = revertedNum * 10 + x%10;
            x /= 10;
        }

        return x == revertedNum || x == revertedNum / 10;
    }

    public static void main(String[] args) {
        int x = 123321;
        boolean result = isPalindrome(x);
        System.out.println("result:" + result);
    }
}
