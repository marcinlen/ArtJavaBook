package CollectionClasses;

/** This class implelents a simplified version of a Map class for Strings. */
public class SimpleStringMap {
	
/** Creates a new SimpleStringMap with no key/value pairs */
	public SimpleStringMap() {
		keysArray = new String[capacity];
		valuesArray = new String[capacity];
	}
	
/**
 * Sets the value associated with key. Any previous value for key is lost.
 * @param key The key used to refer to this value
 * @param value The new value to be associated with key
 */
	public void put(String key, String value) {
		int keyUsed = isKey(key);
		if (keyUsed == -1) {
			keysArray[effectiveSize] = key;
			valuesArray[effectiveSize] = value;
			effectiveSize++;
		} else {
			valuesArray[keyUsed] = value;
		}
		/* grow arrays if effective size == capacity */

	}
	
private int isKey(String key) {
	// TODO Auto-generated method stub
	return 0;
}

/** 
 * Retrieves the value associated with key, or null if no such value exists.
 * @param key The key used to look up the value
 * @return The value associated with key, or null if no such value exists
 */
	public String get(String key) {
		int keyUsed = isKey(key);
		if (keyUsed == -1) {
			return null;
		} else {
			return valuesArray[keyUsed];
		}
	}
		
/* Private class varaibles */
	private static int effectiveSize = 0;
	private static int capacity = 10;
	
/* Private instance variables */
	private String[] keysArray;
	private String[] valuesArray;
	
}

