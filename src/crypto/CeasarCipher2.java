package crypto;

public class CeasarCipher2 {

	private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
			'o','p','q','r','s','t','u','v','w','x','y','z'};
	private int[] offsetList = {5413,12,53,1245,512};

	public String decrypt(String inchiper){
		String decrypted = "";
		int k = 0;
		String chiper = inchiper.toLowerCase();
		
		for (int i = 0; i < chiper.length(); i++) {
			int offset = offsetList[k];
			char c = chiper.charAt(i);
			for (int j = 0; j < alphabet.length; j++) {
				if(c==' '){
					decrypted += " ";
					break;
				}else if(c==alphabet[j]) {
					decrypted += alphabet[(j-offset+(alphabet.length*1000))%alphabet.length];
					break;
				}
			}
			k++;
			if(k==offsetList.length) k=0;
		}
		return decrypted;
	}

	public String encrypt(String plain){
		String encrypted = "";
		int k = 0;
		String chiper = plain.toLowerCase();

		for (int i = 0; i < chiper.length(); i++) {
			int offset = offsetList[k];
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
			k++;
			if(k==offsetList.length) k=0;
		}
		return encrypted;
	}

	public static void main(String[] args) {
		CeasarCipher2 cc = new CeasarCipher2();
		String enc = cc.encrypt("the quick brown fox jumps over the lazy dog");
		System.out.println(enc);
		System.out.println(cc.decrypt(enc));
	}

}
