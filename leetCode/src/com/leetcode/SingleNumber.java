package com.leetcode;
import java.util.*;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		int result = 0;
		for(int i =0; i< nums.length; i++){
			result ^= nums[i];
		}
		return result;
	}
	
	public int singleNumberV2(int[] nums){
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i =0; i< nums.length; i++){
			if(!hashSet.remove(nums[i])){
				hashSet.add(nums[i]);
			}
		}
		return hashSet.iterator().next();
	}
}
