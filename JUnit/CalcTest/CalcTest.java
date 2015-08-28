import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest 
{
@Test
public void testAdd1()
{
System.out.println("Test if addition returns accurate results");
Calc add = new Calc();
assertTrue(add.Add(3.5, 6.2) == 9.7);

}

@Test
public void testSubtract1()
{
System.out.println("Test if subtraction returns accurate results");
Calc sub = new Calc();
assertTrue(sub.Subtract(7.65, 3.65) == 4.00);

}

@Test
public void testMultiply()
{
System.out.println("Test if multiplication returns accurate results");
Calc mul = new Calc();
assertTrue(mul.Multiply(2.5, 6.2) == 15.5);

}

@Test
public void testDivision()
{
System.out.println("Test if division returns accurate results");
Calc div = new Calc();
assertTrue(div.Divide(12.6, 1.4) == 9);

}


@Test
public void testModulus()
{
System.out.println("Test if modulus returns accurate results");
Calc rem = new Calc();
assertTrue(rem.Modulus(36.8, 6.1) == 0.1999999999999993);

}

}