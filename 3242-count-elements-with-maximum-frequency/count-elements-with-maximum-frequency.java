class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        int count = 0;
        int maxfreq = Integer.MIN_VALUE;
        for(int freq : map.values()) maxfreq = Math.max(maxfreq, freq);

        for(int freq : map.values()) if(freq == maxfreq) count += maxfreq;
        return count;
    }
}