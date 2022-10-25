package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuenta {
	
	@BeforeAll
		Cuenta cuenta_pruebas=new Cuenta("12345","Gonzalo",50);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta_pruebas.ingresar(50);
		assertEquals(100, cuenta_pruebas.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta_pruebas.retirar(50);
		assertEquals(0, cuenta_pruebas.getSaldo());
	}
	
	

}
