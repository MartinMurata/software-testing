import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest
{
   @Test public void testAdd()
   {
      assertTrue ("Calc sum incorrect", 5 == Calc.add (2, 3));
   }
	@Test public void testMul()
   {
      assertTrue ("Calc mul incorrect", 5 == Calc.mul (2, 3));
   }
}
