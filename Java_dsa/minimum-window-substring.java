class Solution {
    public String minWindow(String s, String t) {
        if(s.isEmpty() || t.isEmpty()) return "";

        Map<Character, Integer> tmap = new HashMap<>();
        Map<Character, Integer> smap = new HashMap<>();

        int[] ans = {-1, 0, 0};

        for(char c : t.toCharArray()){
            int count = tmap.getOrDefault(c,0);
            tmap.put(c,count+1);
        }
        int l = 0, r = 0, req = tmap.size(), formed = 0;
        while(r<s.length()){
            char c = s.charAt(r);
            int count = smap.getOrDefault(c,0);
            smap.put(c,count+1);
            if(tmap.containsKey(c) && smap.get(c).intValue() == tmap.get(c).intValue()) formed++;
            while(l <= r && formed == req){
                c = s.charAt(l);
                if(ans[0] == -1 || r-l+1 < ans[0]){
                    ans[0] = r-l+1;
                    ans[1] = l;
                    ans[2] = r;
                }
                smap.put(c, smap.get(c)-1);
                if(tmap.containsKey(c) && smap.get(c).intValue() < tmap.get(c).intValue()) formed--;
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2]+1);
    }
}