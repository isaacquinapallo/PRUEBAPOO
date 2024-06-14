import java.util.Scanner;

import Clases.Cliente;
import Clases.Ruta;
import Clases.EmpresaTransporte;
import Clases.Servicio;
import Clases.Asiento;
import Clases.Pasaje;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la empresa Buho");
        System.out.println("Ingrese su ID de cliente:");
        int idCliente = sc.nextInt();

        // Crear instancia de Cliente
        Cliente cliente = new Cliente(idCliente);

        // Preguntar por la ciudad de Origen y Destino
        System.out.println("Ingrese la ciudad de Origen:");
        System.out.print("\n1.Quito-Guayaquil \n2.Quito-Tulcan, \n3.Quito-Riobamba, \n4.Quito-Puyo, \n5.Guayaquil-Quito \n6.Puyo-Quito, \n7.Tulcan-Quito, \n8.Riobamba-Quito");
        System.out.println("\n9.Salir del Programa");
        int opcion = sc.nextInt();

        while (opcion != 9) {
            if (opcion >= 1 && opcion <= 8) {
                // Preguntar por el tipo de pasaje
                System.out.println("Estas son las opciones de tipo de Pasaje:");
                System.out.println("1. Normal");
                System.out.println("2. VIP");
                int opcionPasaje = sc.nextInt();
                if (opcionPasaje == 1) {
                    System.out.println("Escogiste el pasaje Normal");
                    System.out.println("¿Deseas usar el asiento de la 1. ventana, 2. pasillo, 3. final o 4. delante?");
                    int opcionAsiento = sc.nextInt();

                    // Lógica para procesar la selección de asiento
                    String tipoAsiento = "";
                    switch (opcionAsiento) {
                        case 1:
                            tipoAsiento = "ventana";
                            break;
                        case 2:
                            tipoAsiento = "pasillo";
                            break;
                        case 3:
                            tipoAsiento = "final";
                            break;
                        case 4:
                            tipoAsiento = "delante";
                            break;
                        default:
                            System.out.println("Opción de asiento incorrecta");
                            break;
                    }
                    System.out.println("Seleccionaste el asiento " + tipoAsiento);
                    // Lógica para procesar la selección de espacio para maletas
                    boolean espacioMaleta = false;
                    String respuesta;
                    System.out.println("¿Deseas espacio extra para maletas? (true/false)");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("true")) {
                        espacioMaleta = true;
                        System.out.println("Has seleccionado espacio extra para maletas.");
                    } else if (respuesta.equalsIgnoreCase("false")) {
                        System.out.println("No has seleccionado espacio extra para maletas.");
                    } else {
                        System.out.println("Respuesta no válida. Por defecto, no se asigna espacio extra para maletas.");
                    }

                } else if (opcionPasaje == 2) {
                    System.out.println("Escogiste el pasaje VIP");
                    // Lógica para procesar la selección de espacio para maletas
                    boolean espacioMaleta = false;
                    String respuesta;
                    System.out.println("¿Deseas espacio extra para maletas? (true/false)");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("true")) {
                        espacioMaleta = true;
                        System.out.println("Has seleccionado espacio extra para maletas.");
                    } else if (respuesta.equalsIgnoreCase("false")) {
                        System.out.println("No has seleccionado espacio extra para maletas.");
                    } else {
                        System.out.println("Respuesta no válida. Por defecto, no se asigna espacio extra para maletas.");
                    }

                } else {
                    System.out.println("Opción Incorrecta");
                }
            } else {
                System.out.println("Opción incorrecta");
            }

            // Solicitar nuevamente la ciudad de origen
            System.out.println("Ingrese la ciudad de Origen:");
            System.out.print("\n1.Quito-Guayaquil \n2.Quito-Tulcan, \n3.Quito-Riobamba, \n4.Quito-Puyo, \n5.Guayaquil-Quito \n6.Puyo-Quito, \n7.Tulcan-Quito, \n8.Riobamba-Quito");
            System.out.println("\n9.Salir del Programa");
            opcion = sc.nextInt();
        }

        System.out.println("Gracias por usar el programa. ¡Hasta luego!");

        // Imprimir los métodos de las clases
        System.out.println("\n--- Métodos de las Clases ---");
        System.out.println("Métodos de la clase Cliente:");
        cliente.getIdCliente();

        // Instanciar objetos de las clases EmpresaTransporte y Ruta
        EmpresaTransporte empresa = new EmpresaTransporte("El Búho");
        Ruta ruta = new Ruta("Quito-Guayaquil", 20.0);
        System.out.println("\nMétodos de la clase EmpresaTransporte:");
        empresa.getNombreEmpresa();
        System.out.println("\nMétodos de la clase Ruta:");
        ruta.getOrigenDestino();
        ruta.getPrecio();
    }
}
