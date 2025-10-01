package arrayPrograms;

import java.util.HashSet;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,2,3,6,8};
		
		//using set
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();
		for(int d:a)
		{
			if(!set.contains(d))
			{
				set.add(d);
			}
			else
			{
				duplicate.add(d);
			}
		}
		System.out.println("Duplicate numbers: ==> " +duplicate);
		System.out.println("After removing the duplicates: ==> " +set);
		
		//Without using inbuilt functions
		int h[] = new int[a.length];
		boolean[] visible = new boolean[a.length];
		int newSize =0;
		for(int i=0;i<a.length;i++)
		{
		    if(visible[i])	
		    {
		    	continue;
		    }
		    int count=0;
		    for(int j=0;j<a.length;j++)
		    {
		    	if(a[i]==a[j])
		    	{
		    		count++;
		    		visible[j]=true;
		    	}
		    }
		    if(count>=1)
		    {   h[newSize]=a[i];
		        newSize++;
		    	
		    }
		    
		}
		 System.out.print("Removed Duplicates : ==> [");
		for (int i = 0; i < newSize; i++) {
            System.out.print(h[i]);
            if (i != newSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
   
	}

}
