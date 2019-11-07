// Problem: 
/* Given an array nums of n integers, return an array output such that output[i] is equal to
    the product of all the elements of nums except nums[i]. */

// Questions: 
//      Can integers be negative numbers? --> yes
//      What should I return if array is empty? or length 1?--> guaranteed nums.length > 1
//      Are the n integer values unique? Can there be duplicates? --> not unique values

// Edge Cases:
// All zero [0, 0]
// All but 1 zero, [0, 4, 0]

// Brute force solution:
//      Nested for loop. O(n^2) time complexity
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length]; 
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                   product *= nums[j];  
                }
            }
            output[i] = product;
        }
        return output;
    }
}

// O(n) runtime using division
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                zeroCount++;
            }
        }
        
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0 && zeroCount == 0) {
                output[i] = product / nums[i];
            } else if (nums[i] == 0 && zeroCount == 1) {
                output[i] = product;
            } else if (zeroCount > 1) {
                output[i] = 0;
            }
        }
        return output;
    }
}



