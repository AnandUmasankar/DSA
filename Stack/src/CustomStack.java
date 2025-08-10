public class CustomStack {

    int height;
    Node top;

    class Node{
        int value;
        Node child;

        public Node(int value){
            this.value=value;
        }
    }
    CustomStack(int value){
        Node temp=new Node(value);
        this.top=temp;
    }

    public Boolean push(int value){
        Node current=new Node(value);
        current.child=top;
        top=current;
        height++;
        return true;
    }
    public Node pop(){
        Node current=top;
        top=top.child;
        height--;
        current.child=null;
        return current;
    }

    public Node top(){
        Node current=top;
        return current;
    }
    public void printStack(){
        Node current=top;
        while(current!=null){
            System.out.println(current.value);
            current=current.child;
        }
    }

}
