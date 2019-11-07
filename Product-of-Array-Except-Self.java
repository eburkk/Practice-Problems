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

// No division with O(n) runtime 
// Taking the product of numbers to the left and right of every index i in input array
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;         // length of input array
        int[] output = new int[size];   // final output array
        int[] left = new int[size];     // product of numbers to left
        int[] right = new int[size];    //product of numbers to right
        left[0] = 1;
        right[size - 1] = 1;
        
        for (int i = 1; i < size; i++) {
            left[i] = left[i - 1] * nums[i - 1];    
        }
        
        for (int i = size - 2; i >= 0 ; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        for (int i = 0; i < size; i++) {
            output[i] = left[i] * right[i];
        }
        return output;
    }
}


