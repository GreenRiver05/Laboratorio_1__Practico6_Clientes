package Practico6_DirectorioTelefonico;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Directorio {   //cambiamos el nombre de la clase

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static final String nada = "\u001B[0m";
    public static final String rojo = "\u001B[31m";
    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String violeta = "\u001B[35m";

    private Map<String, Cliente> guiaTelefonica;   //cambiamos el nombre del mapa

    public Directorio() {
        guiaTelefonica = new HashMap<>();
        guiaTelefonica.put("1", new Cliente("4589125", "Hernesto", "Pedernera", "Villa Mercedes", "Mitre 2345"));
        guiaTelefonica.put("2", new Cliente("77898", "Carlota", "Sueca", "Villa Mercedes", "Turrado 125"));
        guiaTelefonica.put("3", new Cliente("4215", "Charles", "Chaplin", "San Luis", "España 589"));
        guiaTelefonica.put("4", new Cliente("689825", "Aquiles", "Vaesa", "San Luis", "Rivadavia 1158"));
        guiaTelefonica.put("5", new Cliente("4554899", "Hernesto", "Gutierrez", "Villa Mercedes", "Perdernera 555"));
        guiaTelefonica.put("6", new Cliente("896689", "Esteban", "Quito", "Justo Darac", "San Lorenzo 115"));
    }

    public void agregarCliente() {
        String telefono;
        Cliente usuario = new Cliente();
        System.out.println("    ~~ Cliente Nuevo ~~\n");
        System.out.print("Nombre....>> ");
        usuario.nombre = leer.next();
        System.out.print("Apellido..>> ");
        usuario.apellido = leer.next();
        System.out.print("Dni.......>> ");
        usuario.dni = leer.next();
        System.out.print("Ciudad....>> ");
        usuario.ciudad = leer.next();
        System.out.print("Direccion.>> ");
        usuario.direccion = leer.next();
        System.out.print("Telefono..>> ");

        //investigar clases patter y matcher      
        telefono = leer.next();
        guiaTelefonica.put(telefono, usuario);
    }


    public void buscarCliente() {
        System.out.print(amarillo + "          TELEFONO > ");
        String telefono = leer.next();
        Cliente p = null;

        // Este método recibe una llave dada por el usuario y revisa si la llave se encuentra en la lista o no. Si la llave se 
        if (guiaTelefonica.containsKey(telefono)) {// encuentra retorna verdadero y si no falso.
            p = guiaTelefonica.get(telefono);
            System.out.println(p);
        } else {
            System.out.println("No se encontro Cliente");
        }
    }

    public void buscarTelefono() {
        System.out.print(amarillo + "          APELLIDO > ");
        String buscarApellido = leer.next();
        Collection valores = guiaTelefonica.values();                // devuelve los valores en una Collection
        Iterator it = valores.iterator();                           // retorna valores interator
        while (it.hasNext()) {                                      // recorre mientras haya mas
            Cliente c = (Cliente) it.next();                        // next viene como tipo objeto y lo necesito como tipo Cliente
            if (c.getApellido().equals(buscarApellido)) {
                System.out.println(c);
            }
        }
    }

    public void buscarClientes() {
        System.out.print(amarillo + "          CIUDAD > ");
        String buscarCiudad = leer.next();
        Collection valores = guiaTelefonica.values();
        Iterator it = valores.iterator();
        while (it.hasNext()) {
            Cliente c = (Cliente) it.next();
            if (c.getCiudad().equals(buscarCiudad)) {
                System.out.println(c);
            }
        }
    }

    public void borrarCliente() {
        System.out.print(rojo + "          TELEFONO > ");
        String telefono = leer.next();
        Cliente p = null;
        String opEliminar;
        int salir = 0;
        
        if (guiaTelefonica.containsKey(telefono)) {
            p = guiaTelefonica.get(telefono);
            System.out.println(p);
        }

        do {
            System.out.println("Desea Confirmar la eliminacion del Cliente 'S' (si ) / 'N' (no)");
            System.out.print(rojo + "Opcion" + nada + " --> ");
            opEliminar = leer.next();
            switch (opEliminar) {
                case "s":
                case "S":
                    guiaTelefonica.remove(telefono);
                    System.out.println("Eliminado con Exito");
                    salir = 1;
                    break;
                case "n":
                case "N":
                    System.out.println("Se Cancelo la Eliminacion");
                    salir = 1;
                    break;
                default:
                    System.out.println("Elija 'S' o 'N'");
            }
        } while (salir == 0);
    }

}
