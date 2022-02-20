public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;

        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
            
        int originalX = x;
        int sum = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            sum = sum * 10 + lastDigit;
            x = x / 10;
        }
        if(sum == originalX)
            return true;
        return false;
    }
    
}
