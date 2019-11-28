// Problem: 
// Given a sorted array nums, remove the duplicates in-place such that each element appear
// only once and return the new length.

// Questions:
//  - Can I allocate extra space for another array, or does it need to be in-place? --> must 
//      be in-place, modifiying the input array. 
//  - Should anything be returned? --> yes, return the length of the array without duplicates
//  - What should I do with the duplicate numbers? --> put them at the end
//  - Does it need to be stable, maintain its order? --> no



// Edge Cases: 
//  - empty array
//  - everything in the array is a duplicate --> return length 1
//  - array or length 1 --> must be carful to not get index out of bounds

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums != null) {
            int size = nums.length;
            if (size > 1) {
                int current = nums[0];
                int unseenNum;
                int setIndex = 1;
                for (int i = 1; i < nums.length; i++) {
                    if (current != nums[i]) {
                        unseenNum = nums[i];
                        nums[setIndex] = unseenNum;
                        current = unseenNum;
                        setIndex++;
                    }
                }
                return setIndex;
            }
            return 1;
        }
        return 0;
    }
}
