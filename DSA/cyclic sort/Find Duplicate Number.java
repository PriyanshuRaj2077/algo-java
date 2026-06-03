/**
 * LeetCode 287 - Find the Duplicate Number
 *
 * Approach:
 * Uses Cyclic Sort.
 *
 * Since the array contains numbers from 1 to n and only one number
 * is duplicated, each number should ideally be placed at index (value - 1).
 *
 * While placing elements in their correct positions:
 * - If the current number is not in its correct position,
 *   swap it with the element at its target index.
 * - If the target index already contains the same number,
 *   that number is the duplicate.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {

    public int findDuplicate(int[] nums) {
        int index = 0;

        while (index < nums.length) {

            // Correct position for nums[index]
            int correctIndex = nums[index] - 1;

            // If the current number is not at its correct position
            if (nums[index] != index + 1) {

                // Duplicate found
                if (nums[index] == nums[correctIndex]) {
                    return nums[index];
                }

                // Swap current element with its correct position
                swap(nums, index, correctIndex);

            } else {
                index++;
            }
        }

        return -1; // Should never occur for valid inputs
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}