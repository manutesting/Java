
public class One {

	public void number()
	{
		System.out.println("Step 1");
	}
}

 class General extends One{
	public void number()  // method overriding
	{
		System.out.println("Step 2");
	}

public static void main(String args[]){
	General obj = new General();
	obj.number();
	}
}
