package arrayPrograms;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
	
		//using inbuilt methods
		int a[]= {3,2,5,1,6,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		//without inbuilt functions
		int b[]= {3,2,5,1,6,9};
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length-i-1;j++)
			{
				if(b[j]>b[j+1])
				{
					int temp =b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
