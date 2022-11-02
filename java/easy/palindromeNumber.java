class palindromeNumber {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int temp = x;
        
        while (temp != 0)
        {
            int last = temp % 10;
            reversed = reversed * 10 + last;
            
            temp /= 10;
        }
        
        if (reversed != x || reversed < 0) return false;
        else return true;
    }
}