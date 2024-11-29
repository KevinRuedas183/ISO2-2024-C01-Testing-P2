package es.UCLM.esi.ISO2.C01.Ejercicio02;

public class Cuenta {
    public String determinar_cuenta(Cliente c) {
    	
    	String cuenta = "";
    	/*Primero controlamos si traba para disminuir las combinaciones de los siguientes if. Porque como se puede dar el caso
    	 * donde trbaje y estudie, priorizamos que trabaje a que estudie. Por lo que los casos de que sea estudiante se darán
    	 * si y solo si estudia, mientras que los de trabaja se darán si trabaja o si trabja y estudia que es más lógico.
    	 * */
    	if(c.isTrabaja()==true) {
    		
    		//Si es mayor de 25 y va implicito que trabaja y no estudia puede:
    		if(c.getEdad()>25) {
    			
    			//Vivir con sus padres
    			if(c.isVivePadres()==true) {
    				//Caso 4
    				cuenta = "Cuenta Independízate que va siendo hora";
    			}
    			//No vive con sus padres
    			else {
    				//Caso 5
    				cuenta = "Cuenta Bienvenido a la Vida Adulta";
    			}
    			
    		}
    		//Si es mayor de 18 pero menor de 25, y va implicito que trabaja, puede:
    		else if(c.getEdad()>18) {
    			
    			//Vivir con sus padres
    			if(c.isVivePadres()==true) {
    				//Caso 3.1
    				cuenta = "Cuenta Ahorra ahora que puedes";
    			}
    			//No vivir con sus padres
    			else {
    				//Caso 3.2
    				cuenta = "Cuenta Saltando del Nido";
    			}
    		}
    	}
    	
    	//Si no trabaja y si estudia
    	else if(c.isEstudia()==true) {
    		
    		
    		//En estos dos ifs ya va implicito que está estudiando, por lo que controlamos las demás condiciones
    		if(c.getEdad()<18 && c.isVivePadres()==true) {
    			//Caso 1
        		cuenta = "Cuenta confort";
        	}
    		
    		else if(c.getEdad()<25 &&  c.isVivePadres()==false) {
    			//Caso 2
        		cuenta = "Cuenta Vamos que tu puedes";
        	}
    	}
    	    	
    	return cuenta;
        
    }
}
