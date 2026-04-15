// Pattern: Two Pointers
// Problem: Container With Most Water (ques no 11 , leetcode)
// Link: https://leetcode.com/problems/container-with-most-water/
// Difficulty: Medium
// Time: O(n)
// Space: O(1)

class Solution {
    public int maxArea(int[] height) {
       int low = 0;
       int high = height.length-1;
       int max = 0;

       while(low<high){
        int area = Math.min(height[low], height[high])*(high-low);
        max = Math.max(area , max);

        if(height[low]> height[high]){
            high--;
        }else{
            low++;
        }
       }
       return max;
    }
}    
