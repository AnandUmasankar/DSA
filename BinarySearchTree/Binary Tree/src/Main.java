//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomBinarySearchTree cc=new CustomBinarySearchTree(1);
        cc.add(2);
        cc.add(3);
        cc.add(4);
        cc.add(5);
        cc.add(6);

        System.out.println(cc.search(2));
    }
}