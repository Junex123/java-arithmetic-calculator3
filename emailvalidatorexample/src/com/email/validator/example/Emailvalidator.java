package com.email.validator.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Emailvalidator {

	public static void main(String[] args) {
		System.out.println("Please enter your email::");
		Scanner emailinput = new Scanner(System.in);
		String inputuseremail = emailinput.next();
		System.out.println("Email address entered by the user is ::" + inputuseremail);
		List<String> emaillist = new ArrayList<>();
		emaillist.add("google.com");
		emaillist.add("youtube.com");
		emaillist.add("discord.com");
		emaillist.add("simplilearn.com");
		emaillist.add("gogo.com");
		System.out.println("the email list is ::" +emaillist);
		Emailvalidator emailvalidator = new Emailvalidator();
		
		String emailValidationStatus = emailvalidator.checkForValidEmailAddress(inputuseremail, emaillist);
		System.out.println(emailValidationStatus);
		
				}
	    private String checkForValidEmailAddress(String useremail, List<String> validemaillist) {
	    	String status;
	    	for(int index = 0; index < validemaillist.size(); index++)
	    	{
	    		if(validemaillist.get(index).equals(useremail)) {
	    			status = useremail + "::is valid";
	    			return status;
	    		}
	    	}
	    		
	    	status = useremail + "::not valid";
	    	return status;
	    }

}
