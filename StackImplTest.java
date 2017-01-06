/**
 * 7 -  Write a class StackImpl that extends class AbstractStack.
 * 
 * TEST
 *
 * @author Ginestra Ferraro
 */

public class StackImplTest {
    
    public static void main(String[] args) {
        StackImplTest test = new StackImplTest();
        test.launch();
    }

    public void launch() {
        Stack myStack = new StackImpl(new ArrayList());

        System.out.println("\n=== Test StackImpl ===\n");

        System.out.println("Stack empty? " + myStack.size() + " -> Yes.");

        // Adding bricks to the stack
        System.out.println("\n=== Adding bricks... ===\n");

        myStack.push("brick1");
        myStack.push("brick2");
        myStack.push("brick3");
        myStack.push("brick4");
        myStack.push("brick5");
        myStack.push("brick6");

        System.out.println("Top of the stack: " + myStack.top().getReturnValue());

        myStack.pop();

        System.out.println("New top of the stack (popped one): " + myStack.top().getReturnValue());

        System.out.println(myStack.isEmpty() ? "\nError message since empty: " + ErrorMessage.EMPTY_STRUCTURE : "\nmyStack has " + myStack.size() + " bricks left.");

        // Emptying the stack
        System.out.println("\n=== Popping bricks... ===\n");

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

        System.out.println("And finally the top of the stack is... " + myStack.top().getReturnValue());

        System.out.println(myStack.isEmpty() ? "\nError message if empty: " + ErrorMessage.EMPTY_STRUCTURE : "\nmyStack has " + myStack.size() + " bricks left.");
    }
}