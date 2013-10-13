package crypto;

import static org.junit.Assert.*;

import org.junit.Test;

public class Md5Test {
	
	Md5 md5 = new Md5();
	
	@Test
	public void testGetMd5Hash() {
		assertEquals("827ccb0eea8a706c4c34a16891f84e7b", md5.getMd5Hash("12345"));
		assertNotEquals("asdfgghjkk", md5.getMd5Hash("12345"));
	}

}
