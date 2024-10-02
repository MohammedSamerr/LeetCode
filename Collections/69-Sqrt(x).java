class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        long approx = x;  // Initial approximation
        while (approx * approx > x) {
            approx = (approx + x / approx) / 2;
        }

        return (int) approx;
    }
}