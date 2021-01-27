package com.lipan;

import java.util.HashSet;
import java.util.Set;

public class CheckSameNumber {

    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<Integer>();
            for (int x : nums) {
                if (!set.add(x)) {
                    return true;
                }
            }
            return false;
        }
    }
}
