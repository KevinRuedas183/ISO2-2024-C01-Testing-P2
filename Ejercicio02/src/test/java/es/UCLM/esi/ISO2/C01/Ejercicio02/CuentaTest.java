package es.UCLM.esi.ISO2.C01.ejercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testTrabajaMayor25Padres() {
		try {
			Cliente c = new Cliente(26, true, false, true);
			String res = Cuenta.determinar_cuenta(c);
			String expected = "Cuenta Independízate que va siendo hora";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testNoTrabajaMenor25NoPadres() {
		try {
			Cliente c = new Cliente(24, false, false, false);
			String res = Cuenta.determinar_cuenta(c);
			String expected = "Cuenta Vamos que tu puedes";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMayor18Menor25Padres() {
		try {
			Cliente c = new Cliente(19, true, false, true);
			String res = Cuenta.determinar_cuenta(c);
			String expected = "Cuenta Ahorra ahora que puedes";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMenor25Padres() {
		try {
			Cliente c = new Cliente(18, false, true, true);
			String res = Cuenta.determinar_cuenta(c);
			String expected = "Cuenta Vamos que tu puedes";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMenor18Padres() {
		try {
			Cliente c = new Cliente(17, false, true, true);
			String res = Cuenta.determinar_cuenta(c);
			String expected = "Cuenta confort";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMayor18NoPadres() {
		try {
			Cliente c = new Cliente(17, false, false, false);
			String res = Cuenta.determinar_cuenta(c);
			assertNull(res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMenor25Padres() {
		try {
			Cliente c = new Cliente(19, false, true, true);
			String res = Cuenta.determinar_cuenta(c);
			String expected = "Cuenta Vamos que tu puedes";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMenor25NoPadres() {
		try {
			Cliente c = new Cliente(17, false, true, false);
			String res = Cuenta.determinar_cuenta(c);
			assertNull(res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testEdadNegativa() {
		try {
			Cliente c = new Cliente(-1, false, true, false);
			assertNotNull(res);
		} catch (Exception e) {
		}
	}
	
}
