package arrayPrograms;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		
		int a[] = {12, 33, 15, 62, 17, 9};
		
		int largest= Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int d:a)
		{
		    if(d>largest)
		    {
		        secondLargest=largest;
		        largest=d;
		    }
		    else if(d>secondLargest&&d!=largest)
		    {
		        secondLargest=d;
		    }
		}
		System.out.println(secondLargest);

	}

}
