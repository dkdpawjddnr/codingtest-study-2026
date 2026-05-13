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
        Node slow = this.head;
        Node fast = this.head;
        for(int i = 0; i < k; i++){
            fast = fast.next;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
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
