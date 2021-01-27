package com.lipan.s70.climStairs;

class Solution {

    /**
     * f(n) = f(n-1) + f(n-2)
     *
     * f(3) = f(1) + f(2)
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        int first = 1;
        int second = 1;
        int result = 2;
        for (int i = 3; i <= n; i++) {
            first = second;
            second = result;
            result = first + second;
        }
        return result;
    }

    // 递归调用
    public static int climbStairs1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] array = new int[n+1];
        array[1] = 1;
        array[2] = 2;
        return dfs(n-1, array) + dfs(n-2, array);
    }
    // 备忘录法
    public static int dfs(int n, int[] array) {
        if (array[n] != 0) {
            return array[n];
        } else {
            array[n] = dfs(n - 1, array) + dfs(n - 2, array);
            return array[n];
        }
    }

    public static int climbStairs2(int n) {
        if (n == 0) {
            return 1;
        }
        int[] nums = new int[n+1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }

    public static void main(String[] args) {
        int x = 5;
        int ret = climbStairs(x);
        System.out.println(ret);
    }
}
