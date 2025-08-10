
public class CustomBinarySearchTree {
    Node top;
    int height;

    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
        }
    }

    CustomBinarySearchTree(int value){
        if(this.top==null){
            Node newNode=new Node(value);
            this.top=newNode;
            height++;
        }
    }

    public Boolean add(int value){
        Node temp=new Node(value);
        Node current=top;
        while(current!=null){
            if(current.value==value){
                return false;
            }
            if(value<current.value){
                if(current.left==null){
                    current.left=temp;
                    break;
                }else{
                    current=current.left;
                }
            }
            if(value>current.value){
                if(current.right==null){
                    current.right=temp;
                    break;
                }else{
                    current=current.right;
                }
            }
        }
        height++;
        return true;
    }

    public boolean search(int value){
        if(top.value==value){
            return true;
        }
        Node current=top;
        while(current!=null){
            if(current.value==value){
                return true;
            }else if(current.value<value && current.right!=null){
                if(current.right.value==value){
                    return true;
                }else{
                    current=current.right;
                }
            }else if(current.value>value && current.left!=null){
                if(current.left.value==value){
                    return true;
                }else{
                    current=current.left;
                }
            }
        }
        return false;
    }



}
