package leetcode.Example9;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revL1 = reverseList(l1);
        ListNode revL2 = reverseList(l2);
        
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        
        while (revL1 != null || revL2 != null) {
            int x = (revL1 != null) ? revL1.val : 0;
            int y = (revL2 != null) ? revL2.val : 0;
            
            int sum = carry + x + y;
            carry = sum / 10;
            
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            if (revL1 != null) revL1 = revL1.next;
            if (revL2 != null) revL2 = revL2.next;
        }
        
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        
        return reverseList(dummyHead.next);
    }
    
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
    }
}
