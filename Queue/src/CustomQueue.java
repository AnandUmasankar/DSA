public class CustomQueue {
    Node head;
    Node tail;
    int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    CustomQueue(int value){
        Node temp=new Node(value);
        this.head=temp;
        this.tail=temp;
        length++;
    }

    public Boolean enQueue(int value){
        if(length>0){
            Node newNode=new Node(value);
            tail.next=newNode;
            tail=tail.next;
            length++;
            return true;
        }
        return false;
    }

    public Node deQueue(){
        if(length>0){
            if(length==1){
                Node current=head;
                head=null;
                length--;
                return current;
            }else{
                Node current=head;
                head=head.next;
                length--;
                return current;
            }
        }
        return null;
    }
    public Boolean isEmpty(){
        return length>0?false:true;
    }
    public int size(){
        return length;
    }
    public void printQueue(){
        Node current=head;
        while(current!=null){
            System.out.print(current.value+" <- ");
            current=current.next;
        }
    }
}
