package crypto;

public class CeasarCipher {

	private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
								'o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public String decrypt(String inchiper, int offset){
		String decrypted = "";
		String chiper = inchiper.toLowerCase();
		
		for (int i = 0; i < chiper.length(); i++) {
			char c = chiper.charAt(i);
			for (int j = 0; j < alphabet.length; j++) {
				if(c==' '){
					decrypted += " ";
					break;
				}else if(c==alphabet[j]) {
					decrypted += alphabet[(j-offset+(alphabet.length*100))%alphabet.length];
					break;
				}
			}
		}
		return decrypted;
	}
	
	public String encrypt(String plain, int offset){
		String encrypted = "";
		String chiper = plain.toLowerCase();
		
		for (int i = 0; i < chiper.length(); i++) {
			char c = chiper.charAt(i);
			for (int j = 0; j < alphabet.length; j++) {
				if(c==' '){
					encrypted += " ";
					break;
				}else if(c==alphabet[j]) {
					encrypted += alphabet[((j+offset)%alphabet.length)];
					break;
				}
			}
		}
		return encrypted;
	}
	
	public static void main(String[] args) {
		CeasarCipher cc = new CeasarCipher();
		int offset = 543;
		String enc = cc.encrypt("the quick brown fox jumps over the lazy dog", offset);
		System.out.println(enc);
		System.out.println(cc.decrypt(enc, offset));
//		for (int i = 0; i < 26; i++) {			
//			System.out.println(cc.decrypt("WKH TXLFN EURZQ IRA MXPSV RYHU WKH ODCB GRJ", i));
//		}
	}
}
