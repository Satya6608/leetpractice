class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String opr : operations) x += (44 - opr.charAt(1));
        return x; 
    }
}