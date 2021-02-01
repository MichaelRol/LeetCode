public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        int store;
        ListNode curr = head;
        if (head == null || head.next == null) {
            return head;
        } 
        while (curr != null && curr.next != null) {
            store = curr.val;
            curr.val = curr.next.val;
            curr.next.val = store;
            curr = curr.next.next;
        }
        return head;
    }
}
