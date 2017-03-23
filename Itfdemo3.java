
public class Itfdemo3 {

	public static void main(){
		Sample obj= new Sample();
		obj.add(20, 10);
		obj.sub(20, 10);
		obj.mul(20, 10);
	}
}

interface Itf1{
	void add(int a, int b);
	void sub(int a,int b);
}

interface Itf2{
	void mul(int a,int b);
}

class Sample implements Itf1,Itf2{
	public void add(int a, int b){
		System.out.println("sum=" +(a+b));
	}
	
	public void sub(int a,int b){
		System.out.println("Sub=" +(a-b));
	}
	
	public void mul(int a, int b){
		System.out.println("mul=" +(a*b));
	}
}