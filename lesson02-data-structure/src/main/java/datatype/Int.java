package datatype;

/**
 * Holding the integer value
 */
public class Int {
	// properties
	public int value;
	
	//constructor
	public Int(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + value;
	}

}
