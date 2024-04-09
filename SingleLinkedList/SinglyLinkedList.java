 public class SinglyLinkedList{
    ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Method for printing list elements
    void printList(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+"--> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    //Method for getting length of the list
    int length(){
        ListNode temp = head;
        int count = 0;
        if(head == null){
            return 0;
        }
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
  //method when you add element at the start of the list
    void addFirst(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
    SinglyLinkedList sll = new SinglyLinkedList();
    ListNode second = new ListNode(4);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(7);
    sll.head = new ListNode(5);
    sll.head.next = second;
    second.next = third;
    third.next = fourth;
    sll.printList();
    System.out.println("\n"+"List length: "+sll.length());
    sll.addFirst(6);
    sll.printList();
    }
}
