# LeetCode 875 - Koko Eating Bananas

## Problem
Koko loves to eat bananas. There are several piles of bananas, and the `i-th` pile has `piles[i]` bananas.

The guards will return in `h` hours.

Koko can decide her banana-eating speed `k` (bananas per hour).

Each hour:
- She chooses one pile
- Eats up to `k` bananas
- If the pile has less than `k`, she eats the entire pile

Return the minimum integer `k` such that she can eat all bananas within `h` hours.

---

## Approach

This problem is solved using **Binary Search on Answer**.

### Key Observation
- Minimum possible speed = `1`
- Maximum possible speed = `max(piles)`

For every speed:
1. Calculate total hours needed
2. If total hours exceed `h`
   - speed is too slow
   - increase speed
3. Otherwise
   - try smaller speed

---

## Java Solution

```java
class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        // Find maximum pile
        int max = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if (max < piles[i]) {
                max = piles[i];
            }
        }

        int start = 1;
        int end = max;

        // Binary Search on answer
        while (start <= end) {

            int mid = start + (end - start) / 2;

            long totalHours = 0;

            // Calculate hours needed at speed = mid
            for (int i = 0; i < piles.length; i++) {

                // Ceiling division
                totalHours += (piles[i] + mid - 1) / mid;
            }

            // Need higher speed
            if (totalHours > h) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}