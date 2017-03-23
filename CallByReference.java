
public class CallByReference {

	public static void swap(int[] numbers) {
		System.out.println("Before swap : numbers[0] : " + numbers[0] + "	numbers[1] : " + numbers[1]);
		int t = numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = t;
		System.out.println("After swap : numbers[0] : " + numbers[0] + "	numbers[1] : " + numbers[1]);
	}

	public static void main(String[] args) {

		int[] elements = new int[2];
		elements[0] = 7;
		elements[1] = 9;
		System.out.println("Before swap : elements[0] : " + elements[0] + "	elements[1] : " + elements[1]);
		swap(elements);
		System.out.println("After swap : elements[0] : " + elements[0] + "	elements[1] : " + elements[1]);

	}

}

