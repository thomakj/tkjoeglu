package network;

import java.net.InetAddress;

public class Hostname_IPAddress {
	
	private String hostname;
	private byte[] ipAddr;
	
	public Hostname_IPAddress(){
		try {
			InetAddress addr = InetAddress.getLocalHost();
			
			ipAddr = addr.getAddress();
			
			hostname = addr.getHostName();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public String getHostname() {
		return hostname;
	}

	public byte[] getIpAddr() {
		return ipAddr;
	}
}
