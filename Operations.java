import java.util.ArrayList;

public class Operations {
	
	/*private ArrayList<Integer> readArray;
	private int minNum;
	private static int oddNumbers;
	private static int evenNumbers;
	private static int numOfNegOne;*/
	
	public Operations() {
		
	}
	
	public int[] ConvertALtoArray(ArrayList<Integer> readArray) {
		
		int[] numbers = new int[readArray.size()];
		
		for(int i = 0; i < readArray.size(); i++) {
			
			numbers[i] = readArray.get(i);
			
		}
		return numbers;
		
	}
	
	public static int findMin(int[ ] numbers, int startIndex, int endIndex) {
		
		int minNum;
		
		if(startIndex == endIndex) {
			minNum = numbers[startIndex];
			
		}else {
			minNum = Math.min(numbers[startIndex], findMin(numbers, startIndex+1, endIndex));
			
		}
		return minNum;
	}
	
	public static int countOdd(int[ ] numbers, int startIndex, int endIndex) {
		
		int numOfOdds = 0;
		
		if(numbers[endIndex] % 2 != 0) 
			numOfOdds++;
		
		if(startIndex != endIndex) {
			numOfOdds += countOdd(numbers, startIndex, endIndex-1);
		}
		return numOfOdds;	
	}
	
	public static int countNegativeOne(int[ ] numbers, int count) {
		
		int numOfNegOne = 0;
		
		if(numbers[count-1] == -1) {
			numOfNegOne++;
		}
		
		if(count != 1) {
			numOfNegOne += countNegativeOne(numbers, count-1);	
		}
		return numOfNegOne;
	}
	
	public static int computeSumAtEvenIndexes(int[ ] numbers, int count) {
		
		int sumOfEvens = 0;
		int index;
		
		if(count % 2 == 0) {
			count = count -1;
		}
		
		if(count % 2 != 0 && count >= 0) {
			index = count-1;
			sumOfEvens += numbers[index];
			sumOfEvens += computeSumAtEvenIndexes(numbers, count-2);
		}
			
		return sumOfEvens;
		
	}
	
	
	
	
	/*public int MinNum(ArrayList<Integer> readArray) {
		
		this.readArray = readArray;
		minNum = 0;
		for(int i = 0; i < readArray.size(); i++) {
			
			if(readArray.get(i) <= minNum) {
				
				minNum = readArray.get(i);
			}
		}
		return minNum;
		
	}
	
	public int CountOfOdd() {
		
		for(int i = 0; i < readArray.size(); i++) {
			
			if(readArray.get(i) % 2 == 0) {
				evenNumbers++;
			}
			else {
				oddNumbers++;
			}
		}
		return oddNumbers;
		
	}
	
	public int NumberOfNegOne() {
		
		for(int i = 0; i < readArray.size(); i++) {
			
			if(readArray.get(i) == -1) {
				numOfNegOne++;
			}
		}
		return numOfNegOne;
	}*/

}
