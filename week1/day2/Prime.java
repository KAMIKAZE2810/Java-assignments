package week1.day2;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=83;
boolean trance= false;
for (int i=2; i<=num / 2; ++i) {
	if (num % i ==0) {
		trance = true;
			break;
	}
}
if(!trance)
	System.out.println(num + " is a prime number.");
else
System.out.println(num+ " is not a prime number.");
	}

}
