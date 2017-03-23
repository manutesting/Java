
public class Methodwithreturn {

	//data members
	int dm=6;
	public static void main(String args[]){
	
		int x=5,y=2;
		Methodwithreturn mr=new Methodwithreturn();
		mr.sub(x,y);
		//mr.mul(x,y);
	}
	
	public int sub(int a,int b){
		int sub=a-b;
		return sub;
	}
	
	/*public void mul(int a, int b){
		int mul=a-b;
		
	}*/
}
