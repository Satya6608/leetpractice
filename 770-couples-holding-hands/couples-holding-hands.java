class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int[] pos = new int[n];

        for(int i=0; i<n; i++)
        pos[row[i]] = i;

        int ans = 0;

        for(int i = 0; i < n; i+=2){
          int actualPair = row[i] + (row[i] % 2 == 0 ? 1 : -1);
          int currPair = row[i+1];

          if(currPair != actualPair){
            swap(row, i+1, pos[actualPair]);
            swap(pos, currPair, actualPair);

            ans++;
          }
        }
        return ans;
    }
    static void swap(int[]arr, int first, int second){
           int temp = arr[first];
           arr[first] = arr[second];
           arr[second] = temp;
    }
}