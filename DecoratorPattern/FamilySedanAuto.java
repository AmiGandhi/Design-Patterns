
/**
 * mid-size 4-door auto with sufficient room for a family.
 * @author dpeters
 *
 */
public class FamilySedanAuto implements AutoAPI {
	public static final String FAMILY_SEDAN_AUTO_DESCRIPTION = "FamilySedanAuto (24000)";
	public static final double FAMILY_SEDAN_AUTO_BASE_PRICE = 24000;

	@Override
	public String getDesc() {
		return FAMILY_SEDAN_AUTO_DESCRIPTION;
	}

	@Override
	public double getPrice() {
		return FAMILY_SEDAN_AUTO_BASE_PRICE;
	}
}
