

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length=0;

    class Node{
        Node pre;
        Node next;
        int value;

        public Node(int value){
            this.value=value;
        }
    }
    DoublyLinkedList(int value){
        Node n=new Node(value);
        if(length==0){
            this.head=n;
            this.tail=n;
            length++;
        }else{
            tail=n;
            length++;
        }
    }

    public int getHead(){
        return head.value;
    }
    public int getTail(){
        return tail.value;
    }
    public int getLength(){
        return length;
    }
    public void printList(){
        Node pointer=head;
        while(pointer!=null){
            System.out.println(pointer.value);
            pointer=pointer.next;
        }
    }
    public Boolean append(int value){
        Node newNode=new Node(value);
        tail.next=newNode;
        newNode.pre=tail;
        tail=newNode;
        length++;
        return true;
    }
    public Boolean removeLast(){
        if(length==0) return  null;
        if(length==1){
            head=null;
            tail=null;
        }else{
            Node temp=tail;
            tail=tail.pre;
            tail.next=null;
            temp.pre=null;
        }
        length--;
        return true;
    }
    public Boolean prepend(int value){
        Node newNode=new Node(value);
        if(length==0) {
            head=newNode;
            tail=newNode;
        } else{
            newNode.next=head;
            head.pre=newNode;
            head=head.pre;
        }
        length++;
        return true;
    }
    public Node removeFirst(){
        if(length==0) return null;
        if(length==1){
            head=null;
            tail=null;
            return null;
        }else{
            Node newNode=head;
            head=head.next;
            head.pre=null;
            newNode.next=null;
            length--;
            return newNode;
        }
    }
    public Node get(int index){
        int value=0;
        if(length==0 || index>length) return null;
        if(length==1) return head;
        else{
            int count=0;
            while(count<index){
                //value=head.value;
                head=head.next;
                count++;
            }
            return head;

        }
    }
    public Boolean set(int index,int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
            length++;
        }else if(index>length){
            append(value);
        }else{
            int count=0;
            Node currentPointer=head;
            while (count<index){
                if(count+1==index){
                    currentPointer.value=value;
                }
                currentPointer=currentPointer.next;
                count++;
            }
        }
        return true;
    }
    public Boolean insert(int index,int value){
        Node newNode=new Node(value);
        if(length==0 || index<0){
            head=newNode;
            tail=newNode;
            length++;
        }else if(index>length){
            prepend(value);
        }else{
            Node before=get(index-1);
            Node after=before.next;
            newNode.pre=before;
            newNode.next=after;
            before.next=newNode;
            after.pre=newNode;
            length++;
        }
        return  true;
    }
    public Node remove(int index){
        if(index<0 || index>length){
            return null;
        }else{
            Node removeNode=get(index);
            Node after=removeNode.next;
            Node before=removeNode.pre;
            before.next=after;
            after.pre=before;
            removeNode.next=null;
            removeNode.pre=null;
            return removeNode;
        }
    }

}
