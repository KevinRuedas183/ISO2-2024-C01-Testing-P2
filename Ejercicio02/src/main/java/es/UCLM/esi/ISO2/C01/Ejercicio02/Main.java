package es.UCLM.esi.ISO2.C01.Ejercicio02;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            Cliente cliente = new Cliente(0, false, false, false);

            while (true) {
                try {
                    System.out.print("Introduce la edad del cliente: ");
                    cliente.setEdad(scanner.nextInt());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un número válido para la edad.");
                    scanner.next(); 
                }
            }

            while (true) {
                try {
                    System.out.print("¿El cliente trabaja? (true/false): ");
                    cliente.setTrabaja(scanner.nextBoolean());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce 'true' o 'false'.");
                    scanner.next(); 
                }
            }

            while (true) {
                try {
                    System.out.print("¿El cliente estudia? (true/false): ");
                    cliente.setEstudia(scanner.nextBoolean());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce 'true' o 'false'.");
                    scanner.next(); 
                }
            }

            while (true) {
                try {
                    System.out.print("¿El cliente vive con sus padres? (true/false): ");
                    cliente.setVivePadres(scanner.nextBoolean());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce 'true' o 'false'.");
                    scanner.next(); 
                }
            }

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
