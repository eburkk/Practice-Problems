//Problem: Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// Questions: 
//  Am I returning the first two indices that come up? --> yes

// Edge Case:
//  make sure not to count the same indice as two numbers
// empty array or array length < 2

// use hash map for constant time look up. 
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        if (nums == null || nums.length < 2) {
            return solution;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            map.put(nums[j], j);
        }
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.containsKey(dif) && map.get(dif) != i) {
                solution[0] = i;
                solution[1] = map.get(dif);
                return solution;
            }
        }
        return solution;
    }
}

// Brute Force Solution 
class Solution1 {
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
