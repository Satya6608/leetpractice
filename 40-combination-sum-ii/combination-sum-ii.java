class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, target, candidates, list, res);

        return res;
    }

    public static void dfs(int index, int target, int[] nums, List<Integer> list, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;
            list.add(nums[i]);
            dfs(i + 1, target -nums[i], nums, list, res);
            list.remove(list.size() - 1);
        } 
    }
}