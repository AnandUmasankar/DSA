//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList(0);
        for(int i=1;i<10;i++){
            dll.append(i);
        }
        dll.printList();
        System.out.println("----------");
        System.out.println( dll.get(100));
        System.out.println(dll.set(3,1000));
        dll.printList();



    }

}