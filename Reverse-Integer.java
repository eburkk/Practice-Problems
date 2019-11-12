// Problem:
// Given a 32-bit signed integer, reverse digits of an integer.

// Questions:
//  What do we return if the revered integer overflows? --> return 0

// Edge Cases:
//  Overflows past the maximum value an int can be, 2^31-1
//  Overflows past the minimum value an int can be, -2^31

// Idea: 
// While the input != 0, Mod the input number to find the remainder, then divide the input by 10.
// check to ensure no overflow before multiplying the output by 10 to create a digit placeholder for the remainder.
// Add remainder to output. 


class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && pop > 7)) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE/10 || (reverse < Integer.MIN_VALUE/10 && pop < -8)) {
                return 0;
            }
            reverse = reverse * 10 + pop;
        }
        return reverse;
    }
}
