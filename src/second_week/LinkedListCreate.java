package second_week;

class LinkedListCr {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public LinkedListCr(int value){
        head = new Node(value);
    }

}

public class LinkedListCreate{
    public static void main(String[] args) {
        LinkedListCr linkedList = new LinkedListCr(5);

    }
}
