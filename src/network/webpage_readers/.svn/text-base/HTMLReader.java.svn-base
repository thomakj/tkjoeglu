package network.webpage_readers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTMLReader {
	
	public StringBuilder reader(int startnr){
		StringBuilder text = new StringBuilder();
		
		try {
			URL page = new URL("http://www.vg.no");
			
			HttpURLConnection conn = (HttpURLConnection) page.openConnection();
			conn.connect();
			
			InputStreamReader in = new InputStreamReader((InputStream) conn.getContent());
			BufferedReader read = new BufferedReader(in);
			
			String line;
						
			do {
				line = read.readLine();
				if (line != null) {
					text.append(line+"\n");
				}
			} while (line != null);
			
			System.out.println(text.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	
	
	
	
	public static void main(String[] args) {
		HTMLReader r = new HTMLReader();
	}
}
