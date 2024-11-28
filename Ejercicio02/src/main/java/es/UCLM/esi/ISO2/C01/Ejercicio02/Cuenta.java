package es.UCLM.esi.ISO2.C01.Ejercicio02;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	int edad = 0;
    	boolean trabaja;
    	boolean estudia;
    	boolean vivePadres;
    	String cuenta = "";
    	
    	if(edad<18 && estudia==true && vivePadres==true) {
    		cuenta = "Cuenta confort";
    	}
    	
    	else if(edad<25 && estudia==true && vivePadres==false) {
    		cuenta = "Cuenta Vamos que tu puedes";
    	}
    	
    	else if(edad>28 && trabaja==true && vivePadres==true) {
    		cuenta = "Cuenta ahorra ahora que pudes";
    	}
    	
    	else {
    		cuenta = "Saltando del nido";
    	}
    	
    	if(edad>25 && trabaja==true && vivePadres==true) {
    		cuenta = "Cuenta independizate que va siendo hora";
    	}
    	
    	else if(edad>25 && trabaja==true && vivePadres==false){
    		cuenta = "Cuenta bienvenido a la vida adulta";
    	}
    	
    	
    	
    	
        System.out.println("El tipo de cuenta es:" + cuenta);
    }
}
