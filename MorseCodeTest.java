import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MorseCodeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MorseCodeTest
{
    /**
     * Default constructor for test class MorseCodeTest
     */
    public MorseCodeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test all letters individually.
     */
    @Test
    public void lettersTest()
    {
        String[] input = { ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                           "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };
        String[] expected = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W",
                             "X","Y","Z" };

        for( int i = 0; i < input.length; i++ )
        {
            assertEquals("translate(\"" + input[i] + "\") failed", expected[i], MorseCode.translate(input[i]) );
        }
    }

    /**
     * Test all numbers individually.
     */
    @Test
    public void numbersTest()
    {
        String[] input = { "-----",".----","..---","...--","....-",".....","-....","--...","---..","----." };
        String[] expected = {"0","1","2","3","4","5","6","7","8","9" };

        for( int i = 0; i < input.length; i++ )
        {
            assertEquals("translate(\"" + input[i] + "\") failed", expected[i], MorseCode.translate(input[i]) );
        }
    }

    /**
     * Test unknown combinations of dots and dashes.
     */
    @Test
    public void errorTest()
    {
        String[] input = { ".-.-.-", "..-..", "---....", "asfd" };
        String[] expected = {"?","?","?","?" };

        for( int i = 0; i < input.length; i++ )
        {
            assertEquals("translate(\"" + input[i] + "\") failed", expected[i], MorseCode.translate(input[i]) );
        }
    }

    /**
     * Test multiple letter words.
     */
    @Test
    public void wordsTest()
    {
        String[] input = { "... --- ...",".- ...- .. ...","-.-. --- ... -.-. ..",".-.-. ..- --.--" };
        String[] expected = {"SOS","AVIS","COSCI","?U?" };

        for( int i = 0; i < input.length; i++ )
        {
            assertEquals("translate(\"" + input[i] + "\") failed", expected[i], MorseCode.translate(input[i]) );
        }
    }
}
