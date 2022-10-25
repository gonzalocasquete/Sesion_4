package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Principal.Cuenta;

class TestCuenta {

	static Cuenta cuenta_12345;
	static Cuenta cuenta_67890;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta_12345 = new Cuenta("12345", "Gonzalo", 50);
		cuenta_67890 = new Cuenta("67890", "Manuel", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta_12345.setSaldo(50);
		cuenta_67890.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() throws Exception {
		cuenta_12345.ingresar(50);
		assertEquals(100, cuenta_12345.getSaldo());
	}

	@Test
	void testRetirar() throws Exception {
		cuenta_12345.retirar(50);
		assertEquals(0, cuenta_12345.getSaldo());
	}

	@Test
	void test0014() throws Exception {
		cuenta_12345.retirar(200);
		cuenta_67890.retirar(350);
		cuenta_12345.ingresar(100);
		try {
			cuenta_67890.retirar(200);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		cuenta_67890.retirar(150);
		cuenta_12345.retirar(200);
		cuenta_67890.ingresar(50);
		try {
			cuenta_67890.retirar(100);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		assertEquals(-250, cuenta_12345.getSaldo());
		assertEquals(-450, cuenta_67890.getSaldo());
	}

}
