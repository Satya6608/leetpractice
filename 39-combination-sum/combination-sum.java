class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          List<List<Integer>>ll = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        coin_change(candidates,target,l,0,ll);
        return ll;

    }
    public static void coin_change(int candidates[], int target, ArrayList<Integer> l, int idx, List<List<Integer>> ll){
        if(target==0){
            //System.out.println(l);
            ll.add(new ArrayList<>(l));
            return;
        }
        if(target<0){
            return;
        }
        for(int i =idx;i<candidates.length;i++){
            l.add(candidates[i]);
            coin_change(candidates,target-candidates[i],l,i,ll);
            l.remove(l.size()-1);
        }
    }
}