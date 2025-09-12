	package stringPrograms;
	
	import java.util.ArrayList;
	
	public class PrintSeparateCharactersDigitsFromString {
	
		public static void main(String[] args) {
	
			String s = "automation13@s45#$";
			char c[] = s.toCharArray();
			ArrayList<Character> character = new ArrayList<>();
			ArrayList<Character> digit = new ArrayList<>();
			ArrayList<Character> specialCharacter = new ArrayList<>();
	
			for (char d : c) {
				if (Character.isLetter(d)) {
					character.add(d);
				} else if (Character.isDigit(d)) {
					digit.add(d);
				} else {
					specialCharacter.add(d);
				}
			}
			System.out.println(character.toString()+"\t "+digit+ "\t "+specialCharacter);
		}
	
	}
