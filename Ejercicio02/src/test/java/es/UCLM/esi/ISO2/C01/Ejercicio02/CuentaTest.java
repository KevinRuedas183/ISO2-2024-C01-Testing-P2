package es.UCLM.esi.ISO2.C01.Ejercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testTrabajaMayor25Padres() {
		try {
			Cliente c = new Cliente(26, true, false, true);
			Cuenta cuenta = new Cuenta();
			String res = cuenta.determinar_cuenta(c);
			String expected = "Cuenta Independízate que va siendo hora";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMayor25NoPadres() {
		try {
			Cliente c = new Cliente(26, true, false, false);
			Cuenta cuenta = new Cuenta();
			String res = cuenta.determinar_cuenta(c);
			String expected = "Cuenta Bienvenido a la Vida Adulta";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMayor18Menor25NoPadres() {
		try {
			Cliente c = new Cliente(24, true, false, false);
			Cuenta cuenta = new Cuenta();
			String res = cuenta.determinar_cuenta(c);
			String expected = "Cuenta Saltando del Nido";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMayor18Menor25Padres() {
		try {
			Cliente c = new Cliente(19, true, false, true);
			Cuenta cuenta = new Cuenta();
			String res = cuenta.determinar_cuenta(c);
			String expected = "Cuenta Ahorra ahora que puedes";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMenor25Padres() {
		try {
			Cliente c = new Cliente(18, false, true, true);
			Cuenta cuenta = new Cuenta();
			String res = cuenta.determinar_cuenta(c);
			String expected = "";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMenor18Padres() {
		try {
			Cliente c = new Cliente(17, false, true, true);
			Cuenta cuenta = new Cuenta();
			String res = cuenta.determinar_cuenta(c);
			String expected = "Cuenta confort";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testTrabajaMayor18NoPadres() {
		try {
			Cliente c = new Cliente(17, false, false, false);
			Cuenta cuenta = new Cuenta();
			String res = cuenta.determinar_cuenta(c);
			assertEquals("", res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testNoTrabajaMenor25NoPadres() {
		try {
			Cliente c = new Cliente(17, false, true, false);
			Cuenta cuenta = new Cuenta();
			String res = cuenta.determinar_cuenta(c);
			String expected = "Cuenta Vamos que tu puedes";
			assertEquals(expected, res);
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testEdadNegativa() {
		try {
			Cliente c = new Cliente(-1, false, true, false);
			Cuenta cuenta = new Cuenta();
			String res = cuenta.determinar_cuenta(c);
			assertEquals("", res);
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
}
