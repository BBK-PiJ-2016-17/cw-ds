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
 * list, or from a position where there is nothing. Since we hace not
 * covered exceptions yet, we need another mechanism to report
 * errors. In order to do that, methods of this list will return a
 * {@see ReturnObject} that will contain either an object or an error
 * value of the right kind (as defined in {@see ErrorMessage}). 
 * 
 * @author Ginestra Ferraro
 */

public class LinkedList implements List {
	private ListNode firstItem;
	private ListNode lastItem;
	private int size;

	// Constructor	
	public LinkedList() {
		this.firstItem = null;
		this.lastItem = null;
		this.size = 0;
	}
	
	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public ReturnObject get(int index) {
		if (isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			ListNode current = firstItem;
			return new ReturnObjectImpl(current);
		}
	}

	@Override
	public ReturnObject remove(int index) {
		if (isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			ReturnObject objectRemove = get(index);
			
			ListNode nodeRemove = firstItem;

			if (index == 0) {
				nodeRemove.getNext().setNext(null);
			} else if (index == size - 1) {
				nodeRemove.getNext().setPrev(null);
			} else {
				nodeRemove.getNext().setNext(nodeRemove.getNext());
				nodeRemove.getNext().setPrev(nodeRemove.getPrev());
			}

			size = size() - 1;
			
			return objectRemove;
		}	
	}

	@Override
	public ReturnObject add(int index, Object item) {
		if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else if (index == 0) {
			ListNode myList = firstItem;
			myList.setNext(firstItem);
			firstItem.setPrev(myList);
			firstItem = myList;
			size = size() + 1;
			return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
		}

		ListNode current = firstItem;

		for (int i = 0; i < (index - 1); i++) {
			current = current.getNext();
		}

		ListNode myList = firstItem;
		myList.setNext(myList.getNext());
		myList.getNext().setPrev(myList);
		myList.setNext(myList);
		myList.setPrev(myList);
		size = size() + 1;

		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	@Override
	public ReturnObject add(Object item) {

		if(item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			ListNode newListNode = new ListNode(item);

			if(isEmpty()) {
				firstItem = newListNode;
			} else {
				newListNode.setPrev(newListNode.getPrev());
				firstItem.setNext(newListNode);
			}
			
			size = size() + 1;
			return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
		}
	}
}