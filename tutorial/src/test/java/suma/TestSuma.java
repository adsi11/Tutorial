package suma;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSuma {
	private final static Logger LOG = Logger.getLogger(TestSuma.class);
    
    private Suma s = new Suma();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isCorrectCalcTest() {
    		int a, b, limInf, limSup;
    		LOG.info("Ejecutando la prueba");
        
        a = 9; b = -6;
        assertTrue("Suma de 'a' = " + a + " y 'b' = " + b + " es 3", s.suma(a, b) == 3);
        a = 10; b = -6;
        assertTrue("Suma de 'a' = " + a + " y 'b' = " + b + " es 4", s.suma(a, b) == 4);
        a = -69; b = 9;
        assertTrue("Suma de 'a' = " + a + " y 'b' = " + b + " es -60", s.suma(a, b) == -60);
        a = 100; b = 43;
        assertTrue("Suma de 'a' = " + a + " y 'b' = " + b + " es 143", s.suma(a, b) == 143);
        a = 87; b = -a;
        assertTrue("Suma de 'a' = " + a + " y 'b' = " + b + " es 0", s.suma(a, b) == 0);
        
        limInf = -10; limSup = 100;
        assertTrue("Suma del intervalo 'limInf' = " + limInf + " y 'limSup' = " + limSup + " es 4995", s.sumaIntervalo(limInf, limSup) == 4995);
        limInf = 90; limSup = 0;
        assertTrue("Suma del intervalo 'limInf' = " + limInf + " y 'limSup' = " + limSup + " es 0", s.sumaIntervalo(limInf, limSup) == 0);
        limInf = 1000; limSup = 2000;
        assertTrue("Suma del intervalo 'limInf' = " + limInf + " y 'limSup' = " + limSup + " es 1501500", s.sumaIntervalo(limInf, limSup) == 1501500);
        limInf = -34; limSup = -9;
        assertTrue("Suma del intervalo 'limInf' = " + limInf + " y 'limSup' = " + limSup + " es -559", s.sumaIntervalo(limInf, limSup) == -559);
        limInf = -8; limSup = -8;
        assertTrue("Suma del intervalo 'limInf' = " + limInf + " y 'limSup' = " + limSup + " es -8", s.sumaIntervalo(limInf, limSup) == -8);
        
        limSup = 50;
        assertTrue("Suma de los primeros limSup' = " + limSup + " naturales es 1275", s.sumaPrimerosNaturales(limSup) == 1275);
        limSup = 36;
        assertTrue("Suma de los primeros limSup' = " + limSup + " naturales es 36", s.sumaPrimerosNaturales(limSup) == 666);
        limSup = 10;
        assertTrue("Suma de los primeros limSup' = " + limSup + " naturales es 55", s.sumaPrimerosNaturales(limSup) == 55);
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
