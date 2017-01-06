/**
 * Testing ReturnObjectImpl
 *
 * @author Ginestra Ferraro
 */

public class ReturnObjectImplTest {
    
    public static void main(String[] args) {
        ReturnObjectImplTest test = new ReturnObjectImplTest();
        test.launch();
    }

    public void launch() {

        ReturnObject result = new ReturnObjectImpl("1st");
        
        if (result.hasError()) {
            System.out.println("Error error!");
        }
        if (! result.getError().equals(ErrorMessage.NO_ERROR)) {
            System.out.println("Error errror!");
        }
        if (! result.getReturnValue().equals("1st")) {
            System.out.println("Error error!");
        } else {
            System.out.println("Tests passed. All good!");
        }
    }
}