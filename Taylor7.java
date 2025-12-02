// 104743
public class Taylor7 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        while (count < 10001) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        System.out.println(num);
    }
}