//import java.util.concurrent.SynchronousQueue;

public class StaticExample {

	static int i=10;
	static double var1;
	static String var2; // static variables
	static void display(){ //static method
		StaticExample obj=new StaticExample(); //object creation
		System.out.println("i="+obj.i);
	}
	static int num;
	static String mystr;
	static{ //static block
		num=97;
		mystr="Static keyword in java";
	}
	public static void main(String args[]){
		System.out.println("Value of num=" +num);
		System.out.println("Value of mystr="+mystr);
		System.out.println(i);
		System.out.println(var1);
		System.out.println(var2);
		display();
	}
}
