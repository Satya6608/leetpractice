class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
         Map<Integer, Integer> freq = new HashMap<>();
         for(int n : arr){
             freq.put(n, freq.getOrDefault(n, 0)+1);
         }
         List<Map.Entry<Integer, Integer>> ele = new ArrayList<>(freq.entrySet());

         ele.sort((a, b) -> a.getValue()-b.getValue());
         for(Map.Entry<Integer, Integer> entry :ele){
             if(entry.getValue()<=k){
                 k -= entry.getValue();
                 freq.remove(entry.getKey());
             }else{
                 break;
             }
         }
         return freq.size();
    }
}