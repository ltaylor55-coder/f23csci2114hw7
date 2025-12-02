// 31875000
public class Taylor9 {
    public static void main(String[] args) {
        int product = 0;
        outer:
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (c <= b) {
                    continue;
                }
                if (a * a + b * b == c * c) {
                    product = a * b * c;
                    break outer;
                }
            }
        }
        System.out.println(product);
    }
}