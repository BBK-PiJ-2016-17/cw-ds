/**
 * 5 -  Write an implementation of interface FunctionalList that extends
 *      LinkedList called FunctionalLinkedList.
 *
 *		TEST
 * 
 * @author Ginestra Ferraro
 */

public class FunctionalLinkedListTest {
	
    public static void main(String[] args) {
        FunctionalLinkedListTest test = new FunctionalLinkedListTest();
        test.launch();
    }

	public void launch() {

		FunctionalList thisTestLinkedList = new FunctionalLinkedList();

		System.out.println("\n==== Test Empty List ====\n");

		System.out.println(thisTestLinkedList.get(0));

		thisTestLinkedList.add("One");
		thisTestLinkedList.add("Two");

		System.out.println("\n=== Test FunctionalLinkedList ===\n");
		System.out.println(thisTestLinkedList.size());
		System.out.println(thisTestLinkedList.get(0));
		System.out.println(thisTestLinkedList.remove(0));
		System.out.println(thisTestLinkedList.size());

		thisTestLinkedList.add("Three");
		thisTestLinkedList.add("Four");

		System.out.println("\n=== Print head() ===\n");

		System.out.println("This list has " + thisTestLinkedList.size() + " items");

		System.out.println(thisTestLinkedList.head().getReturnValue());
		System.out.println(thisTestLinkedList.get(0).getReturnValue() + " - Should be the same as above.");

		System.out.println("\n=== Test rest() ===\n");

		System.out.println("\nI'm printing the list as is:\n");

		System.out.println(thisTestLinkedList.get(0).getReturnValue());
		System.out.println(thisTestLinkedList.get(1).getReturnValue());
		System.out.println(thisTestLinkedList.get(2).getReturnValue());

		thisTestLinkedList.rest();

		System.out.println("\nI'm printing the list copied with rest():\n");
		System.out.println(thisTestLinkedList.rest().get(0).getReturnValue());
		System.out.println(thisTestLinkedList.rest().get(1).getReturnValue());
		System.out.println(thisTestLinkedList.rest().get(2).getReturnValue());
	}
}