/**
 * 3 -	Write an implementation of interface List based on pointers called
 *		LinkedList.
 *
 *		TEST
 * 
 * @author Ginestra Ferraro
 */

public class LinkedListTest {
	
    public static void main(String[] args) {
        LinkedListTest test = new LinkedListTest();
        test.launch();
    }

	public void launch() {

		List newLinkedList = new LinkedList();
		
		newLinkedList.add("Test1");
		newLinkedList.add("Test2");
		newLinkedList.add("Test3");
		newLinkedList.add(null); // still get ignored
		newLinkedList.add("Test4");
		newLinkedList.add("Test5");

		System.out.println("\n=== Test LinkedList ===\n");
		System.out.println("\nPrint size and elements\n");

		System.out.println(newLinkedList.size() + "\n");
		System.out.println(newLinkedList.get(0).getReturnValue());
		System.out.println(newLinkedList.get(1).getReturnValue());
		System.out.println(newLinkedList.get(2).getReturnValue());
		System.out.println(newLinkedList.get(3).getReturnValue());
		System.out.println(newLinkedList.get(4).getReturnValue());

		newLinkedList.remove(4);
		newLinkedList.remove(3);
		newLinkedList.remove(0);

		System.out.println("\nPrint size and elements after removal\n");

		System.out.println(newLinkedList.size() + "\n");

		System.out.println(newLinkedList.get(0).getReturnValue());
		System.out.println(newLinkedList.get(1).getReturnValue());
		System.out.println(newLinkedList.get(2).getReturnValue());
		System.out.println(newLinkedList.get(3).getReturnValue());
		System.out.println(newLinkedList.get(4).getReturnValue());

		System.out.println("\nTesting add at specific index point\n");


		newLinkedList.add("Test6");
		newLinkedList.add("Test7");
		newLinkedList.add("Test8");
		newLinkedList.add("Test9");

		System.out.println(newLinkedList.size() + "\n");

		newLinkedList.add(3, "Test10");

		System.out.println(newLinkedList.get(3).getReturnValue());
	}
}