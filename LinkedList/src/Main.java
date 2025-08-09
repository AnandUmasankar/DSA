//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomLinkedList cc=new CustomLinkedList(1);
        cc.add(2);
        cc.removeFirst();
        cc.removeLast();
        cc.removeAt(3);
        cc.printList();
    }
}