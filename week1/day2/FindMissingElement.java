package week1.day2;

public class FindMissingElement {

	public static void main(String[] args) {
		 
        int[] arr1={7,5,6,1,4,2,9,8,10};
        System.out.println("Missing number from Array 1 : "+missingNum(arr1));
       
    }
 
    public static int missingNum(int[] arr)
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}
 