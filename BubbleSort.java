/*
 * typical run is around 1300 to 1400 or so millis
 * 
 * I will be honest - I didn't see much of a distinction between a Bubble Sort and an Insertion Sort,
 * so not sure how to categorize the code below.
 */
public class BubbleSort {


	static boolean sort(int[] numbers) {
		boolean aSwap = false;
		for (int i=0;i<numbers.length-1;i++) {
			if (numbers[i]>numbers[i+1]) {
				int number = numbers[i+1];
				numbers[i+1] = numbers[i];
				numbers[i] = number;
				aSwap = true;
			}
		}
		return aSwap?sort(numbers):aSwap;
	}
	
	static int[] generateUnsortedIntegerArray(int quantity) {
		
		int[] numbers = new int[quantity];
		for (int idx=0;idx<quantity;idx++) {
			double d = Math.random() * 1000000;
			int i = (int)Math.round(d);
			numbers[idx] = i;
		}
		return numbers;
	}

	public static void main(String[] args) {
		
	int[] numbers = generateUnsortedIntegerArray(30000);


		System.out.println("Bubble Sort");
		System.out.println("==================================================");
		for (int n : numbers) { System.out.print(n + ","); } System.out.println();
		System.out.println("==================================================");

		long start = System.currentTimeMillis();
		sort(numbers);
		long end   = System.currentTimeMillis();

		for (int n : numbers) { System.out.print(n + ","); } System.out.println();

		System.out.println("==================================================");
		System.out.println("millis:"+(end-start));
		System.out.println("==================================================");
	}
}
