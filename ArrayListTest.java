/**
 * ArrayList Test
 * 
 * @author Ginestra Ferraro
 */

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayListTest test = new ArrayListTest();
        test.launch();  


    }

    public void launch() {
        List myList = new ArrayList();

        System.out.println();

        // Check if it's created an empty list
        System.out.println("The list should be empty. It has " + myList.size() +
            " items.");

        System.out.println();

        // Adding items
        System.out.println("Adding \"Item 1\" and \"Item 2\".");
        myList.add("Item 1");
        myList.add("Item 2");

        System.out.println("Now the list has " + myList.size() + " items.");

        System.out.println();

        System.out.println(myList.get(2));
    }
}