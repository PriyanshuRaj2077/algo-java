# LeetCode 1482 - Minimum Number of Days to Make m Bouquets

## Problem

You are given an integer array `bloomDay`, an integer `m`, and an integer `k`.

You want to make `m` bouquets.

To make one bouquet:
- You need exactly `k` adjacent flowers
- A flower can be used only once

The `i-th` flower blooms on `bloomDay[i]`.

Return the minimum number of days needed to make `m` bouquets.

If impossible, return `-1`.

---

## Approach

This problem is solved using **Binary Search on Answer**.

### Key Observation

- Minimum possible day = minimum value in `bloomDay`
- Maximum possible day = maximum value in `bloomDay`

For every day:
1. Count how many bouquets can be formed
2. If bouquets >= `m`
   - try smaller day
3. Otherwise
   - increase day

---

## Java Solution

```java
class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        // Impossible case
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int start = bloomDay[0];
        int end = bloomDay[0];

        // Find minimum and maximum bloom day
        for (int i = 1; i < bloomDay.length; i++) {

            if (bloomDay[i] < start) {
                start = bloomDay[i];
            }

            if (bloomDay[i] > end) {
                end = bloomDay[i];
            }
        }

        // Binary Search on answer
        while (start <= end) {

            int mid = start + (end - start) / 2;

            int flowers = 0;
            int bouquets = 0;

            // Count bouquets possible on current day
            for (int i = 0; i < bloomDay.length; i++) {

                if (bloomDay[i] <= mid) {

                    flowers++;

                    if (flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }

                } else {
                    flowers = 0;
                }
            }

            // Enough bouquets possible
            if (bouquets >= m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
```

---

## Time Complexity

```text
O(n log(maxDay))
```

Where:
- `n` = size of array
- `maxDay` = maximum bloom day

---

## Space Complexity

```text
O(1)
```

---

## Pattern Used

```text
Binary Search on Answer
```

---

## Important Learning

This pattern is used when:
- Answer lies in a range
- Condition becomes monotonic

Example:
- possible → possible → possible
- impossible → impossible → possible

That allows Binary Search on the answer itself.