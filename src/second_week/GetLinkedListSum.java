package second_week;

class LinkedListSum{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public LinkedListSum(int value){
        this.head = new Node(value);
    }

    public void append(int value){
        Node cur = this.head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(value);
    }
}

public class GetLinkedListSum {
    public static int getSingleListSum(LinkedListSum linkedList){
        int sum = 0;
        LinkedListSum.Node cur = linkedList.head;
        while (cur != null){
            sum = sum * 10 + cur.data;
            cur = cur.next;
        }

        return sum;
    }
    public static int getLinkedListSum(LinkedListSum linkedList1, LinkedListSum linkedList2){
        int sum1 = getSingleListSum(linkedList1);
        int sum2 = getSingleListSum(linkedList2);

        return sum1 + sum2;
    }

    public static void main(String[] args) {
        LinkedListSum linkedList1 = new LinkedListSum(6);
        linkedList1.append(7);
        linkedList1.append(8);

        LinkedListSum linkedList2 = new LinkedListSum(3);
        linkedList2.append(5);
        linkedList2.append(4);

        System.out.println(getLinkedListSum(linkedList1, linkedList2));
    }
}
