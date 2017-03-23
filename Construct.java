
public class Construct {

	public static void main(String args[]){
		Box1 b1 = new Box();
		Box1 b2 = new Box(10,20,30);
		System.out.println("length=" +b1.length);
		System.out.println("width=" +b1.width);
		System.out.println("height=" +b1.height);
		System.out.println("Volume=" +b1.Volume());
		System.out.println("lenght="+b2.length);
		System.out.println("width=" +b2.width);
		System.out.println("height=" +b2.height);
		System.out.println("Volume="+b2.Volume());
	}
}

class Box1{
	double length,height,width;
Box(){
	length=height=width=10.0;
}

Box(double l,double h,double w){
	length=l;
	width=w;
	height=h;
}
double Volume(){
	return (length*height*width);
}
}
