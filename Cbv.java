//Call by Value
public class Cbv {

	public static void main(String args[])
	{
		int x=5;
		int y=10;
		Cbvdemo obj=new Cbvdemo();
		obj.test(x,y);
		System.out.println("x="+x+"y="+y);
	}
}
class Cbvdemo{
	void test(int a, int b){
	System.out.println();
	}
}