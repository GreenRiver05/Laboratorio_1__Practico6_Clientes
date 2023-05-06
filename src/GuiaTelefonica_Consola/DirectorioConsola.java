package GuiaTelefonica_Consola;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DirectorioConsola {   // esta clase quedo para usarla con la consola

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static final String nada = "\u001B[0m";                      // se utilizo ANSI escape code, color caractares
    public static final String rojo = "\u001B[31m";                     // se utilizo ANSI escape code, color caractares
    public static final String verde = "\u001B[32m";                    // se utilizo ANSI escape code, color caractares
    public static final String amarillo = "\u001B[33m";                 // se utilizo ANSI escape code, color caractares
    public static final String violeta = "\u001B[35m";                  // se utilizo ANSI escape code, color caractares

    private Map<String, Cliente> guiaTelefonica;   //cambiamos el nombre del mapa
    public String opcion = null;                   //el atributo lo necesitamos para el metodo creado para el color de las  opciones

    public DirectorioConsola() {
        guiaTelefonica = new HashMap<>();
        guiaTelefonica.put("1", new Cliente("4589125", "Hernesto", "quito", "villa mercedes", "Mitre 2345"));
        guiaTelefonica.put("2", new Cliente("77898", "Carlota", "quito", "villa mercedes", "Turrado 125"));
        guiaTelefonica.put("3", new Cliente("4215", "Charles", "chaplin", "san luis", "España 589"));
        guiaTelefonica.put("4", new Cliente("689825", "Aquiles", "vaesa", "san luis", "Rivadavia 1158"));
        guiaTelefonica.put("5", new Cliente("4554899", "Hernesto", "vaesa", "villa mercedes", "Perdernera 555"));
        guiaTelefonica.put("6", new Cliente("896689", "Esteban", "quito", "justo darac", "San Lorenzo 115"));
    }

    public void elegirOpcion() {        //solo creamos este metodo para usar color en cada opcion que se elige
        System.out.print("Opcion --> ");
        opcion = leer.next();

    }

    public void agregarCliente() {
        String telefono;
        Cliente usuario = new Cliente();
        System.out.println("               ~~ Cliente Nuevo ~~\n");
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
        System.out.println(verde + "………………………………………………………………………………………………………………………………………………\n\n");
    }

    public void buscarCliente() {
        System.out.print("               TELEFONO > ");
        String telefono = leer.next();
        Cliente p = null;

        // Este método recibe una llave dada por el usuario y revisa si la llave se encuentra en la lista o no. Si la llave se 
        if (guiaTelefonica.containsKey(telefono)) {// encuentra retorna verdadero y si no falso.
            p = guiaTelefonica.get(telefono);
            System.out.println(amarillo + p);
        } else {
            System.out.println("\n        No se encontro Cliente");
        }
    }

    public void buscarTelefono() {
        System.out.print("               APELLIDO > ");
        String buscarApellido = leer.next();
        int contador = 0;
        for (Map.Entry<String, Cliente> c : guiaTelefonica.entrySet()) {

            if (c.getValue().getApellido().equals(buscarApellido)) {
                System.out.println("\n" + nada + "DNI = " + c.getValue().getDni() + "        Nombre = " + c.getValue().getNombre() + "        Ciudad = "
                        + c.getValue().getCiudad() + "      Direccion = " + c.getValue().getDireccion() + amarillo + "      TELEFONO = " + c.getKey());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("\n        No hay clientes con este Apellido");
        }

    }

    public void buscarClientes() {
        System.out.print("               CIUDAD > ");
        String buscarCiudad = leer.next();
        int contador = 0;
        for (Map.Entry<String, Cliente> c : guiaTelefonica.entrySet()) {

            if (c.getValue().getCiudad().equals(buscarCiudad)) {
                System.out.println("\n" + nada + "DNI = " + c.getValue().getDni() + "        Nombre y Apellido = " + c.getValue().getNombre() + " "
                        + c.getValue().getApellido() + "      Direccion = " + c.getValue().getDireccion() + amarillo + "      TELEFONO = " + c.getKey());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("\n        No hay clientes en esta Ciudad");
        }
    }

    public void borrarCliente() {
        System.out.print("               TELEFONO > ");
        String telefono = leer.next();
        Cliente p = null;
        int salir = 0;

        if (guiaTelefonica.containsKey(telefono)) {
            p = guiaTelefonica.get(telefono);
            System.out.println(p.toString1());
            System.out.println("\nDesea Confirmar la eliminacion del Cliente" + rojo + "'S'" + nada + "(si) / " + rojo + "'N'" + nada + "(no)");
            do {
                System.out.println(rojo + "");
                elegirOpcion();
                switch (opcion) {
                    case "s":
                    case "S":
                        guiaTelefonica.remove(telefono);
                        System.out.println("\n" + rojo + "               ♦ ELIMINADO CON EXITO ♦");
                        salir = 1;
                        break;
                    case "n":
                    case "N":
                        System.out.println("\n" + verde + "               • Se Cancelo la Eliminacion •");
                        salir = 1;
                        break;
                    default:
                        System.out.println("\n                  Elija " + rojo + "'S'" + nada + " o " + rojo + "'N'" + nada);
                }
            } while (salir == 0);
        } else {
            System.out.println("\n          No se encontro Cliente");
        }

        System.out.println(rojo + "………………………………………………………………………………………………………………………………………………\n\n");
    }

}
