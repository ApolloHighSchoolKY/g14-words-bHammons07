import java.util.List;
import java.util.ArrayList;

public class Word
{
	//Instance field(variable)
	private String word;

	//Class field(variables)
	private static final String VOWELS = "AEIOUaeiou";   //static means only one

	public Word()
	{
		word = "";
	}

	public Word(String newWord)
	{
		setWord(newWord);
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	public int getNumVowels()
	{
		int count = 0;

		//Loop for every letter in "word"
		 
		for(int i = 0; i < word.length(); i++)
		{
			if(VOWELS.contains(word.substring(i,i+1))) // or if(VOWELS.indexOf(word.substring(i,i+1) > -1))
			{
				count++;
			}
		}
			//Use indexOf to see if the letter is in the string "vowels"
		
		return count;
	}

	public int getLength()
	{
		int str = 0;

		str = word.length();

		return str;
	}

	public String toString()
	{
	   return "" + word;
	}
}