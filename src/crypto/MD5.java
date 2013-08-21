package crypto;

import java.io.UnsupportedEncodingException;
import java.security.*;

public class MD5 {

	private String yourString;
	private byte[] bytesOfMessage, theDigest;
	
	public void input(String yourString) {
		// TODO Set restrictions on input
		this.yourString = yourString;
	}
	
	public void changeToByte() {
		try {
			bytesOfMessage = yourString.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void encrypt(String yourString) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			theDigest = md.digest(bytesOfMessage);
		
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printHash(byte[] theDigest) {
		System.out.println(this.theDigest);
	}
	
	public static void main(String[] args) {
		
	}
}
