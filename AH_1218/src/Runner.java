import java.util.Arrays;
import java.util.function.Function;

public class Runner {
    static long[] arr = new long[100];

    static long COUNT = 0;

    public static void main(String[] args) {
        Arrays.fill(arr, 0, arr.length - 1, -1);

        for (int i = 0; i <= 5; i++) {
            System.out.printf("i=%d fib=%d fibTab=%d fibMemo=%d\n", i, fib(i), fibTab(i), fibMemo(i));
        }

        System.out.println("Testing fib");
        test(Runner::fib, 5, 10, 25, 50);
        System.out.println("Testing fibTab");
        test(Runner::fibTab, 5, 10, 25, 50);
        System.out.println("Testing fibMemo");
        test(Runner::fibMemo, 5, 10, 25, 50);
    }

    public static void test(Function<Integer, Long> testFunction, int ...ns) {
        for (int n : ns) {
            COUNT = 0;

            long start = System.currentTimeMillis();
            long value = testFunction.apply(n);
            long stop = System.currentTimeMillis();

            System.out.printf("testFunction(%d) = %d, count=%d, elapsedMs=%d\n", n, value, COUNT, stop-start);
        }
    }

    public static long fib(int n) {
        COUNT++;

        if (n < 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static long fibTab(int n) {
        if (n < 2) {
            return 1;
        }

        long[] arr2 = new long[n + 1];
        arr2[0] = 1;
        arr2[1] = 1;

        for (int i = 2; i <= n; i++) {
            COUNT++;

            arr2[i] = arr2[i - 1] + arr2[i - 2];
        }

        return arr2[n];
    }

    public static long fibMemo(int n) {
        COUNT++;

        if (arr[n] != -1) {
            return arr[n];
        }

        if (n < 2) {
            return 1;
        }

        arr[n] = fibMemo(n - 1) + fibMemo(n - 2);
        return arr[n];
    }
}