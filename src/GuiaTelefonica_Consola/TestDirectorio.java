package GuiaTelefonica_Consola;

import java.util.Scanner;

public class TestDirectorio {

    public static final String nada = "\u001B[0m";                      // se utilizo ANSI escape code, color caractares
    public static final String rojo = "\u001B[31m";                     // se utilizo ANSI escape code, color caractares
    public static final String verde = "\u001B[32m";                    // se utilizo ANSI escape code, color caractares
    public static final String amarillo = "\u001B[33m";                 // se utilizo ANSI escape code, color caractares
    public static final String violeta = "\u001B[35m";                  // se utilizo ANSI escape code, color caractares

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DirectorioConsola guia = new DirectorioConsola();
        int salir = 0;

        do {
            System.out.println(violeta + "                            ♦  DIRECTORIO  ♦  ");
            System.out.println("");
            System.out.println(violeta + "1)" + nada + " AGREGAR CLIENTE");
            System.out.println(violeta + "2)" + nada + " BUSCAR CLIENTE");
            System.out.println(violeta + "3)" + nada + " BORRAR CLIENTE");
            System.out.println(violeta + "4)" + nada + " CERRAR DIRECTORIO");
            System.out.println(violeta + "");
            guia.elegirOpcion();

            switch (guia.opcion) {

                case "1":
                    System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println(verde + "                            + AGREGAR CLIENTE +  \n\n");
                    System.out.println(verde + "………………………………………………………………………………………………………………………………………………");
                    guia.agregarCliente();

                    do {
                        System.out.println(verde + "\n1)" + nada + " AGREGAR OTRO CLIENTE");
                        System.out.println(verde + "2) " + nada + "VOLVER AL MENU PRINCIPAL");
                        System.out.println(verde + "");
                        guia.elegirOpcion();
                        switch (guia.opcion) {
                            case "1":
                                System.out.println("\n\n");
                                System.out.println(verde + "………………………………………………………………………………………………………………………………………………");
                                guia.agregarCliente();
                                break;
                            case "2":
                                System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
                                break;
                            default:
                                System.out.println("\n" + rojo + "     ¤ OPCION INVALIDA ¤ " + nada + " Ingrese |1| o |2|");
                        }
                    } while (!"2".equals(guia.opcion));
                    break;

                case "2":
                    System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println(amarillo + "                           ○ BUSCAR CLIENTE ○  \n");
                    do {

                        System.out.println("\n");
                        System.out.println(amarillo + "1)" + nada + " BUSCAR POR TELEFONO ");
                        System.out.println(amarillo + "2)" + nada + " BUSCAR POR APELLIDO");
                        System.out.println(amarillo + "3)" + nada + " BUSCAR POR CIUDAD");
                        System.out.println(amarillo + "4)" + nada + " VOLVER AL MENU PRINCIPAL");
                        System.out.println(amarillo + "");
                        guia.elegirOpcion();
                        switch (guia.opcion) {
                            case "1":
                                System.out.println("\n\n");
                                System.out.println(amarillo + "………………………………………………………………………………………………………………………………………………");
                                guia.buscarCliente();
                                System.out.println(amarillo + "………………………………………………………………………………………………………………………………………………");
                                System.out.println("\n\n");
                                break;
                            case "2":
                                System.out.println("\n\n");
                                System.out.println(amarillo + "………………………………………………………………………………………………………………………………………………");
                                guia.buscarTelefono();
                                System.out.println(amarillo + "………………………………………………………………………………………………………………………………………………");
                                System.out.println("\n\n");
                                break;
                            case "3":
                                System.out.println("\n\n");
                                System.out.println(amarillo + "………………………………………………………………………………………………………………………………………………");
                                guia.buscarClientes();
                                System.out.println(amarillo + "………………………………………………………………………………………………………………………………………………");
                                System.out.println("\n\n");
                                break;
                            case "4":
                                System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                                break;
                            default:
                                System.out.println("\n" + rojo + "      ¤ OPCION INVALIDA ¤ Ingrese una opcion dentro del menu\n");
                        }

                    } while (!"4".equals(guia.opcion));

                    break;

                case "3":
                    System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println(rojo + "                           x BORRAR CLIENTE x  \n\n");
                    System.out.println(rojo + "………………………………………………………………………………………………………………………………………………");
                    guia.borrarCliente();
                    do {
                        System.out.println(rojo + "\n1)" + nada + " BORRAR CLIENTE");
                        System.out.println(rojo + "2) " + nada + "VOLVER AL MENU PRINCIPAL");
                        System.out.println(rojo + "");
                        guia.elegirOpcion();
                        switch (guia.opcion) {
                            case "1":
                                System.out.println("\n\n\n" + rojo + "………………………………………………………………………………………………………………………………………………");
                                guia.borrarCliente();
                                break;
                            case "2":
                                System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
                                break;
                            default:
                                System.out.println("\n" + rojo + "     ¤ OPCION INVALIDA ¤ " + nada + " Ingrese |1| o |2|");
                        }
                    } while (!"2".equals(guia.opcion));
                    break;
                case "4":
                    System.out.println("\n\n\n\n\n" + violeta + "                                      •• FIN ••\n\n");
                    salir++;
                    break;

                default:
                    System.out.println("\n" + rojo + "      ¤ OPCION INVALIDA ¤ Ingrese una opcion dentro del menu\n");
            }

        } while (salir == 0);

    }

}
