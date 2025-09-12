package stringPrograms;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String h = new StringBuffer().append(s).reverse().toString();
		if(s.equals(h))
		{
			System.out.println("Palindrome");	
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
