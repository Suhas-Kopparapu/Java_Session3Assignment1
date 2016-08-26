package Assignments;

import java.util.Scanner;

public class OOPS1 {
	public void calculate(int arg1){
		
		System.out.println("The square root of the given number is  " +Math.sqrt(arg1));
		
		System.out.println("The Cube root of the given Number is " +Math.cbrt(arg1));
		
	}
	public  static void main(String args[]){
		//Creating an Object for using the method
		OOPS1 o1 = new OOPS1();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number for  calculating the Square and Cube root :");
		int num = sc1.nextInt();
		o1.calculate(num);
	}

}
