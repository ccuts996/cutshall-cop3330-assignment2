import junit.framework.TestCase;

public class ex24Test extends TestCase {

    public void testIsAnagram() {
        boolean expected = true;
        boolean actual = ex24.isAnagram("note", "tone");

        assertEquals(expected, actual);
    }
    public void testIsNotAnagram() {
        boolean expected = false;
        boolean actual = ex24.isAnagram("note", "carl");

        assertEquals(expected, actual);
    }
}
