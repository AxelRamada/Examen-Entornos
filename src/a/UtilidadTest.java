package a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilidadTest {
Utilidad a=new Utilidad();
	@Test
	void cP1() {
		int esperado=0;
		int resultado=a.ejercicioD(0);
		assertEquals(esperado, resultado);
	}
	@Test
	void cP2() {
		int esperado=4;
		int resultado=a.ejercicioD(2);
		assertEquals(esperado, resultado);
	}
	@Test
	void cP3() {
		int esperado=9;
		int resultado=a.ejercicioD(3);
		assertEquals(esperado, resultado);
	}
	@Test
	void cP4() {
		int esperado=28;
		int resultado=a.ejercicioD(4);
		assertEquals(esperado, resultado);
	}
	@Test
	void cP5() {
		int esperado=125;
		int resultado=a.ejercicioD(5);
		assertEquals(esperado, resultado);
	
	

}
}
