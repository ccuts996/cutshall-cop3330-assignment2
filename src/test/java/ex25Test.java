import junit.framework.TestCase;

public class ex25Test extends TestCase {

    public void testPasswordValidator() {
        String expected = "Weak";
        String actual = ex25.passwordValidator("Weak");
        assertEquals(expected , actual);
    }
}