/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> lst = new ArrayList();
        while(head != null){
          lst.add(head.val);
          head = head.next;
        }

        int lft = 0, right = lst.size()-1;
        while(lft < right && lst.get(lft) == lst.get(right)){
          lft++;
          right--;
        }
        return lft >= right;
    }
}