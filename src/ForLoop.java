public class ForLoop {
    public static void main(String[] args) {
        for (int n = 10; n > 0; n -= 2) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            for (int k = 0; k < 10; k++) {
                System.out.println(k);
            }
        }
    }

}