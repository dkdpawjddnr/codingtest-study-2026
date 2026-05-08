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

    public void addNode(int index, int value){
        Node newNode = new Node(value);
        if(index == 0){
            newNode.next = head;
            this.head = newNode;
            return;
        }

        Node prevNode = getNode(index - 1);
        Node nextNode = prevNode.next;
        prevNode.next = newNode;
        newNode.next = nextNode;
    }

    public void deleteNode(int index){
        if(index == 0){
            head = head.next;
            return;
        }

        Node oldNode = getNode(index-1);
        Node delNode = getNode(index);
        oldNode.next = delNode.next;
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
        linkedList.addNode(1, 6);
        linkedList.addNode(0, 7);
        linkedList.deleteNode(1);
        System.out.println("노드 삭제 후 printAll");
        linkedList.printAll();

        // head
        //      head
        // [7]->[6]->[12]->[8]
        linkedList.deleteNode(0);
        // [6]->[12]->[8]
        System.out.println("노드 삭제 후 printAll");
        linkedList.printAll();
    }
}
