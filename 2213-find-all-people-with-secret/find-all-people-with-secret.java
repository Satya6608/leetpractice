class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        int[] grps = new int[100000];
        List<Integer> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for(int i = 0; i < n; ++i) grps[i] = i;
        grps[firstPerson] = 0;

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[2], b[2]));

        int i = 0;
        while(i < meetings.length){
            int currTime = meetings[i][2];
            temp.clear();

            while(i < meetings.length && meetings[i][2] == currTime){
                int g1 = find(grps, meetings[i][0]);
                int g2 = find(grps, meetings[i][1]);
                grps[Math.max(g1, g2)] = Math.min(g1, g2);
                temp.add(meetings[i][0]);
                temp.add(meetings[i][1]);
                ++i;
            }
            for(int j = 0; j < temp.size(); ++j){
                if(find(grps, temp.get(j)) !=0){
                    grps[temp.get(j)] = temp.get(j);
                }
            }
        }

        for(int j = 0; j < n; ++j){
            if(find(grps, j) == 0) res.add(j); 
        }
        return res;
    }
    private int find(int[] grps, int i){
        while(i != grps[i]) i = grps[i];
        return i;
    }
}