public class DLL {
   private Node head;

   public void insertFirst(int val){
       Node node = new Node(val);
       node.next = head;
       node.prev = null;
       if(head != null){
       head.prev = node;
       }
       head = node;
   }
   public void insertLast(int val){
       Node node = new Node(val);
       Node last = head;
       node.next = null;
       if(head == null){
           node.prev = null;
           head = node;
           return;
       }
       while(last.next != null){
           last = last.next;
       }
       last.next = node;
       node.prev = last;
   }
   public void insert(int after, int val){
       Node node = new Node(val);
       Node p = find(after);
       node.next = p.next;
       p.next = node;
       node.prev = p;


   }

  public void display(){
       Node node = head;
       Node last =  null;
       while(node != null){
           System.out.print(node.val+" -> ");
           last = node;
           node = node.next;
       }
      System.out.println("END");
      System.out.println("print in reverse");

       while(last != null){
           System.out.print(last.val+" -> ");
            last = last.prev;
       }
      System.out.print("START");
      System.out.println();
  }
  public Node find(int value){
       Node temp = head;
       while(temp != null){
           if(temp.val == value){
               return temp;
           }
           temp = temp.next;
       }
       return null;
  }
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
