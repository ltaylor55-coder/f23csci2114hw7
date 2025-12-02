// 76576500
public class Taylor12 {
    
    // Count number of divisors of n
    public static int countDivisors(int n) {
        int count = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                count += 2; // i and n/i
            }
        }
        // If n is a perfect square, adjust
        if (sqrt * sqrt == n) {
            count--;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int n = 1;
        int triangle = 0;
        while (true) {
            triangle += n;
            if (countDivisors(triangle) > 500) {
                System.out.println(triangle);
                break;
            }
            n++;
        }
    }
}