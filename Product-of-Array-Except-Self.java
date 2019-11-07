// Problem: 
/* Given an array nums of n integers, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i]. */

// Questions: 
//      Can integers be negative numbers?
//      What should I return if array is empty? or length 1?--> guaranteed nums.length > 1
//      Are the n integer values unique? Can there be duplicates? 

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
