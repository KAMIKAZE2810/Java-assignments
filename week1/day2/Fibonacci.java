package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8, firstTerm=0, secondTerm=1;
			System.out.println("Fibonacci Series till"+n+"Terms:");
		for (int i=1; i <= n; ++i) {
			System.out.println(firstTerm+",");
			int nextterm=firstTerm+secondTerm;
				firstTerm=secondTerm;
					secondTerm=nextterm;
		}

	}

}
