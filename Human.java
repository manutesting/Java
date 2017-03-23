
public class Human {

	String s1,s2;
	public Human(){
		s1="Super calss";
		s2="Parent Class";
	}
	public Human(String str){
		s1=str;
		s2=str;
	}
	
}

class Boy extends Human(){
	
	public Boy(){
		s2="Child Class";
	}
	public void disp(){
		System.out.println("String 1 is:"+s1);
		System.out.println("String 2 is:  "+s2);
	}
	public static void main(String args[]){
		Boy obj=new Boy();
		obj.disp();
	}
}