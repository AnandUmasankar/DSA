public class CustomLinkedList {
    int length;
    Node head;
/*Operation Supported
* 1.Remove First;
* 2.Remove Last;
* 3.Remove At Index
* */
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    CustomLinkedList(int value){
        if(head!=null){
            System.out.println("Already Initialized Re Initializing");
        }
        Node newNode=new Node(value);
        this.head=newNode;
        ++length;
    }

    public Boolean add(int value){
        try{
            Node newNode=new Node(value);
            if(head==null){
                head=newNode;
                return true;
            }else{
                Node current=head;
                while(current.next!=null){
                    current=current.next;
                }
                current.next=newNode;
                ++length;
                return true;
            }
        }catch(Exception e){
            return false;
        }
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public Node removeFirst(){
        if(length!=0){
            Node current=head;
            head=head.next;
            length--;
            return current;
        }
        return null;
    }

    public Node removeLast(){
        if(length==1){
            Node current=head;
            head=null;
            return current;
        }
        else if(length==2){
            Node current=head.next;
            head.next=null;
            return current;
        }
        if(length!=0){
            Node current=head;
            Node current1=head.next;

            while(current1.next!=null){
                current=current.next;
                current1=current1.next;
            }
            current.next=null;
            length--;
            return current1;
        }
        return null;
    }
    public Node removeAt(int index){
        if(length!=0){
            if(index<0 || index>length-1){
                return null;
            }else if (length==2 && index==1){
                return removeLast();
            }else{
                Node current0=head;
                Node current=head.next;
                Node current1=head.next.next;
                int counter=1;
                while(counter!=index-1){
                    counter++;
                    current0=current0.next;
                    current=current.next;
                    current1=current1.next;
                }
                current0.next=current1;
                length--;
                return current;
            }
        }
        return null;
    }
}
