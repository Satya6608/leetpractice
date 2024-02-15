class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          List<List<Integer>> result = new ArrayList<>();
        Stack<Triple> stack = new Stack<>();
        stack.push(new Triple(0, target, new ArrayList<>()));

        while (!stack.isEmpty()) {
            Triple current = stack.pop();
            int currentIndex = current.index;
            int currentTarget = current.target;
            List<Integer> currentCombination = current.combination;

            while (currentIndex < candidates.length) {
                int currentCandidate = candidates[currentIndex];

                if (currentCandidate == currentTarget) {
                    currentCombination.add(currentCandidate);
                    result.add(new ArrayList<>(currentCombination));
                    currentCombination.remove(currentCombination.size() - 1);
                } else if (currentCandidate < currentTarget) {
                    currentCombination.add(currentCandidate);
                    stack.push(new Triple(currentIndex, currentTarget - currentCandidate, new ArrayList<>(currentCombination)));
                    currentCombination.remove(currentCombination.size() - 1);
                }

                currentIndex++;
            }
        }

        return result;
    }

    // MAKING TRIPLE TYPE
    private static class Triple {
        int index;
        int target;
        List<Integer> combination;

        public Triple(int index, int target, List<Integer> combination) {
            this.index = index;
            this.target = target;
            this.combination = combination;
        }
    }
}