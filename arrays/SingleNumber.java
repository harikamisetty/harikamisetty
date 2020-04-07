package com.hari.dsal.arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */
public class SingleNumber {
	
	public int singleNumber(int[] nums) {
        
	       
        List<Integer> numberList = new ArrayList<Integer>();
        for (int i=0; i < nums.length; i++){
               
            if(!numberList.contains(nums[i])){
              numberList.add(Integer.valueOf(nums[i]));
            }else {
                numberList.remove(Integer.valueOf(nums[i]));
            }
        } 
        return numberList.get(0);
    }

}
