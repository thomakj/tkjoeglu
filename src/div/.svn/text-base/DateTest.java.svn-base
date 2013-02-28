package div;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		Date one = new Date(2012,10,9,21,20);
		Date two = new Date();
		System.out.println(sdf.format(two));
		System.out.println(sdf.format(one));
		System.out.println(one.getTime());
		System.out.println(two.getTime());
		long temp = one.getTime()-two.getTime();
		System.out.println(temp);
		System.out.println(new Date(temp));
	}
}
