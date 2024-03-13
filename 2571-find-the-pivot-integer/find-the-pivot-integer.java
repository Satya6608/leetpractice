class Solution {
    public int pivotInteger(int n) {

          int sum = n*(n+1)/2;
          int a = (int)Math.sqrt(sum);

          if(a*a == sum) return a;
          else return -1;
    }
}