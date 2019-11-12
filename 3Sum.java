// Problem: 
// Given an array nums of n integers, are there elements a, b, c in nums
// such that a + b + c = 0? Find all unique triplets in the array which 
// gives the sum of zero.

// Questions:
//  Are duplicate triplet sets allowed? --> no, must be unique
//  Will array be of length 3 or more? --> not guaranteed

// Edge Cases: 
//  - having duplicate numbers in array (HashSet only allows unique values)

// O(n^2) runtime solution
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        Set<List<Integer>> unique = new HashSet<>();
        Arrays.sort(nums);
        if (nums.length >= 3) {
            for (int i = 0; i < nums.length; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum > 0) {
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        List<Integer> set = Arrays.asList(nums[i],nums[left],nums[right]);
                        if (!unique.contains(set)) {
                            unique.add(set);
                            output.add(set);
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return output;
    }
}
