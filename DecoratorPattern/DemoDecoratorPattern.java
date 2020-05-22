

public class DemoDecoratorPattern {

	public static void demo() {
		System.out.println("\n\t" + DemoDecoratorPattern.class.getName() + " demo class entered...");
				
		/**
		 * Start with SportyCoupeAuto, a derived subclass of Auto
		 */
		AutoAPI bmw = new SportyCoupeAuto();
		/**
		 * Employ Decorator design pattern to 
		 * dynamically add extensions to the subclass
		 * as an alternative to further subclassing of
		 * the Auto > SportyCoupeAuto class hierarchy
		 */
		bmw = new ABS(bmw);		// Anti-lock Braking System option
		bmw = new AC(bmw);		// Air Conditioning option
		bmw = new BDM(bmw);		// Blind-side Detection Monitor option
		bmw = new AWD(bmw);		// All Wheel Driver option
		System.out.println(bmw);

		/**
		 * Start with FamilySedanAuto, a derived subclass of Auto
		 */
		AutoAPI camry = new FamilySedanAuto();
		/**
		 * Employ Decorator design pattern to 
		 * dynamically add extensions to the subclass
		 * as an alternative to further subclassing of
		 * the Auto > FamilySedanAuto class hierarchy
		 */
		camry = new ABS(camry);	// Anti-lock Braking System option
		camry = new AC(camry);	// Air Conditioning option
		camry = new BDM(camry);	// Blind-side Detection Monitor option
		System.out.println(camry);
		
		System.out.println("\n\t" + DemoDecoratorPattern.class.getName() + " demo completed!");
	}

}
