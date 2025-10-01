package arrayPrograms;

public class Triplets_Sum_Of_Two {

	public static void main(String[] args) {
		
		int a[] = {2, 3, 5, 6, 7, 9};
        int target = 10;
        int total=0;
        
        for(int i=0;i<a.length-2;i++)
        {
            for(int j=i+1;j<a.length-1;j++)
            {
                for(int h=j+1;h<a.length;h++)
                {
                   
                    if(a[i]+a[j]==target || a[i]+a[h]==target || a[j]+a[h]==target)
                    {
                        System.out.println( a[i]+"===="+a[j]+"======="+a[h]);
                    }
                }
            }
        }
	}

}
