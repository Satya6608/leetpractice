class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums1) mp.put(num, mp.getOrDefault(num, 0) + 1);

        List<Integer> resultLst = new ArrayList<>();

        for(int nm : nums2){
          if(mp.containsKey(nm)){
            resultLst.add(nm);
            mp.remove(nm);
          }
        }

        int[] rst = new int[resultLst.size()];
        for(int i = 0; i <resultLst.size(); i++){
          rst[i] = resultLst.get(i);
        }

        return rst;
    }
}