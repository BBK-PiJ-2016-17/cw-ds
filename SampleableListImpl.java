/**
 * A sampleable list can be sampled. 
 * 
 * 6 -  Write an implementation of interface SampleableList.
 *
 * @author Ginestra Ferraro
 */

public class SampleableListImpl extends ArrayList implements SampleableList {

    /**
     * Returns a list containing the first, third, fifth...
     * items of this list, or an empty list if the list is empty. 
     * 
     * @return a list containing the first, third, fifth... items of this list
     */

    public SampleableList sample() {

        if(isEmpty()) {
            return new SampleableListImpl();
        } else {
            SampleableList oddList = new SampleableListImpl();

            for (int i = 0; i < size(); i++) {
                if ((i+1) % 2 != 0) {
                    oddList.add(get(i).getReturnValue());
                }
            }
            return oddList;
        }
    }
}