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
    public int numComponents(ListNode head, int[] nums) {
        
       Set<Integer> set = new HashSet<>();
       for(int num:nums){
        set.add(num);
       }
         int ans=0;
         ListNode curr= head;

         while(curr!=null){
            if(set.contains(curr.val) && (curr.next==null|| ! set.contains(curr.next.val)))
            {
            ans++;
            }
            curr=curr.next;

         }
         return ans;
    }
}