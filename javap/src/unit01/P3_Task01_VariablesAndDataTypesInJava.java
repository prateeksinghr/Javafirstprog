package unit01;

/* Types of Variables:
  In Java there are 3 types of variables:
  -local variable: it is declared inside the body of method
  -Instance variable: they are defined without static keyword
  -Static variable: they are defined with STATIC keyword
  they are initialised only once at the start of program execution 
 
 */



public class P3_Task01_VariablesAndDataTypesInJava {
	static int q=11;
	int p=10;

	public static void main(String[] args) {
//Valid Declaration

		int a=5; //Local Variable
		P3_Task01_VariablesAndDataTypesInJava s = new
	    P3_Task01_VariablesAndDataTypesInJava();		
		System.out.println("This is Dislay Method!");
		System.out.println("p="+s.p);
		System.out.println("q="+q);
		System.out.println("a="+a);

	
		/*
		 *double f; //8bytes =64bits/slots int i =10; // 4bytes =32 bits/ 
		 * = i;//Type Conversion System.out.println(f);
		 * 
		 *double g = 10; //64 int j; //32 j =(int)g;
		 */

		double f;//64 slots
		int i =10;//32 slots
		f=i;//Type Conversion
		System.out.println(f);
		
		double g =10;//64
		int j;//32
		j=(int)g; // Type Casting
		//32 bits =64 bits
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}
