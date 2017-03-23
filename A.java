
public class A {

	public static void main(String args[]){
		int x=3;
		B(x);
		System.out.println("After invoking methods, x="+x);
	}
	
	public static int B(int b){
		b=4;
		return b;
	} 
}
