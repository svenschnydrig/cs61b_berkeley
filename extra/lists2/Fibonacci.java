public class Fibonacci {
    public static int Fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }

    public static int FibEff(int n) {
        int[] Fibs = new int[n];
        if (n <= 1) {
            return n;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }

    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10 */
        int fib = Fib(3);
        System.out.println(fib);
    }
}
