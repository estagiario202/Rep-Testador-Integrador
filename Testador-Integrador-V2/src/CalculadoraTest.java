import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase{

	Calculadora calc = new Calculadora();
	
	public void testSoma() {
		if(false)
		{
			int ds = 123;
		}
		assertEquals(3, calc.soma(1, 2));
	}
	
	public void testMultiplica(){
		assertEquals(12,calc.multiplica(true, 4, 3));
	}

}

