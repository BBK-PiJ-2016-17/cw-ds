 /** 
 * 8 -  Write an implementation of interface ImprovedStack.
 *      This class cannot extend either AbstractStack or StackImpl.
 *
 *      TEST
 * 
 * @author Ginestra Ferraro
 */

public class ImprovedStackImplTest {
    
    public static void main(String[] args) {
        ImprovedStackImplTest test = new ImprovedStackImplTest();
        test.launch();
    }

    public void launch() {

        ImprovedStack stacKcats = new ImprovedStackImpl(new LinkedList());

        stacKcats.push("brick A");
        stacKcats.push("brick B");
        stacKcats.push("brick C");
        stacKcats.push("brick D");
        stacKcats.push("brick E");
        
        System.out.println("\n=== Test reversin stack ===\n");

        System.out.println("\n Printing the stack as is\n");

        System.out.println("Stack size: " + stacKcats.size());
        
        System.out.println("Brick at the top of the stack: " + stacKcats.top());

        System.out.println("\n Printing the stack reversed\n");

        ImprovedStack kcatStack = stacKcats.reverse();

        System.out.println("Stack size: " + kcatStack.size());
        System.out.println("Brick at the top of the stack: " + kcatStack.top());
    }
}