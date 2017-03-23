
 class MyBaseClass {

	public void disp(){
		System.out.println("Base Class");
	}
}

class MyChildClass extends MyBaseClass{
	public void disp(){
		System.out.println("Child Class");
	}
	
	public static void main(String args[]){
		MyChildClass obj = new MyChildClass();
		obj.disp();
	}
}