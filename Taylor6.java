// 25164150
public class Taylor6 {
    public static void main(String[] args) {
        int n = 100;
        long sum = n * (n + 1L) / 2;
        long sumOfSquares = n * (n + 1L) * (2L * n + 1) / 6;
        long difference = sum * sum - sumOfSquares;
        System.out.println(difference);
    }
}