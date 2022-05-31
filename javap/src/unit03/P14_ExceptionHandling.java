package unit03;

import java.util.Scanner;

class Exception{
	void basicException() {
		try {
		int a=0;
		int b=100/a;
		System.out.println(b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
}
	void handleException() {
		try {
		int b= 100/0;
	    System.out.println(b);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Handled");
		}
		System.out.println("under handle exception function!!");
	}
	void multipleCatch() {
		try {
			int a=100/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
	void inputMismatchException(){
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter integer:");
		int a= sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
	void stackOverFlowError() {
		int a;
		while(a>0) {
			a++;
			System.out.println("Stack overflow");
		}
	}
}

	
public class P14_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exception e = new Exception();
		//e.basicException();

	}
}

