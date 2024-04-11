/**
 * MyStack
 */
public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack(5);

        stack.push(3);
        stack.push(2);
        stack.push(1);
        // stack.push(1);
        // stack.push(1);
        // stack.push(1);
        // stack.push(1);

        System.out.println("Eleman Sayisi = " + stack.size());
        System.out.println("Cikarilan Eleman = " + stack.pop());
        System.out.println("Cikarilan Eleman = " + stack.pop());

        System.out.println("Eleman Sayisi = " + stack.size());

    }

}