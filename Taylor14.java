// 837799
public class Taylor14 {
    
    public static long collatzLength(long n) {
        long length = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            length++;
        }
        return length;
    }
    
    public static void main(String[] args) {
        long maxLength = 0;
        long bestStart = 1;
        
        for (long i = 1; i < 1_000_000; i++) {
            long length = collatzLength(i);
            if (length > maxLength) {
                maxLength = length;
                bestStart = i;
            }
        }
        
        System.out.println(bestStart);
    }
}