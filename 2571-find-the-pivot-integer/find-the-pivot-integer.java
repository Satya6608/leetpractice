class Solution {
    public int pivotInteger(int n) {
        if(n == 0) return -1;
        else if(n == 1) return 1;
        else{
          int sum = n*(n+1)/2;
          double a = Math.sqrt(sum);

          if(a - Math.ceil(a) == 0) return (int)a;
          else return -1;
        }
    }
}