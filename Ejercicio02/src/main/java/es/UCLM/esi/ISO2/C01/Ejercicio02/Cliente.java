package es.UCLM.esi.ISO2.C01.Ejercicio02;

public class Cliente {

	private int edad;
	private boolean trabaja;
	private boolean estudia;
	private boolean vivePadres;
		
	public Cliente(int edad, boolean trabaja, boolean estudia, boolean vivePadres) {
		super();
		this.edad = edad;
		this.trabaja = trabaja;
		this.estudia = estudia;
		this.vivePadres = vivePadres;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isTrabaja() {
		return trabaja;
	}
	public void setTrabaja(boolean trabaja) {
		this.trabaja = trabaja;
	}
	public boolean isEstudia() {
		return estudia;
	}
	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}
	public boolean isVivePadres() {
		return vivePadres;
	}
	public void setVivePadres(boolean vivePadres) {
		this.vivePadres = vivePadres;
	}
	
	
}
