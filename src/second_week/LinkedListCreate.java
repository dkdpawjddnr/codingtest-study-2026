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

    public void append(int value){
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(value);
    }

    public void printAll(){
        Node cur = head;
        while(cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }


public class LinkedListCreate{
    public static void main(String[] args) {
        LinkedListCr linkedList = new LinkedListCr(5);

    }
}
