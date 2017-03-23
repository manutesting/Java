
public class Interface {

	public static void main(String args[]){
		Sample obj=new Sample();
		obj.add(20,30);
		obj.sub(50,40);
		System.out.println(obj.x);
		
	}
}

interface Itf{
	int x=10;
	void add(int a, int b);
	void sub(int a,int b);
}

class Sample implements Itf{
	public void add(int a, int b){
		System.out.println(a+b);
	}
	public void sub(int a, int b){
		System.out.println(a-b);
	}
}
