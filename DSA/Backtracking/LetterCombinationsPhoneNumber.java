/*
LeetCode 17 - Letter Combinations of a Phone Number

Pattern:
Backtracking + Recursion

Problem:
Given a string containing digits from 2-9 inclusive,
return all possible letter combinations that the number could represent.

Example:
Input: "23"
Output: [ad, ae, af, bd, be, bf, cd, ce, cf]

Approach:
- Each digit maps to multiple characters like a phone keypad.
- Use recursion to generate all possible combinations.
- Process one digit at a time.
- Append each possible character and recursively solve for remaining digits.

Key Idea:
Generate combinations using DFS/backtracking.

Time Complexity:
O(4^n)

Space Complexity:
O(n)

Learning:
- Recursive tree traversal
- String building using recursion
- Backtracking combination generation
*/

import java.util.*;

class Solution {

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        return pad("", digits);
    }

    public static ArrayList<String> pad(String p, String up) {

        if (up.isEmpty()) {

            ArrayList<String> list = new ArrayList<>();
            list.add(p);

            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        // Handles extra shift caused by digits 7 and 9
        int extra = 0;

        if (digit > 7) {
            extra++;
        }

        int start = (digit - 2) * 3 + extra;

        int length = (digit == 7 || digit == 9) ? 4 : 3;

        for (int i = start; i < start + length; i++) {

            char ch = (char) ('a' + i);

            list.addAll(pad(p + ch, up.substring(1)));
        }

        return list;
    }
}