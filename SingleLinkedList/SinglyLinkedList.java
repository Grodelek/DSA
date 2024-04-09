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
    void printList(){
        ListNode temp = head;
        if(head == null){
            System.out.println(0);;
        }
        while(temp != null){
            System.out.print(temp.data+"--> ");
            temp = temp.next;
        }
        System.out.print("null");
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
    }
}
