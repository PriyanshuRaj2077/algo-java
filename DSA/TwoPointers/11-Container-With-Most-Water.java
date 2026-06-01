# LeetCode 11 - Container With Most Water

## Pattern

Two Pointers (Opposite Ends)

## Java Solution

```java
class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = 0;

        while (low < high) {
            int area = Math.min(height[low], height[high]) * (high - low);
            max = Math.max(max, area);

            if (height[low] > height[high]) {
                high--;
            } else {
                low++;
            }
        }

        return max;
    }
}
```

## Approach

* Initialize two pointers:

  * `low` at the beginning.
  * `high` at the end.
* Calculate the area formed by the two lines.
* Update the maximum area found so far.
* Move the pointer with the smaller height because it is the limiting factor.
* Repeat until both pointers meet.

## Intuition

The area depends on:

* Width → `(high - low)`
* Height → `min(height[low], height[high])`

Moving the taller line is not useful because the shorter line already limits the area. Therefore, we move the shorter line and hope to find a taller one that increases the area.

## Time Complexity

**O(n)**

## Space Complexity

**O(1)**

## Key Observation

At every step, we discard one impossible candidate by moving the pointer at the shorter line, allowing us to solve the problem in a single pass.
