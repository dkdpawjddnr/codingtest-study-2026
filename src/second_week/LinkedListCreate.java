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

    public Node getNode(int index){
        int curIndex = 0;
        Node curNode = head;

        while(curIndex != index){
            curNode = curNode.next;
            curIndex++;
        }
        return curNode;
    }
}

public class LinkedListCreate{
    public static void main(String[] args) {
        LinkedListCr linkedList = new LinkedListCr(5);
        linkedList.append(12);
        linkedList.append(8);
        linkedList.printAll();
        LinkedListCr.Node getNode = linkedList.getNode(1);
        System.out.println("getNode : " + getNode.data);
    }
}
