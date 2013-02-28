package william;


import javax.swing.JOptionPane;

public class Terning {

	/**
	 * @param args
	 */
	
	private double random(){
		double value = Math.random()*100;
		return value;
	}

	public String dice(){
		double value = random();
		String kast = "";
		if(value<=16.66){
			kast = "1";
		}else if (value<=33.33){
			kast = "2";
		}else if (value<=49.99){
			kast = "3";
		}else if (value<=66.66){
			kast = "4";
		}else if (value<=83.33){
			kast = "5";
		}else{
			kast = "6";
		}
		return kast;
	}

	public static void main(String[] args) {
		try {
			while (true) {
				Terning t = new Terning();
				JOptionPane.showMessageDialog(null, t.dice());
			}
		} catch (Exception e) {
			System.exit(0);
		}
	}

}
