package app;

import model.*;
import util.RutInvalidoException;
import util.TextoVacioException;

/**
 *
 * Sistema de gestión Llanquihue Tour
 *
 * @author Fabrizio Fernandini.
 * @version 1.0
 */
public class Main {

    /**
     *
     * Clase principal del sistema de Llanquihue Tour.
     * @param args Argumentos.
     */
    public static void main(String[] args) {
        System.out.println("---- Llanquihue Tour ----\n");

        // Instancia Cliente 1
        try {
            Rut rutCliente1 = new Rut("11.969.133-8");
            Direccion direccionCliente1 = new Direccion("Av. Pedro Montt", "2030", "Valdivia", "Los Ríos");
            Cliente cliente1 = new Cliente("Juan", "Pérez", rutCliente1, "+569 1234 5678", direccionCliente1, "jperez@correo.cl", "a12");

            System.out.println("--- Salida toString Cliente 1 ---");
            System.out.println(cliente1.toString());
            System.out.println();
        }
        catch (RutInvalidoException e) {
            System.out.println("---- Error en Cliente 1 ----");
            System.out.println("Error al crear el RUT");
            System.out.println(e.getMessage());
            System.out.println();
        }
        catch (TextoVacioException e) {
            System.out.println("---- Error en Cliente 1 ----");
            System.out.println("Error al ingresar los datos:");
            System.out.println(e.getMessage());
            System.out.println();
        }

        // Instancia Guía 1
        try {
            Rut rutGuia1 = new Rut("9.580.346-6");
            Direccion direccionGuia1 = new Direccion("Lago Ranco", "851", "Angol", "Araucanía");
            Guia guia1 = new Guia("Felipe", "Campos", rutGuia1, "+569 8795 1254", direccionGuia1, "felipe@correo.cl", "G42", "Guia", true);

            System.out.println("--- Salida toString Guía 1 ---");
            System.out.println(guia1.toString());
            System.out.println();
        }
        catch (RutInvalidoException e) {
            System.out.println("---- Error en Guía 1 ----");
            System.out.println("Error al crear el RUT");
            System.out.println(e.getMessage());
            System.out.println();
        }
        catch (TextoVacioException e) {
            System.out.println("---- Error en Guía 1 ----");
            System.out.println("Error al ingresar los datos:");
            System.out.println(e.getMessage());
            System.out.println();
        }

        // Instancia Operador 1
        try {
            Rut rutOperador1 = new Rut("5.122.025-0");
            Direccion direccionOperador1 = new Direccion("Santa Rita", "1820", "Valparaíso", "Valparaíso");
            Operador operador1 = new Operador("Manuel", "Araya", rutOperador1, "+569 4355 9944", direccionOperador1, "manuel@correo.cl", "OP50", "Operador", "Zona Centro");

            System.out.println("--- Salida toString Operador 1 ---");
            System.out.println(operador1.toString());
            System.out.println();
        }
        catch (RutInvalidoException e) {
            System.out.println("---- Error en Operador 1 ----");
            System.out.println("Error al crear el RUT");
            System.out.println(e.getMessage());
            System.out.println();
        }
        catch (TextoVacioException e) {
            System.out.println("---- Error en Operador 1 ----");
            System.out.println("Error al ingresar los datos:");
            System.out.println(e.getMessage());
            System.out.println();
        }

        // Instancia Proveedor 1
        try {
            Rut rutProveedor1 = new Rut("91.144.000-8");
            Direccion direccionProveedor1 = new Direccion("Av. El Golf", "40", "Las Condes", "Metropolitana");
            Proveedor proveedor1 = new Proveedor("Coca Cola",rutProveedor1, "800 21 99 99", direccionProveedor1, "contacto@cocacola.cl", "P12");

            System.out.println("--- Salida toString Proveedor 1 ---");
            System.out.println(proveedor1.toString());
            System.out.println();
        }
        catch (RutInvalidoException e) {
            System.out.println("---- Error en Proveedor 1 ----");
            System.out.println("Error al crear el RUT");
            System.out.println(e.getMessage());
            System.out.println();
        }
        catch (TextoVacioException e) {
            System.out.println("---- Error en Proveedor 1 ----");
            System.out.println("Error al ingresar los datos:");
            System.out.println(e.getMessage());
            System.out.println();
        }

    }

}
