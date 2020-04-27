package com.practice.array.string;

import java.util.Arrays;

/**
 * Given an array of integers, return indices of the two numbers such
 * that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and
 * you may not use the same element twice.
 * <p>
 * <p>
 * Hint 1# A really brute force way would be to search for all
 * possible pairs of numbers but that would be too slow. Again, it's
 * best to try out brute force solutions for just for completeness. It
 * is from these brute force solutions that you can come up with
 * optimizations.
 */
public
class TwoSum {

	public static
	void main(String args[]) {
	int[] nums = {2, 3,7, 11, 15};
	int target = 9;
	int[] resultArray = new int[2];
	resultArray = twoSum(nums,target);
	System.out.println(Arrays.toString(resultArray));
	System.out.println(nums[resultArray[0]] + "," + nums[resultArray[1]]);

	}

	public static int[] twoSum(int [] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[]{i, j};
				}
			}
		}
		throw new IllegalArgumentException("No Two Sum Solution");

	}
}
