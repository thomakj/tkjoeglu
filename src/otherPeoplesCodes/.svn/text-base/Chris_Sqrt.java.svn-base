package otherPeoplesCodes;

import javax.swing.JOptionPane;

public class Chris_Sqrt {
	public static void main(String args[]) {
		double c = 0;
		double b = 0;
		String fn="yes";
		while(fn.toLowerCase().contentEquals("yes") == true)
		{
			String a =
					JOptionPane.showInputDialog(null, "What number you want to figure out the square root of?", "Square Root Finder V1.0", JOptionPane.PLAIN_MESSAGE);

			try {    
				b = Double.valueOf(a.trim()).doubleValue();
			} catch (NumberFormatException exNFE) {    
				JOptionPane.showMessageDialog(null, "Cannot Process " + exNFE.getMessage());
				int derp = 0;
				System.exit(derp);
			}
			c = Math.sqrt(b);

			JOptionPane.showMessageDialog(null, "The square root of " + a + " is " + c);



			fn = JOptionPane.showInputDialog(null, "Do you want to find the square root of another number(yes/no)?", "Square Root Finder V1.0", JOptionPane.PLAIN_MESSAGE);
			if (fn.toLowerCase().contentEquals("yes")==false){
				JOptionPane.showMessageDialog(null, "Ok, thanks for using chrisman0091's Square Root Finder! Click 'OK' or the 'Enter' key to exit.");
				int derp = 0;
				System.exit(derp);
			}else System.exit(0);
		}              

	}
}
