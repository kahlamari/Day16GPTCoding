package in.kahl.gpt;

public class PalindromeCheck {
    public static void main(String[] args) {
        String testString = "anna";
        boolean isPalindrome = isPalindrome(testString);
        System.out.println("Is '" + testString + "' a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
