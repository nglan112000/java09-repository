package datatype;

/**
 * Holding the integer value
 */
public class Int {

	// properties
	
	public int value;
	
	//constructor
	public Int(int val) {
		value = val;
	}
	@Override
	public String toString() {
		return "" + value;
	}
}
