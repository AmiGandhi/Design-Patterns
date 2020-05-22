
/**
 * BDM Air Conditioning (AC) Optional Auto Equipment class
 * 
 * implemented with the Decorator Design Pattern
 * @author dpeters
 *
 */
public class AC extends AutoDecorator {
	public static final String AC_DESCRIPTION = ", AC air conditioning (2000.02)";
	public static final double AC_ADDITIONAL_CHARGE = 2000.02;
	private final AutoAPI auto;
	
	/**
	 * Auto object to be decorated with dynamic extensions
	 */
	public AC(AutoAPI obj) {
		this.auto = obj;
	}
	
	/**
	 * Add to the existing Auto description method.
	 * 
	 * This decorator will override this
	 * Auto method, extending the functionality
	 * by adding it's own custom version
	 * which will append this specific option description
	 * to the existing Auto description.
	 */
	@Override
	public String getDesc() {
		return auto.getDesc() + AC_DESCRIPTION;
	}

	/**
	 * Add to the existing Auto price method.
	 * 
	 * This decorator will override this
	 * Auto method, extending the functionality
	 * by adding it's own custom version
	 * which will add the price of this auto option
	 * to the existing Auto base price.
	 */
	@Override
	public double getPrice() {
		return auto.getPrice() + AC_ADDITIONAL_CHARGE;
	}

}
