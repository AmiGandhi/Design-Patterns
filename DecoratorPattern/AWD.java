
/**
 * AWD All Wheel Drive (AWD) Optional Auto Equipment class
 * 
 * implemented with the Decorator Design Pattern
 * @author dpeters
 *
 */
public class AWD extends AutoDecorator {
	public static final String AWD_DESCRIPTION = ", AWD All Wheel Drive option (15000.04)";
	public static final double AWD_ADDITIONAL_CHARGE = 15000.4;
	private final AutoAPI auto;
	
	/**
	 * Auto object to be decorated with dynamic extensions
	 */
	public AWD(AutoAPI obj) {
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
		return auto.getDesc() + AWD_DESCRIPTION;
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
		return auto.getPrice() + AWD_ADDITIONAL_CHARGE;
	}

}
