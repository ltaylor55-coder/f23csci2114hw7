
// 906609
public class Taylor4 {
    
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int max = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                int prod = i * j;
                if (prod > max && isPalindrome(prod)) {
                    max = prod;
                }
            }
        }
        System.out.println(max);
    }
}