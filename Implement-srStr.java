//Problem: Implement strStr().
//  Return the index of the first occurrence of needle in haystack, or -1 if needle is 
//  not part of haystack.

// Questions: 
//  Will haystack be guaranteed to be length >= 1? --> no

// Edge Cases:
//  haystack = null
//  Two empty strings ""

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack != null) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
