import java.util.Scanner;

/**
 * Write a description of class MorseCode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MorseCode
{
    public static String translate( String str )
    {

    }

    /**
     * Gets a Morse Code string from the user, then calls translate() to translate
     * the string to text.  Outputs the text to the screen.
     *
     * @param  args  not used
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner( System.in );
        boolean done = false;

        while( !done )
        {
            System.out.println("Enter a word in Morse Code. Leave one space between letters. Enter 'done' to quit.");
            String mcWord = kb.nextLine();
            if( mcWord.equals("done") )
            {
                done = true;
            }
            else
            {
                String word = translate(mcWord);
                System.out.println(word);
            }
        }
    }
}
