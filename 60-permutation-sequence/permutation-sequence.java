class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> a=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        int f=1;
        for(int i=1;i<n;i++){
            f=f*i;
            a.add(i);
        }
        a.add(n);
        k--;
        while(true){
            s.append(a.get(k/f));
            a.remove(k/f);
            if(a.size()==0){
                break;
            }
            k%=f;
            f/=a.size();
        }
        return s.toString();
    }
}