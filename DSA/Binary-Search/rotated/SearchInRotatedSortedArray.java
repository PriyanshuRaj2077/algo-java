/*
 * LeetCode 33 - Search in Rotated Sorted Array
 *
 * Approach:
 * 1. Find the pivot (largest element) using binary search.
 * 2. Perform binary search on the left sorted half.
 * 3. If not found, perform binary search on the right sorted half.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int pivot = -1;

        // Find pivot
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                pivot = mid;
                break;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                pivot = mid - 1;
                break;
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Binary search in left half
        start = 0;
        int leftEnd = pivot;

        while (start <= leftEnd) {
            int mid = start + (leftEnd - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                leftEnd = mid - 1;
            }
        }

        // Binary search in right half
        int rightStart = pivot + 1;
        end = nums.length - 1;

        while (rightStart <= end) {
            int mid = rightStart + (end - rightStart) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                rightStart = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}