
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {

        ListNode newNode = new ListNode(val);

        // insert at beginning
        if (position == 1) { 
            newNode.next = head; 
            return newNode;
        }

        // insert at specific point
        ListNode current = head;
        int currentPosition = 1;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        // insert at end
        if (current == null) { 
            if (head == null) {
                return newNode;
            }

            current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
