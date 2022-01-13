package com.newhire.main;

import com.newhire.main.CredentialService;

import java.util.Scanner;

public class role {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialService cs = new CredentialService();
		Scanner sc = new Scanner(System.in);
	     
			System.out.println ("Please enter the department from the following");
			System.out.println ("1 Technical");
			System.out.println ("2 Admin");
			System.out.println ("3 Human Resource");
			System.out.println ("4 Legal");
			 int option = sc.nextInt();
			 String E1 = "Vinothkumar";
			
			
			if (option ==1) {
				System.out.println (E1+"@"+"tech.xyz.com");
				System.out.println ("password -- >"+ "");
				System.out.println (cs.generatePassword());
		}
			else if (option ==2) {
				System.out.println (E1+"@"+"adm.xyz.com");
				System.out.println ("password -- >"+ "");
				System.out.println (cs.generatePassword());
			}
			else if (option ==3) {
				System.out.println (E1+"@"+"hr.xyz.com");
				System.out.println ("password -- >"+ "");
				System.out.println (cs.generatePassword());
			}
			else if (option ==4) {
				System.out.println (E1+"@"+"lgl.xyz.com");
				System.out.println ("password -- >"+ "");
				System.out.println (cs.generatePassword());
			}
			else {
				System.out.println ("invalid");
			}
				sc.close();
			}

	}



