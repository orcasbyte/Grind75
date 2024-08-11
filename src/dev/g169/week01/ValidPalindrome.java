package dev.g169.week01;

/**
 * <h1>Valid Palindrome</h1>
 * <p>
 * <span>🔗 Link:
 * </span><span>https://leetcode.com/problems/valid-palindrome/description/</span>
 * </p>
 * <p>
 * <span>💪🏼 Difficulty: </span><strong style="color: green">Easy</strong>
 * </p>
 * <p>
 * <span>🏷️ Topics: </span><span>Two Pointers, String</span>
 * </p>
 */
public class ValidPalindrome {

    // 2️⃣ two pointer method
    private static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0, end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    // ♻️ recursion method
    private static boolean isPalindrome(int index, String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if (index >= s.length() / 2)
            return true;

        if (s.charAt(index) != s.charAt(s.length() - 1 - index))
            return false;

        return isPalindrome(index + 1, s);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));

        System.out.println(isPalindrome(0, s));
    }

}
