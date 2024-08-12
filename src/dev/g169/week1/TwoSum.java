package dev.g169.week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Two Sum</h1>
 * <p>
 * <span>🔗 Link:
 * </span><span>https://leetcode.com/problems/two-sum/description/</span>
 * </p>
 * <p>
 * <span>💪🏼 Difficulty: </span><strong style="color: green">Easy</strong>
 * </p>
 * <p>
 * <span>🏷️ Topics: </span><span>Array, Hash Table</span>
 * </p>
 */
public class TwoSum {

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int numToFind = target - nums[i];

            if (hashMap.containsKey(numToFind))
                return new int[] { hashMap.get(numToFind), i };
            else
                hashMap.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

}
