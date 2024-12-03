package Stack;

public class stackApp {
    public static void main(String[] args) {
        stack theStack = new stack(10);
        System.out.println(">> push some items");

        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        System.out.println("\n>> pop items in the stack");

        while(!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value + " ");
        }
    }
}
