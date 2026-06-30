class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int slast = 0;
        int last = 1;

        for (int i = 2; i <= n; i++) {
            int current = slast + last;
            slast = last;
            last = current;
        }

        return last;
    }
}