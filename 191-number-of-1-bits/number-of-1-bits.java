public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String t = Integer.toBinaryString(n);
        int sum = 0;
        for(int i = 0; i < t.length(); i++){
          if(t.charAt(i) == '1') sum++;

        }
        return sum;
    }
}