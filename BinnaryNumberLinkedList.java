import org.w3c.dom.NodeList;

class ListNode {

  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class BinnaryNumberLinkedList {

  public static int getDecimalValue(ListNode head) {
    int result = 0;

    while (head != null) {
      //Left-shift the current result by 1 and add, current element value
      result = (result << 1) + head.val;

      //move to the next node
      head = head.next;
    }

    return result;
  }

  public static void main(String... args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(1);

    int decimal = getDecimalValue(head);
    System.out.println(decimal);
  }
}
