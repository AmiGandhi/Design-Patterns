
/**
 * API which all Auto subclasses implement
 * 
 * @author dpeters
 *
 */
public interface AutoAPI {
	/**
	 * get a String description of the Auto
	 * 
	 * @return	String description of Automobile
	 */
	String getDesc();
	/**
	 * get the price of the Auto
	 * 
	 * @return	purchase price of Automobile
	 */
	double getPrice();
}
