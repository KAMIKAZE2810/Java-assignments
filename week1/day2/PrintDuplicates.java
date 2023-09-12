package week1.day2;
import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[]args) {
		int[] number= {2,3,4,5,6,6,7,7,8,9};
		System.out.println("Print Duplicates");
		Arrays.sort(number);
		for(int i=0; i<number.length-1; i++) {
			if(number[i]==number[i+1]) {
				System.out.println("Duplicate values :"+number[i+1]);
			}
		}
	}

		

	}


