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

class Solution {

  public int getDecimalValue(ListNode head) {
    int result = 0;

    while (head != null) {
      //Left-shift the current result by 1 and add, current element value
      result = (result << 1) + head.val;

      //move to the next node
      head = head.next;
    }

    return result;
  }
}

public class BinnaryNumberLinkedList {

  public int getDecimalValue(ListNode head) {
    int result = 0;

    while (head != null) {
      //Left-shift the current result by 1 and add, current element value
      result = (result << 1) + head.val;

      //move to the next node
      head = head.next;
    }

    return result;
  }
}
