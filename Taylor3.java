// 6857
public class Taylor3 {
    public static void main(String[] args) {
        long n = 600851475143L;
        long largest = 2;
        
        // Divide by 2 first
        while (n % 2 == 0) {
            largest = 2;
            n /= 2;
        }
        
        // Check odd factors
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largest = i;
                n /= i;
            }
        }
        
        // If remainder is a prime greater than sqrt
        if (n > 2) {
            largest = n;
        }
        
        System.out.println(largest);
    }
}
