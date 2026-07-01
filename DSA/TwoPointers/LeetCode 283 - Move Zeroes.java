# LeetCode 283 - Move Zeroes

## Topic
- Array
- Two Pointers

## Difficulty
Easy

## Problem Statement
Given an integer array `nums`, move all `0`s to the end while maintaining the relative order of the non-zero elements.

You must do this **in-place** without making a copy of the array.

### Example
```
Input:  nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```

---

## Approach

### Idea
- Maintain a pointer `j` which stores the index where the next non-zero element should be placed.
- Traverse the array once.
- Whenever a non-zero element is found:
  - Place it at index `j`.
  - Increment `j`.
- Count the number of zeros encountered.
- After the traversal, fill the last `count` positions with `0`.

This preserves the relative order of all non-zero elements while moving all zeros to the end.

---

## Dry Run

Input:
```
[0,1,0,3,12]
```

| i | nums[i] | j | count | Array |
|---|---------|---|-------|-------|
|0|0|0|1|[0,1,0,3,12]|
|1|1|1|1|[1,1,0,3,12]|
|2|0|1|2|[1,1,0,3,12]|
|3|3|2|2|[1,3,0,3,12]|
|4|12|3|2|[1,3,12,3,12]|

After traversal:

- `count = 2`
- Fill the last 2 positions with `0`.

Final array:
```
[1,3,12,0,0]
```

---

## Java Solution

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            } else {
                count++;
            }
        }

        for (int k = n - 1; k > n - count - 1; k--) {
            nums[k] = 0;
        }
    }
}
```

---

## Complexity Analysis

**Time Complexity:** `O(n)`

- First traversal moves all non-zero elements.
- Second traversal fills the remaining positions with zeros.

Overall: **O(n)**

**Space Complexity:** `O(1)`

- No extra array is used.

---

## Key Takeaways

- Uses the **Two Pointer** technique.
- Maintains the relative order of non-zero elements.
- Performs the operation **in-place**.
- Requires only constant extra space.

---

## Tags
- Array
- Two Pointers
- In-place Algorithm