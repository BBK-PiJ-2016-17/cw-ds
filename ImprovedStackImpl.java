/**
 * An implementation of a stack with additional methods. 
 * 
 * Classes implementing this interface must use a {@see List} as the
 * underlying data structure to store the elements on the stack. 
 * 
 * Not all operations on a stack will always be successful. For
 * example, a programmer may try to pop an element from an empty
 * stack. Since we hace not covered exceptions yet, we need another
 * mechanism to report errors. In order to do that, methods of this
 * list will return a {@see ReturnObject} that will contain either an
 * object or an error value of the right kind (as defined in {@see
 * ErrorMessage}).
 * 
 * 8 -  Write an implementation of interface ImprovedStack.
 *      This class cannot extend either AbstractStack or StackImpl.
 * 
 * @author Ginestra Ferraro
 */

public class ImprovedStackImpl implements ImprovedStack {

    private List myInnerList;

    public ImprovedStackImpl(List myInnerList) {
        this.myInnerList = myInnerList;
    }

    public boolean isEmpty() {
        if(myInnerList.size() == 0) {
            return true;
        }

        return false;
    }

    public int size() {
        return myInnerList.size();
    }

    public void push(Object item) {
        myInnerList.add(item);
    }

    public ReturnObject top() {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }

        return myInnerList.get(size() - 1);
    }

    public ReturnObject pop() {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }

        return myInnerList.remove(size() - 1);
    }

    /**
     * Returns a copy of this stack with the items reversed, the top
     * elements on the original stack is at the bottom of the new
     * stack and viceversa.
     * 
     * @return a copy of this stack with the items reversed. 
     */

    @Override
    public ImprovedStack reverse() {

        ImprovedStack reverseList = new ImprovedStackImpl(new LinkedList());

        for(int i = size() - 1; i >= 0; i--) {
            reverseList.push(myInnerList.get(i).getReturnValue());
        }

        return reverseList;
    }

    /**
     * Removes the given object from the stack if it is
     * there. Multiple instances of the object are all removed.
     *
     * Classes implementing this method must use method .equals() to
     * check whether the item is in the stack or not.
     * 
     * @param object the object to remove
     */
    
    @Override
    public void remove(Object object) {
        for (int i = 0; i <= size() - 1; i++) {    
            if (myInnerList.get(i).getReturnValue().equals(object)) {
                myInnerList.remove(i);
            }
        }
    }
}