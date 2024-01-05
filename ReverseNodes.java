public class ReverseNodes {

  public static ListNode reverseList(ListNode head) {
    ListNode current = head;
    ListNode prev = null;

    while (current != null) {
      ListNode nextTemp = current.next;
      current.next = prev;
      prev = current;
      current = nextTemp;
    }
    return prev;
  }

  public static void main(String... args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    reverseList(head);
  }
}
