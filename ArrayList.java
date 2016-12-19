/**
 * A list is a collection of objects that are sorted and can be
 * accessed by index. The first element in the list is at index 0.
 *
 * A list can store objects of any kind, and they can be of different
 * types: Integers, Doubles, String, or even other lists. However,
 * this list cannot store null objects.
 * 
 * There is no limit to the number of elements in the list (provided
 * that there is free memory in the Java Virtual Machine).
 * 
 * Not all operations on a list will always be successful. For
 * example, a programmer may try to remove an element from an empty
 * list, or from a position where there is nothing. Since we have not
 * covered exceptions yet, we need another mechanism to report
 * errors. In order to do that, methods of this list will return a
 * {@see ReturnObject} that will contain either an object or an error
 * value of the right kind (as defined in {@see ErrorMessage}). 
 * 
 * @author Ginestra Ferraro
 */

public class ArrayList implements List {

	private Object[] listOfItems;
	private int size;

	private final static int DEFAULT_SIZE = 25;
	
	// Constructor
	public ArrayList() {
		this.listOfItems = new Object[ArrayList.DEFAULT_SIZE];
		this.size = size;
	}

	/**
	 * Returns true if the list is empty, false otherwise. 
	 * 
	 * @return true if the list is empty, false otherwise. 
	 */

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Returns the number of items currently in the list.
	 * 
	 * @return the number of items currently in the list
	 */

	@Override
	public int size() {
		return size;
	}

	/**
	 * Returns the element at the given position. 
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */

	@Override
	public ReturnObject get(int index) {

		if (isEmpty()) {
			System.out.println("Error: Empty structure!");
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= size) {
			System.out.println("Error: Index out of bounds!");
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

		return new ReturnObjectImpl(listOfItems[index]);
	}

	/**
	 * Returns the elements at the given position and removes it
	 * from the list. The indeces of elements after the removed
	 * element must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */

	@Override
	public ReturnObject remove(int index) {

		if (isEmpty()) {
			System.out.println("Error: Empty structure!");
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= size) {
			System.out.println("Error: Index out of bounds!");
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

		// Object removedItem = listOfItems[index];
		ReturnObject removedItem = get(index);

		for (int i = index + 1; i < size; i++) {
			listOfItems[i] = listOfItems[i-1];
		}
		listOfItems[size - 1] = null;
		listOfItems[listOfItems.length - 1] = null;
		size--;

		// return new ReturnObjectImpl(removedItem);
		return removedItem;
	}

	/**
	 * Adds an element to the list, inserting it at the given
	 * position. The indeces of elements at and after that position
	 * must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param index the position at which the item should be inserted in
	 *              the list
	 * @param item the value to insert into the list
	 * @return a ReturnObject, empty if the operation is successful
	 *         or containing an appropriate error message otherwise
	 */

	@Override
	public ReturnObject add(int index, Object item) {
		if (index < 0 || index >= size) {
			System.out.println("Error: Index out of bounds!");
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (item == null) {
			System.out.println("Error: Invalid argument!");
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			if (listOfItems.length == size) {
				moreItems();
			}
			int current;
			for(current = size(); current > index; current--) {
				listOfItems[current + 1] = listOfItems[current];
			}
			listOfItems[index] = item;
			size = size() + 1;
			return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
		}
	}

	/**
	 * Adds an element at the end of the list.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param item the value to insert into the list
	 * @return a ReturnObject, empty if the operation is successful
	 *         or containing an appropriate error message otherwise
	 */

	@Override
	public ReturnObject add(Object item) {
		if(item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			if(size() == listOfItems.length) {
				moreItems();
			}
			listOfItems[size()] = item;
			size = size()+ 1;
			return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
		}
	}

	/**
	 * Assign more space to listOfItems array
	 */
	private void moreItems(){
		int currentSpace = listOfItems.length;
		Object[] newListOfItems = new Object[currentSpace * 2];
		for(int i = 0; i < currentSpace; i++){
			newListOfItems[i] = listOfItems[i];
		}
		listOfItems = newListOfItems;
	}
}
