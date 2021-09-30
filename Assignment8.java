import java.util.ArrayList;
import java.util.Scanner;

public class Assignment8 {
	
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	Operations o = new Operations();
	int input;
	
	ArrayList<Integer> readArray = new ArrayList<Integer>();
	
	do {
	
		System.out.println("Enter number:");
		input = in.nextInt();
		readArray.add(input);
		
	} while 
		(input != 0);
	
	int[] numbers = o.ConvertALtoArray(readArray);
	int startIndex = 0;
	int endIndex = numbers.length-1;
	int count = numbers.length;
	
	int minNum = o.findMin(numbers, startIndex, endIndex);
	int numOfOdds = o.countOdd(numbers, startIndex, endIndex);
	int numOfNegOne = o.countNegativeOne(numbers, count);
	int sumOfEvens = o.computeSumAtEvenIndexes(numbers, count);
	
	System.out.println("The minimum number is: " + minNum + 
			"\nThe total number of odd integers is: " + numOfOdds + 
			"\nThe total number of -1 is : " + numOfNegOne + 
			"\nThe sum of numbers at even indexes is: " + sumOfEvens);
	
	}
	
	
	
	
	
	

}
