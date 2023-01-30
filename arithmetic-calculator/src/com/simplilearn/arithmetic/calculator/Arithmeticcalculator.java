package com.simplilearn.arithmetic.calculator;
import java.util.Scanner;
public class Arithmeticcalculator {
	public static void main(String[] args) {
		char operator;
		Double num1, num2, result;
		
		//Create an object of Scanner class
		Scanner input = new Scanner(System.in);
		
		//ask user to input operator
		System.out.println("Choose an operator +, -, *, /");
		operator = input.next().charAt(0);
		
		//ask user to enter the numbers
		System.out.println("Enter the first number");
		num1 = input.nextDouble();
		
		System.out.println("Enter the second number");
		num2 = input.nextDouble();
		
		switch(operator) {
		
		//Perform addition between numbers
		case '+':
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
			break;
			
		//Perform subtraction between numbers
		case '-':
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + result);
			break;
						
		//Perform multiplication between numbers
		case '*':
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
			break;
						
		//Perform division between numbers
		case '/':
			result = num1 / num2;
		    System.out.println(num1 + "/" + num2 + "=" + result);
			break;
			
		default:
			System.out.println("Invalid operator!!");
			break;
		
		}
		input.close();
		
		
		
		
	}

}
