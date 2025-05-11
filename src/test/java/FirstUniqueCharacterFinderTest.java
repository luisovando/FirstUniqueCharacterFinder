import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Write a function that takes a string input and returns the first non-repeating character in that string.
 * If every character in the string repeats, return the null character '\0'.
 */

public class FirstUniqueCharacterFinderTest {
    @Test
    public void testInputIsEmpty() {
        String input = "";
        char expected = '\0';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testAllUniqueCharacters() {
        String input = "abcd";
        char expected = 'a';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testLastCharacterIsUnique() {
        String input = "aabbccz";
        char expected = 'z';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }
}
