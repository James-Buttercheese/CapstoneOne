import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		PigLatinMethods m = new PigLatinMethods();
		String realResponse = "";
		char quitResponse = 'y';
		while (quitResponse == 'y') {

			String userWord = scnr.nextLine();
			if (m.areThereWords(userWord)) {

				String[] hoorayArray = m.arrayCreation(userWord);

				int i;
				int length = hoorayArray.length;

				String[] newArray = new String[length];

				for (i = 0; i < length; i++) {
					userWord = hoorayArray[i];
					String newWord = userWord.toLowerCase();

					if (m.areThereNumbers(userWord)) {
						if (m.vowel(newWord)) {
							newWord = (m.latinVowel(newWord));
							if (m.capitalize(userWord)) {
								if (m.capitalizationWord(userWord)) {
									newWord = newWord.toUpperCase();
								} else {
									newWord = (newWord.substring(0, 1).toUpperCase() + newWord.substring(1));
								}
							} else
								;

						} else {
							newWord = (m.latinConsonant(newWord));
							if (m.capitalize(userWord)) {
								if (m.capitalizationWord(userWord)) {
									newWord = newWord.toUpperCase();
								} else {
									newWord = (newWord.substring(0, 1).toUpperCase() + newWord.substring(1));
								}
							} else
								;
						}

						newArray[i] = newWord;
					} else {

						newArray[i] = userWord;
					}
				}

				m.arrayToString(newArray);
			} else {
				System.out.println("You didn't type anything.");
			}

			System.out.println("Would you like to translate another word? (y/n)");
			realResponse = scnr.nextLine();
			quitResponse = realResponse.toLowerCase().charAt(0);
		}
	}
}