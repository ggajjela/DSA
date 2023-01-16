public class StackTest {
    public static void main (String[] args) {

        int userStackSize = 5;
        StackMethods Stack = new StackMethods(userStackSize);

        Stack.push(6);
        Stack.push(9);
        Stack.push(10);
        Stack.push(14);
        Stack.push(13);
        Stack.push(5);
        Stack.push(21);
        Stack.printStack();

        for (int i = 0; i < userStackSize + 1; i++) {
            int rc = Stack.pop();
            System.out.println("pop(): " + rc);
        }
        System.out.print("stack after pop: ");
        Stack.printStack();




    }
}
