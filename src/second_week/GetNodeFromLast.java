package second_week;


class LinkedListFromLast{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public LinkedListFromLast(int value){
        this.head = new Node(value);
    }

    public void append(int value){
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(value);
    }

    public Node getNodeFromLast(int k){
        int length = 1;
        Node cur = this.head;
        while(cur != null){
            length ++;
            cur = cur.next;
        }
        cur = this.head;
        int endLength = length - k;
        System.out.println("endLength = " + endLength);
        for(int i = 0; i < endLength; i++){
            cur = cur.next;
        }
        return cur;
    }
}
public class GetNodeFromLast {
    public static void main(String[] args) {
        LinkedListFromLast linkedList = new LinkedListFromLast(6);
        linkedList.append(7);
        linkedList.append(8);

        System.out.println(linkedList.getNodeFromLast(2).data);
    }
}
