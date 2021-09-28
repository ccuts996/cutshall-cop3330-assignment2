import junit.framework.TestCase;


public class ex26Test extends TestCase {

    public void testCalculateMonthsUntilPaidOff() {
        int expected= 70;
        int actual= ex26.calculateMonthsUntilPaidOff(5000,12,100);
        assertEquals(expected , actual);
    }

}