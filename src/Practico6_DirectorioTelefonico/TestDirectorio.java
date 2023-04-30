package Practico6_DirectorioTelefonico;

import java.util.Scanner;

public class TestDirectorio {

    public static final String nada = "\u001B[0m";
    public static final String rojo = "\u001B[31m";
    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String violeta = "\u001B[35m";
    public static final String celeste = "\u001B[36m";
    public static final String negroF = "\u001B[40m";

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Directorio guia = new Directorio();

        int opMenuPrincipal, opAgregar, opBuscar;

        do {
            System.out.println(violeta + "                      ♦  DIRECTORIO  ♦  ");
            System.out.println("");
            System.out.println(violeta + "1)" + nada + " AGREGAR CLIENTE");
            System.out.println(violeta + "2)" + nada + " BUSCAR CLIENTE");
            System.out.println(violeta + "3)" + nada + " BORRAR CLIENTE");
            System.out.println(violeta + "4)" + nada + " CERRAR DIRECTORIO");
            System.out.println("");
            System.out.print(violeta + "Opcion" + nada + " --> ");
            opMenuPrincipal = leer.nextInt();

            switch (opMenuPrincipal) {

                case 1:
                    System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println(verde + "                      + AGREGAR CLIENTE +  ");
                    guia.agregarCliente();

                    do {
                        System.out.println(verde + "\n1)" + nada + " AGREGAR OTRO CLIENTE");
                        System.out.println(verde + "2) " + nada + "VOLVER AL MENU PRINCIPAL");
                        System.out.println("");
                        System.out.print(verde + "Opcion" + nada + " --> ");
                        opAgregar = leer.nextInt();
                        switch (opAgregar) {
                            case 1:
                                System.out.println(verde + "………………………………………………………………………………\n");
                                guia.agregarCliente();
                                break;
                            case 2:
                                System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
                                break;
                            default:
                                System.out.println("\n" + rojo + "     ¤ OPCION INVALIDA ¤ " + nada + " Ingrese |1| o |2|");
                        }
                    } while (opAgregar != 2);
                    break;

                case 2:
                    System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println(amarillo + "                      ○ BUSCAR CLIENTE ○  \n");
                    do {

                        System.out.println("");
                        System.out.println(amarillo + "1)" + nada + " BUSCAR POR TELEFONO ");
                        System.out.println(amarillo + "2)" + nada + " BUSCAR POR APELLIDO");
                        System.out.println(amarillo + "3)" + nada + " BUSCAR POR CIUDAD");
                        System.out.println(amarillo + "4)" + nada + " VOLVER AL MENU PRINCIPAL");
                        System.out.println("");
                        System.out.print(amarillo + "Opcion" + nada + " --> ");
                        opBuscar = leer.nextInt();

                        switch (opBuscar) {
                            case 1:
                                System.out.println(amarillo + "………………………………………………………………………………");
                                System.out.println(amarillo + "………………………………………………………………………………");
                                guia.buscarCliente();
                                System.out.println(amarillo + "\n………………………………………………………………………………");
                                System.out.println(amarillo + "………………………………………………………………………………");
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                                break;
                            default:
                                System.out.println("\n" + rojo + "      ¤ OPCION INVALIDA ¤ Ingrese una opcion dentro del menu");
                        }

                    } while (opBuscar != 4);

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    System.out.println("\n" + rojo + "      ¤ OPCION INVALIDA ¤ Ingrese una opcion dentro del menu");
            }

        } while (opMenuPrincipal != 4);

    }

}

//        Turno turno = new Turno();
//        turno.agregarPaciente();
//        turno.mostrarPacientes();
//        turno.buscarPaciente(5);
//        turno.buscarTodos("critico");
//escritorio.removeAll();
//        escritorio.repaint();
//        VistaAgregarPaciente vap = new VistaAgregarPaciente();
//        vap.setVisible(true);
//        escritorio.add(vap);
//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
