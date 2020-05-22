
/**
 * sporty 2-door auto with good looks and performance.
 * @author dpeters
 *
 */
public class SportyCoupeAuto implements AutoAPI {
	public static final String SPORTY_COUPE_AUTO_DESCRIPTION = "SportyCoupeAuto (40000)";
	public static final double SPORTY_COUPE_AUTO_BASE_PRICE = 40000;

	@Override
	public String getDesc() {
		return SPORTY_COUPE_AUTO_DESCRIPTION;
	}

	@Override
	public double getPrice() {
		return SPORTY_COUPE_AUTO_BASE_PRICE;
	}
}
