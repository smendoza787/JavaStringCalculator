package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

  private StringCalculator sc = new StringCalculator();

  @Test
  public void emptyStringReturnsZero() {
    assertEquals(0, sc.add(""));
  }

  @Test
  public void singleDigitReturnsDigit() {
    assertEquals(1, sc.add("1"));
    assertEquals(50, sc.add("50"));
    assertEquals(9999, sc.add("9999"));
  }

  @Test
  public void oneAndTwoReturnsThree() {
    assertEquals(3, sc.add("1,2"));
  }

  @Test
  public void completesBasicMath() {
    assertEquals(33, sc.add("11,22"));
    assertEquals(45, sc.add("17,28"));
    assertEquals(1257, sc.add("1000,257"));
    assertEquals(100, sc.add("99,1"));
    assertEquals(3007, sc.add("1001,2006"));
  }

  @Test
  public void acceptsUnknownAmountOfNumbers() {
    assertEquals(15, sc.add("1,5,9"));
    assertEquals(5298, sc.add("69,108,5089,10,22"));
    assertEquals(644, sc.add("43,67,33,109,300,3,89"));
  }

  @Test
  public void acceptsNewLinesAndCommas() {
    assertEquals(100, sc.add("25,25\n50"));
    assertEquals(65, sc.add("40\n25"));
    assertEquals(719, sc.add("250\n250,50\n69,100"));
  }
}
