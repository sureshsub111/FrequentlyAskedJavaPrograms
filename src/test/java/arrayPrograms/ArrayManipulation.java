package arrayPrograms;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		int a[]= {4, 9, 1, 5, 3};
		int b[]= new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
		   if(i==2)
		   {
			  
			   a[i]=7;
		   }
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<b.length;i++)
		{
			b[i]= a[i];
			  
		}
		Arrays.sort(b);
		  // Sort ascending
        Arrays.sort(b);

        // Reverse to descending
        for (int i = 0; i < b.length / 2; i++) {
            int temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = temp;
        }

        System.out.println("Array B sorted in descending order: " + Arrays.toString(b));
	}

}
