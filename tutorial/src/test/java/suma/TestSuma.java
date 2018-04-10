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
        
        a = 9;
        b = -6;
        limInf = -8;
        limSup = 10;
        
        assertTrue("Suma de 'a' = " + a + " y 'b' = " + b + " es ", s.suma(a, b) == 3);
        a = 10; b = -6;
        assertTrue("Suma de 'a' = " + a + " y 'b' = " + b + " es ", s.suma(a, b) == 4);
        a = -69; b = 9;
        assertTrue("Suma de 'a' = " + a + " y 'b' = " + b + " es ", s.suma(a, b) == -60);
        a = 100; b = 43;
        assertTrue("Suma de 'a' = " + a + " y 'b' = " + b + " es ", s.suma(a, b) == 134);
        a = 87; b = -a;
        assertTrue("Suma de 'a' = " + a + " y 'b' = " + b + " es ", s.suma(a, b) == 0);
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
