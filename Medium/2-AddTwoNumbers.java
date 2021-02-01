class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = createNode(l1, l2, 0);
        return newNode;
    }
    
    public ListNode createNode(ListNode l1, ListNode l2, int carry) {
        int l1val;
        int l2val;
        if (l1 == null) {
            l1val = 0;
        } else {
            l1val = l1.val;
        }
        
        if (l2 == null) {
            l2val = 0;
        } else {
            l2val = l2.val;
        }

        int value = l1val + l2val + carry;
        if (value >= 10) {
            value -= 10;
            carry = 1;
        } else {
            carry = 0;
        }
        
        if (l1.next == null && l2.next == null) {
            if (carry == 1) {
                return new ListNode(value, new ListNode(carry));
            } else {
                return new ListNode(value);
            }
            
        }
        
        if (l1.next == null) {
            return new ListNode(value, createNode(new ListNode(), l2.next, carry));
        }
        if (l2.next == null) {
            return new ListNode(value, createNode(l1.next, new ListNode(), carry));
        }
        return new ListNode(value, createNode(l1.next, l2.next, carry));
        
    }
}