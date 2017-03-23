
class Box{
	
	int height;
	int width;
	int length;
	
	public void Volume(){
		System.out.println("Volume=" + length*width*height);
	}
}	
	public class MethodwithVoid{
		public static void main(String args[]){
			Box b = new Box();
			b.length=2;
			b.height=3;
			b.width=1;
			b.Volume();
		}
	}
