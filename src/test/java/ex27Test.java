import junit.framework.TestCase;

public class ex27Test extends TestCase {

    public void testValidateFirstName() {
    boolean expected = true;
    boolean actual = ex27.validateFirstName("hello");
    assertEquals(expected, actual);
    }

    public void testValidateLastName() {
        boolean expected = true;
        boolean actual = ex27.validateLastName("hello");
        assertEquals(expected, actual);
    }

    public void testValidateZipCode() {
        boolean expected = true;
        boolean actual = ex27.validateZipCode("32904");
        assertEquals(expected, actual);
    }

    public void testValidateID() {
        boolean expected = true;
        boolean actual = ex27.validateID("AA-0929");
        assertEquals(expected, actual);
    }
}