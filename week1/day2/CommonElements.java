package week1.day2;
import java.util.ArrayList;
public class CommonElements {

	public static void main(String[] args) {
		Integer[] array1 = {1,3,6,5,7,8,9,12,15};
        Integer[] array2 = {1,3,5,9,13,2,4,8};
        
        ArrayList<Integer> commonElements = new ArrayList<Integer>();
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array2.length;j++)
            {
                if(array2[j]==array1[i])
                {
                    commonElements.add(array2[j]);
                }
            }
        }
        System.out.println("Common Elements : "+commonElements);
    }
}
		

	


