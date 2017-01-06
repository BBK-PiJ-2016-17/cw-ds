/**
 * 4 -  Write an implementation of interface FunctionalList that extends
 *      ArrayList called FunctionalArrayList.
 *
 *		TEST
 * 
 * @author Ginestra Ferraro
 */

public class FunctionalArrayListTest {
	public static void main(String[] args) {

		FunctionalList thisTestList = new FunctionalArrayList();

		thisTestList.add("One");
		thisTestList.add("Two");

		System.out.println("\n=== Test FunctionalArrayList ===\n");
		System.out.println(thisTestList.size());
		System.out.println(thisTestList.get(0));
		System.out.println(thisTestList.remove(0));
		System.out.println(thisTestList.size());

		thisTestList.add("Three");
		thisTestList.add("Four");

		System.out.println("\n=== Print head() ===\n");

		System.out.println("This list has " + thisTestList.size() + " items");

		System.out.println(thisTestList.head().getReturnValue());
		System.out.println(thisTestList.get(0).getReturnValue() + " - Should be the same as above.");

		System.out.println("\n=== Test rest() ===\n");

		System.out.println("\nI'm printing the list as is:\n");

		System.out.println(thisTestList.get(0).getReturnValue());
		System.out.println(thisTestList.get(1).getReturnValue());
		System.out.println(thisTestList.get(2).getReturnValue());

		thisTestList.rest();

		System.out.println("\nI'm printing the list copied with rest():\n");
		System.out.println(thisTestList.rest().get(0).getReturnValue());
		System.out.println(thisTestList.rest().get(1).getReturnValue());
		System.out.println(thisTestList.rest().get(2).getReturnValue());
	}
}