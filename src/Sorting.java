import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		int[] nummereArray;
		String[] stringAL = {"in", "a", "world", "without", "gold", "we", "might", "have", "been", "heroes"};
		nummereArray = generateArray(25);
		int[] intSortArray = nummereArray;
		String[] stringSortArray = stringAL;
		
	
		System.out.println("Numbers: " + Arrays.toString(nummereArray));
		Arrays.sort(intSortArray);
		System.out.println("Numbers sorted: " + Arrays.toString(intSortArray));
		System.out.println(Arrays.binarySearch(intSortArray, 2));
		
		System.out.println("Strings: " + Arrays.toString(stringAL));
		Arrays.sort(stringSortArray);
		System.out.println("Strings sorted: " + Arrays.toString(stringSortArray));
		System.out.println(Arrays.binarySearch(stringSortArray, "in"));
	}

	public static int[] generateArray(int number) {
		int[] nummereArray = new int[number];
		for (int i = 0; i < number; i++) {
			Random randomNumber = new Random();
			nummereArray[i] = randomNumber.nextInt(10);
		}
		return nummereArray;
	}
}
