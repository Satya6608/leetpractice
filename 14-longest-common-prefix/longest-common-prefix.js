/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
  if (strs.length === 0) return '';
     let ans = '';

        strs.sort();
        let first = strs[0];
        let last = strs[strs.length - 1];

        for(let i = 0; i < Math.min(first.length, last.length); i++){
          if(first.charAt(i) != last.charAt(i)) return ans.toString();
          ans += first.charAt(i);
        }

        return ans.toString();
};