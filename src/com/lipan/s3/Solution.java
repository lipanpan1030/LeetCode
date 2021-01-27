package com.lipan.s3;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * 无重复字符的最长子串
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> occ = new HashSet<>();
        int ans = 0;
        int length = s.length();

        int rightP = -1;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                //左指针右移动时，删除之前那个字符
                occ.remove(s.charAt(i - 1));
            }

            //指针长度小于字符串长度， 并且指针所指向的字符不在集合里面
            while ((rightP + 1) < length && !occ.contains(s.charAt(rightP + 1))) {
                occ.add(s.charAt(rightP + 1));
                //指针右移
                ++rightP;
            }
            ans = Math.max(ans, rightP - i + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        String testKey = "abcabcbb";
        int length = lengthOfLongestSubstring(testKey);
        System.out.println("length:" + length);
    }
}
