package otherPeoplesCodes;

import javax.swing.JOptionPane;

/**
 *
 * @author chrisman0091
 * http://www.ubers.org/Thread-Showcase-My-first-program-Feedback-Wanted
 */
public class Chris {

	// all the variables needed throughout the class
	private double ounce, literA, literB, milliliter, gallonA;
	String gallonB; 

	public void start(){
		// Ounce, Gallon, Liter, Milliliter

		literB = 3.78541;
		ounce = 128;
		milliliter = 3785.41;
		gallonA = 0.0;
		gallonB=
				JOptionPane.showInputDialog(" **Can be decimal(i.e. 5.2)** Enter # of Gallons: ");

		// Thanks Scar for that \/ \/ \/
		try {   
			if(gallonB==null){
				System.exit(0);
			}else gallonA = Double.valueOf(gallonB.trim()).doubleValue();
		} catch (NumberFormatException exNFE) {    
			JOptionPane.showMessageDialog(null, "Number not valid: " + exNFE.getMessage() + "   Program will now exit. . .");
			int derp = 0;
			System.exit(derp);
		}

		// The code above replaces the code below, as the code below does not work.
		// gallonA = gallonB;

		literA = gallonA * literB;
		ounce = gallonA * 128;
		milliliter = gallonA * 3785.;

		JOptionPane.showMessageDialog(null, "Liters: " + literA + "    " + "Ounces: " + ounce + "    " + "Milliliters: " + milliliter);

	}

	public static void main(String[] args) {
		Chris c = new Chris();
		while(true){			
			c.start();
		}
	}

}