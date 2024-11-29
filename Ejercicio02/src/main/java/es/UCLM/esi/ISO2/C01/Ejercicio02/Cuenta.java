package es.UCLM.esi.ISO2.C01.Ejercicio02;

/**
 * Hello world!
 */
public class Cuenta {
    public String determinar_cuenta(Cliente c) {

    	String cuenta = "";
    	
    	if(c.getEdad()<18 && c.isEstudia()==true && c.isVivePadres()==true) {
    		cuenta = "Cuenta confort";
    	}
    	
    	else if(c.getEdad()<25 && c.isEstudia()==true && c.isVivePadres()==false) {
    		cuenta = "Cuenta Vamos que tu puedes";
    	}
    	
    	else if(c.getEdad()>18 && c.isTrabaja()==true && c.isVivePadres()==true) {
    		cuenta = "Cuenta ahorra ahora que pudes";
    	}
    	
    	else {
    		cuenta = "Saltando del nido";
    	}
    	
    	if(c.getEdad()>25 && c.isTrabaja()==true && c.isVivePadres()==true) {
    		cuenta = "Cuenta independizate que va siendo hora";
    	}
    	
    	else if(c.getEdad()>25 && c.isTrabaja()==true && c.isVivePadres()==false){
    		cuenta = "Cuenta bienvenido a la vida adulta";
    	}
    	
    	
    	
    	return cuenta;
        
    }
}
