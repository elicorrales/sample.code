/*
 * typical run is around 100 millis
 * 
 * much better than BubbleSort.  takes only 7% of the time it takes BubbleSort
 */
public class SelectionSort {


	static void sort(int[] numbers) {

		for (int i=0;i<numbers.length;i++) {
			
			// inner loop finds smallest value in array
			// that has not already been found and placed
			// in its correct location.
			int least = Integer.MAX_VALUE;
			int innerIdx = 0;
			for (int j=i;j<numbers.length;j++) {
				if (least > numbers[j]) {
					least = numbers[j];
					innerIdx = j;
				}
			}
			//outer loop places number found in its
			//correct location.
			//the current correct location must be
			//swapped with index of least number
			//found so we dont lose the value
			//of the one in curent locatoin.
			int temp = numbers[i];
			numbers[i] = least;
			numbers[innerIdx] = temp;
		}
		
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
