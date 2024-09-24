// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        
        if (l1 == null) { // return copy of l2 if l1 is null
            return copyList(l2);
        }

        ListNode current = l1; // finds the end of l1
        while (current.next != null) {
            current = current.next;
        }

        current.next = copyList(l2); // appends a copy of l2 to l1

        return l1;
    }

    private static ListNode copyList(ListNode head) {
        if (head == null) {
            return null;
        }

        // creates a new head for new list
        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead; 
        ListNode orig = head.next;

        while (orig != null) {
            current.next = new ListNode(orig.val);
            current = current.next;
            orig = orig.next;
        }

        return newHead;
    }
}