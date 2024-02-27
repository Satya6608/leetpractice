class Solution {
   int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
  String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
  public String intToRoman(int num) {
    StringBuilder sb = new StringBuilder();
    int n = values.length;
    for(int i=n-1; i>=0; i--) {
      int cur = values[i];
      int m = num / cur;
      num = num % cur;
      for(int j=0; j<m; j++) {
        sb.append(symbols[i]);
      }
    }
    return sb.toString();
    }
}