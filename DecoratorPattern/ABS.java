
/**
 * ABS Anti-Lock Breaking System (ABS) Optional Auto Equipment class
 * 
 * implemented with the Decorator Design Pattern
 * @author dpeters
 *
 */
public class ABS extends AutoDecorator {
	public static final String ABS_DESCRIPTION = ", ABS anti-lock braking system option (1000.01)";
	public static final double ABS_ADDITIONAL_CHARGE = 1000.01;
	/**
	 * Auto object to be decorated with dynamic extensions
	 */
	private final AutoAPI auto;
	
	public ABS(AutoAPI obj) {
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
		return auto.getDesc() + ABS_DESCRIPTION;
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
		return auto.getPrice() + ABS_ADDITIONAL_CHARGE;
	}

}
