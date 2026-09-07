class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        for(int i = temp; i > 0; i = i / 10) {
            int digit = i % 10;
            rev = rev * 10 + digit;
        }
        return rev == x;
    }
}