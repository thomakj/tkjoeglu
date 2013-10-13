package crypto;

import java.math.BigInteger;
import java.security.*;

public class Md5 {

	public String getMd5Hash(String str) {
		
		byte[] bytesOfString = str.getBytes();
		
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		byte[] theDigest = md.digest(bytesOfString);
		
		BigInteger bigInt = new BigInteger(1, theDigest);
		
		String hash = bigInt.toString(16);
		
		return hash;
	}
	
}
