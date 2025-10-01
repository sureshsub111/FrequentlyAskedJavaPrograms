package stringPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//without built in methods
		
		String s = "Automation";
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}
		System.out.println("Reversed String(without builtin methods):=>  " + r);
		
		//StringBuffer
		
		StringBuffer buffer = new StringBuffer();
		String h= buffer.append(s).reverse().toString();
		System.out.println("Reversed String(with builtin methods):=>  " + h);

	}

}
