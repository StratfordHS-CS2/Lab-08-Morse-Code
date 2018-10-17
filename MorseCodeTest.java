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
     * Test the translate function.
     */
    @Test
    public void translateTest()
    {
        String[] input = { ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                           "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--",
                           "....-",".....","-....","--...","---..","----.","... --- ...",".- ...- .. ...","-.-. --- ... -.-. ..",
                           ".-.-. ..- --.--" };
        String[] expected = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W",
                             "X","Y","Z","0","1","2","3","4","5","6","7","8","9","SOS","AVIS","COSCI","?U?" };
        
        for( int i = 0; i < input.length; i++ )
        {
            assertEquals("translate(\"" + input[i] + "\") failed", expected[i], MorseCode.translate(input[i]) );
        }
    }
}
