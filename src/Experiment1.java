
public class Experiment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// trying to insert 10,000 numbers would crash the app as an int
		// and the longs in place of int would create issues
		int arraySize = 500;
		
		long[] myArray = new long[arraySize];
		
		for (int i = 0; i < arraySize; i++) {
			long num = (long)(java.lang.Math.random()*(arraySize - 1));
			myArray[i] = num;
		}
		
		// change the outer loop LCV so that we are making one fewer pass
		for(long i = myArray.length - 1; i > 0; i--) {
			
			for(int j = 0; j < i; j++) {
				// Compare current element to next highest
			
				// if the second element is greater than the first
				if(myArray[j] < myArray[j + 1]) {
				
					// swap
					// (hold onto the element so we don't lose it!)
					long temp = myArray[j + 1];
					// assign lower element:
					myArray[j + 1] = myArray[j];	// at this polong, both array elements hold the same value
					// assign higher element:
					myArray[j] = temp;
				}	
				
			}// inner loop ends		
			
		}// outer loop ends	
		
		prlongArray(myArray);
		
	}
	
	public static void prlongArray(long[] myArray) {
		for(long i : myArray) {
			System.out.print(i + " ");	// keep all output on one line
		}
		// newline
		System.out.println();	// blank
		
		
	}
}
