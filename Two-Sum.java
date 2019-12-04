//Problem: Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// Questions: 
//  Am I returning the first two indices that come up? --> yes

// Edge Case:
//  make sure not to count the same indice as two numbers
// empty array or array length < 2

// Brute Force Solution 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        if (nums == null || nums.length < 2) {
            return solution;
        }
        for (int j = 0; j < nums.length; j++) {
            for (int i = 1; i < nums.length; i++) {
                if (target - nums[j] - nums[i] == 0 && i != j) {
                    solution[0] = j;
                    solution[1] = i;
                    return solution;  
                }
            }
        }
        return solution;
    }
}
