package com.newhire.main;
import java.util.Random;
public class CredentialService {
		
	public char[] generatePassword() {
		String Caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Low = "abcdefghijklmnopqrstuvwxyz";
		String Num = "0123456789";
		String SpeChar = "!@#$%^&*()[]";
		String Values = Caps + Low + Num + SpeChar;
		Random random = new Random();
		char[] pass = new char[6];
		
		for (int i = 0; i < 6; i++) {
			pass[i] = Values.charAt(random.nextInt(Values.length()));
			
		}
		return pass;
	}
}
		
