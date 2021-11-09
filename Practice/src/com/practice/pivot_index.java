package com.practice;

public class pivot_index {
    public int pivotIndex(int[] nums) {

        int sum = 0;
        for (int num:nums){
            sum+= num;
        }
        int leftSum= 0 , rightSum= sum;
        for (int i =0 ; i<nums.length; i++){
            rightSum -= nums[i];

            if (leftSum == rightSum){
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
}

    

