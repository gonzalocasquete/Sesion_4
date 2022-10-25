package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Principal.Cuenta;

class TestCuenta {
	
	static Cuenta cuenta_pruebas;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta_pruebas=new Cuenta("12345","Gonzalo",50);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta_pruebas.setSaldo(50);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() throws Exception {
		cuenta_pruebas.ingresar(50);
		assertEquals(100, cuenta_pruebas.getSaldo());
	}
	
	@Test
	void testRetirar() throws Exception {
		cuenta_pruebas.retirar(50);
		assertEquals(0, cuenta_pruebas.getSaldo());
	}
	
	

}
