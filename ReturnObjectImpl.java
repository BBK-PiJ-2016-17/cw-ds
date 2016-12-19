/**
 * Implementing the ReturnObject interface
 *
 * @author Ginestra Ferraro
 */
public class ReturnObjectImpl implements ReturnObject {

	private Object object;
	private ErrorMessage errorMsg;

	/**
	 * My 2 constructors:
	 * 	- 1 for the value
	 * 	- 1 for the error
	 */

	public ReturnObjectImpl(Object object) {
		this.object = object;
		this.errorMsg = ErrorMessage.NO_ERROR;
	}

	public ReturnObjectImpl(ErrorMessage errorMsg) {
		this.object = null;
		this.errorMsg = errorMsg;
	}

	/**
	 * Returns whether there has been an error
	 * @return whether there has been an error
	 */

	@Override
	public boolean hasError() {
		return errorMsg != ErrorMessage.NO_ERROR;
	}

	/**
	 * Returns the error message. 
	 * 
	 * This method must return NO_ERROR if and only if
	 * {@hasError} returns false.
	 * 
	 * @return the error message
	 */
	
	@Override
	public ErrorMessage getError() {
		return errorMsg;
	}

	/**
	 * Returns the object wrapped in this ReturnObject, i.e. the
	 * result of the operation if it was successful, or null if
	 * there has been an error.
	 * 
	 * Note that the output of this method must be null if {@see
	 * hasError} returns true, but the opposite is not true: if
	 * {@see hasError} returns false, this method may or may not
	 * return null.
	 * 
	 * @return the return value from the method or null if there has been an error
	 */
	
	@Override
	public Object getReturnValue() {
		return object;
	}
}
