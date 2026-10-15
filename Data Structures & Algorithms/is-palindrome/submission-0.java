class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // 1. Get the characters at the current pointers
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);
            
            // 2. Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
            } 
            // 3. Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(charRight)) {
                right--;
            } 
            // 4. If both are valid, compare them (ignoring case)
            else {
                if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                    return false; // Found a mismatch
                }
                left++;
                right--;
            }
        }
        
        return true; // Pointers met in the middle successfully
    }
}
