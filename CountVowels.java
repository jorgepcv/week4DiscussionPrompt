
public class CountVowels
{
	public static void main(String[] args)
	{

		String word = "Test String";
		String testingWord = word.toUpperCase();
		char testingCharacterLetter = 'A';
		int wordLength = word.length ();


		for (int testingCharacterPosition = 0 ; testingCharacterPosition < wordLength ; testingCharacterPosition++ ) {
			testingCharacterLetter = testingWord.charAt(testingCharacterPosition);						

			if (testingCharacterLetter == 'A' || testingCharacterLetter == 'E' || testingCharacterLetter == 'I' || testingCharacterLetter == 'O' || testingCharacterLetter == 'U' || testingCharacterLetter == 'Y') {
				System.out.println(testingCharacterLetter);		
			}


		}

	}
}