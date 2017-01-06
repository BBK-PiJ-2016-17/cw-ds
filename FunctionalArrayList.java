/**
 * A functional list is a list with a few additional methods that are
 * common in functional languages (such as Lisp, Clojure, or Haskell)
 * to work with lists in a recursive way. 
 *
 * Not all operations on a recursive list will always be
 * successful. For example, a programmer may try to extract the head
 * from an empty list. Since we hace not covered exceptions yet, we
 * need another mechanism to report errors. In order to do that,
 * methods of this list will return a {@see ReturnObject} that will
 * contain either an object or an error value of the right kind (as
 * defined in {@see ErrorMessage}).
 *
 * 4 -  Write an implementation of interface FunctionalList that extends
 *      ArrayList called FunctionalArrayList. 
 * 
 * @author Ginestra Ferraro
 */

public class FunctionalArrayList extends ArrayList implements FunctionalList {

    public FunctionalArrayList() {
        super();
    }

    @Override
    public ReturnObject head() {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }

        return new ReturnObjectImpl(get(0).getReturnValue());
    }
    
    @Override
    public FunctionalList rest() {
        if (isEmpty()) {
            return new FunctionalArrayList();
        } else {
            FunctionalList thisFList = new FunctionalArrayList();

            for(int i = 0; i < size(); i++){
                thisFList.add((get(i + 1).getReturnValue()));
            }

            return thisFList;
        }       
    }
}