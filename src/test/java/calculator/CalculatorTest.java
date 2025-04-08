package calculator;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();
//adunarea ar trebui sa fie corecta pt nr intregi;
@Test
    public void testAdunare () {
    System.out.println("S-a intrat in testul pt. verificarea adunarii");
    double rezultatActual = calculator.adunare(4,   5);

    //definiti rezultatul actual asteptat -> double rezultatAsteptat  = 9;
    assertEquals ( 9,rezultatActual);

}
@Test
    public void testScadere() {

}
}
