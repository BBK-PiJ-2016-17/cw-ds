/**
 * A sampleable list can be sampled. 
 * 
 * 6 -  Write an implementation of interface SampleableList.
 *
 *      TEST
 *
 * @author Ginestra Ferraro
 */

public class SampleableListImplTest {
    
    public static void main(String[] args) {
        SampleableListImplTest test = new SampleableListImplTest();
        test.launch();
    }

    public void launch() {
        SampleableList oddListTest = new SampleableListImpl();

        oddListTest.add("ZeroIndex");
        oddListTest.add("UnoIndex");
        oddListTest.add("DueIndex");
        oddListTest.add("TreIndex");
        oddListTest.add("QuattroIndex");
        oddListTest.add("CinqueIndex");
        oddListTest.add("SeiIndex");

        System.out.println("\n=== Test oddList ===\n");

        System.out.print("Index at 0: ");
        System.out.println(oddListTest.sample().get(0).getReturnValue());
        System.out.print("Index at 1: ");
        System.out.println(oddListTest.sample().get(1).getReturnValue());
        System.out.print("Index at 2: ");
        System.out.println(oddListTest.sample().get(2).getReturnValue());
        System.out.print("Index at 3: ");
        System.out.println(oddListTest.sample().get(3).getReturnValue());
    }
}