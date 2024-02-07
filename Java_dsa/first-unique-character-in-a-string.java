class Solution {
    public int firstUniqChar(String s) {
         Map<Character, Integer> newMap = new HashMap<>();
         for(char a : s.toCharArray()){
             newMap.put(a, newMap.getOrDefault(a,0)+1);
         }

         for(int i=0; i<s.length(); i++){
             if(newMap.get(s.charAt(i)) == 1){
                 return i;
             }
         }
         return -1;
    }
}