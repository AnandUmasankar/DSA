//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomQueue cc=new CustomQueue(1);
        cc.enQueue(2);
        cc.enQueue(3);
        cc.enQueue(4);
        cc.enQueue(5);
        cc.enQueue(6);
        cc.printQueue();
        cc.deQueue();
        System.out.println();
        cc.printQueue();
    }
}