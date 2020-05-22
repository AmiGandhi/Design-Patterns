
import java.text.DecimalFormat;

/**
 * AutoDecorator API for all auto option concrete classes.
 * 
 * All auto option concrete classes implement the Decorator Pattern
 * and implement the Auto interface 
 * @author dpeters
 *
 */
public abstract class AutoDecorator implements AutoAPI {
	/**
	 * use to provide a format for price output to stdout
	 * limiting digits and inserting commas as specified
	 * in the supplied format String
	 */
	private DecimalFormat priceFormat = new DecimalFormat("##,###.##");

	@Override
	public String getDesc() {
		return "Options";
	}

	@Override
	public String toString() {
		return "$ " + priceFormat.format( this.getPrice() ) + " " + this.getDesc();
	}
}
