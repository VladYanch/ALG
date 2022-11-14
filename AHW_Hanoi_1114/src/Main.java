public class Main {
    public static void main(String[] args) {
        hanoi(5);
    }

    public static void hanoi(int n) {
        helper (n, 1, 3, 2);
    }

    public static void helper(int n, int start, int end, int temp) {
        if (n == 0) {
            return;
        }
        helper(n-1, start, temp, end);
        System.out.println("move from " + start + " to " + end);
        helper(n-1, temp, end, start);
    }
}