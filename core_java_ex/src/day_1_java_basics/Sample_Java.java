package day_1_java_basics;

import java.util.Scanner;

public class Sample_Java {

	public static void main(String[] args) {
		// TODO Auto-generated methods stub
        Scanner s= new Scanner(System.in);
		int a,b,c;
        
		System.out.println("Enter the a and b values:");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
		System.out.println("Addition of a="+a+" and b="+b+" is :"+c);
	}

}
