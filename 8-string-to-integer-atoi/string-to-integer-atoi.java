class Solution {
    public int myAtoi(String s) {
     int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        int sign = 1;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        int result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = Character.getNumericValue(s.charAt(i));

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        result *= sign;

        return result;
    }  
}