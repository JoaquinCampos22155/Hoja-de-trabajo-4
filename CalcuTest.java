
import junit.framework.TestCase;
public class CalcuTest extends TestCase {
    Calcu calculadora;

    private void prueba()
    {
        FunStack<Double> pila = new FormaArrayL<>();
        calculadora = Calcu.getInstance(pila);
    }

    public void testGetInstance()
    {
        prueba();
        FunStack<Double> pila = new FormaArrayL<>();
        Calcu calculadora1 = Calcu.getInstance(pila);
        Calcu calculadora2 = Calcu.getInstance(pila);
        assertEquals(calculadora1, calculadora2);
    }

    public void testCalcular()
    {
        prueba();
        calculadora.calcular("3 7 * 1 -");
        assertEquals(calculadora.calcular("3 7 * 1 -"), 20.0);
    }
}