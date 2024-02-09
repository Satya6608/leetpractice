class Solution {
    public int findGCD(int[] nums) {
        int max=0, min=1001;
        for (int val:nums) {
            if (max<val) max=val;
            if (min>val) min=val;
        }
        return ekub(max,min);
    }

    public static int ekub(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}