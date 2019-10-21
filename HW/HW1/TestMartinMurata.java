import static org.junit.Assert.*;
import org.junit.*;

public class TestMartinMurata{
    MartinMurata tester = new MartinMurata();
    @Test public void testFullName(){
        assertEquals("Martin Murata", tester.getFullName() );
    }
    @Test public void testFirstName(){
        assertEquals("Martin", tester.getFirstName());
    }
    @Test public void testLastName(){
        assertEquals("Murata" , tester.getLastName());
    }
    @Test public void testStudentNumber(){
        assertEquals(26068062, tester.getStudentNumber());
    }
    @Test public void testUCINetID(){
        assertEquals("mpmurata", tester.getUCInetID());
    }
    @Test public void testPositiveRotate(){
        assertEquals("rataMartin Mu", tester.getRotatedFullName(4));
    }
    @Test public void testNegativeRotate(){
        assertEquals("rtin MurataMa", tester.getRotatedFullName(-2));
    }
}
