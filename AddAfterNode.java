/*
 * Question 5.1:
 * Write a code that add an object/node into linkedList list
 */
class Node {

  int val;
  Node next;

  Node(int val) {
    this.val = val;
    this.next = null;
  }
}

public class AddAfterNode {

  public static void addAfterNode(Node head, int data) {
    int afterInsert = 4;
    Node n = new Node(data);
    Node curr = head;
    if (head == null) {
      head = n;
      return;
    }

    while (curr != null && curr.val != afterInsert) {
      curr = curr.next;
    }

    if (curr == null) {
      System.out.println(
        "Node with value " + afterInsert + " not found in the list."
      );
      return;
    }

    Node nextNode = curr.next;
    curr.next = n;
    n.next = nextNode;
  }

  public static void printLinkedList(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.val + " ");
      curr = curr.next;
    }
    System.out.println();
  }

  public static void main(String... args) {
    Node head = new Node(4);
    head.next = new Node(12);
    int data = 8;

    addAfterNode(head, data);
    printLinkedList(head);
  }
}
