
/**
 * BDM Blind-Side Detection Monitor (BDM) Optional Auto Equipment class
 * 
 * implemented with the Decorator Design Pattern
 * @author dpeters
 *
 */
public class BDM extends AutoDecorator {
	public static final String BDM_DESCRIPTION = ", BDM Blind-Side Detection Monitor option (3000.03)";
	public static final double BDM_ADDITIONAL_CHARGE = 3000.03;
	private final AutoAPI auto;
	
	/**
	 * Auto object to be decorated with dynamic extensions
	 */
	public BDM(AutoAPI obj) {
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
		return auto.getDesc() + BDM_DESCRIPTION;
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
		return auto.getPrice() + BDM_ADDITIONAL_CHARGE;
	}

}
