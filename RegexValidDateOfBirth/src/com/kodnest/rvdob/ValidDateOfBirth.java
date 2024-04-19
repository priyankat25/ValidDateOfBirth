package com.kodnest.rvdob;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidDateOfBirth {
	public static void main(String[] args) {
		String dob1 = "19-04-2024";
		String dob2 = "19-04-2024";
		
		Pattern p = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])"
				+ "-(0[1-9]|1[0-2])"
				+ "-(19[0-9]{2}|20[0-9]{2})$");
		Matcher m1 = p.matcher(dob1);
		Matcher m2 = p.matcher(dob2);
		while (m1.find()) {
			while (m2.find()) {
				if(dob1.equals(dob2)) {
					System.out.println("Valid Date Of Birth");
				}
			}
		}
		if(dob1.equals(dob2)) {
			return;
		}
		else {
			System.out.println("Invalid input. please enter your date of birth in the format of "
					+ "'dd-mm-yyyy' ysing numerical and hypens only");
		}				
	}
}