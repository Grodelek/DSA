public class Ll{
    Node head;
    Node tail;
    private int size;
    Ll(){
        this.size = 0;
    }
    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void addLast(int val){
        if(tail == null){
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }
    public void addIndexOf(int val, int index){
        if(index == 0){
            addFirst(val);
            return;
        }
        if(index == size){
            addLast(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node node = get(size - 2);
        int val =  tail.val;
        tail = node;
        tail.next = null;
         size--;
         return val;
    }
    public int deleteIndexOf(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }
        Node nodeP = get(index - 1);
        int val = nodeP.next.val;
        nodeP.next = nodeP.next.next;

        size--;
        return val;
    }
    public Node get(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    private class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
