/*  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]. 
*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        for(int i=0;i<nums.length;i++){
            int sum=nums[i]+nums[i+1];
            if(sum==target){
                res[0]=i;
                res[1]=i+1;
                return res;
            }
        }
    return res;
    }
}