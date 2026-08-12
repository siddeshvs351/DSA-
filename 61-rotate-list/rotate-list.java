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
    ListNode newNode(ListNode head,int d){
        ListNode temp=head;
        int i=1;
        while(i!=d){
            temp=temp.next;
            i++;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null || head.next==null || k==0) return head;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;

        }
        if(k%len==0) return head;
        k=k%len;
        tail.next=head;
        ListNode newnode=newNode(head,len-k);
        head=newnode.next;
        newnode.next=null;
        return head;

    }
}