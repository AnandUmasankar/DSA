//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomStack cc=new CustomStack(1);
        cc.push(2);
        cc.push(3);
        cc.push(4);
        cc.push(5);
        cc.push(6);
        cc.printStack();
        System.out.println( cc.top().value);
        cc.printStack();
    }
}