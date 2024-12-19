package es.UCLM.esi.ISO2.C01.Ejercicio02;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean trabaja = false;
		boolean padres = false;
		boolean estudia = false;
		int edad = -1;
        
            while (true) {
                try {
                    System.out.print("Introduce la edad del cliente: ");
                    edad = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un número válido para la edad.");
                    scanner.next(); 
                }
            }

            while (true) {
                try {
                    System.out.print("¿El cliente trabaja? (true/false): ");
                   trabaja = scanner.nextBoolean();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce 'true' o 'false'.");
                    scanner.next(); 
                }
            }

            while (true) {
                try {
                    System.out.print("¿El cliente estudia? (true/false): ");
                    estudia = scanner.nextBoolean();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce 'true' o 'false'.");
                    scanner.next(); 
                }
            }

            while (true) {
                try {
                    System.out.print("¿El cliente vive con sus padres? (true/false): ");
                    padres = scanner.nextBoolean();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce 'true' o 'false'.");
                    scanner.next(); 
                }
            }
            
         try {
            
        	Cliente cliente = new Cliente(edad, trabaja, estudia, padres);
            Cuenta cuenta = new Cuenta();
            String tipoCuenta = cuenta.determinar_cuenta(cliente);

            if (tipoCuenta.isEmpty()) {
                System.out.println("Error: No existe una cuenta posible para los datos proporcionados.");
            } else {
                System.out.println("El tipo de cuenta es: " + tipoCuenta);
            }
            
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
	}

}
