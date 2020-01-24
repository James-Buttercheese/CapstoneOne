import java.util.Arrays;

public class PigLatinMethods {

	public static boolean vowel (String word) {
		
		char letter = word.charAt(0);
		int first = letter;
		
		boolean vowel = ((first == 65) || (first == 69) || (first == 73) || (first == 79) 
						|| (first == 85) || (first == 97) || (first == 101) || (first == 105)
						|| (first == 111)|| (first == 117)); 
		return vowel;
	}
	
	public static String latinVowel (String word) {
		
		word = word + "way";
		
		return word;
	}
	
	public static String latinConsonant (String word) {
		
		char letter = word.charAt(0);
		int length = word.length();
		
		while (!vowel(word)) {		
			letter = word.charAt(0);
			word = (word.substring(1,length) + letter);
		} 
		return (word + "ay"); 
	}
	
	public static boolean capitalize (String word) {
		char letter = word.charAt(0);
		int caps = 0;
		boolean capsBoo = false;
		
		caps = letter;
			if ((caps >= 63) && (caps <=90)) {
					capsBoo = true;
					return capsBoo;
				} else {
				return capsBoo;
			}
		} 
		
	
	
	public static boolean capitalizationWord (String word) {
		
		
		
		int caps = 0;
		boolean capsBoo = false;
		
			if (word.length() != 1) {
			char letter = word.charAt(1);	
			caps = letter;
			if ((caps >= 63) && (caps <=90)) {
					capsBoo = true;
					return capsBoo;
				} else {
				return capsBoo;
			}
			} else {
				return (capsBoo = true);
			}
		
	}
	
	public static boolean areThereNumbers (String word) {
		boolean noNums = true;
		int i = 0;
		int length = word.length();
		
		for (i = 0; i < length ; i++) {
		
			char l = word.charAt(i);
			int numl = l;
			
		if (((numl >=32) && (numl <= 33)) || (numl == 39) || (numl == 44) || (numl == 46) ||
				((numl >= 65) && (numl <= 90)) || ((numl >= 96) && (numl <= 122))) {
				noNums = true;
			} else {
				noNums = false; 
				break;
			}	
		} return noNums;
	}
	
	public static boolean areThereWords (String word) {
		boolean areThere = false;
		if (!word.isEmpty()) {
			areThere = true;
		}  else {
			areThere = false; 
		}
		return areThere;
	}
	
	public static String[] arrayCreation (String word) {
		
		String[] words = word.split(" ");
		
		
		return words;
		
		
	}
	
	public static void arrayToString (String[] arrayCreation) {
				
		String word2 = String.join(" ", arrayCreation);
		System.out.println(word2);
		
	}
	 
	
	
	
	
	
	
}