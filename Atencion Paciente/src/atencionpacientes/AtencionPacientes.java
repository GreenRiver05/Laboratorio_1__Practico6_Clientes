package atencionpacientes;

public class AtencionPacientes {

    public static void main(String[] args) {

        Turno turno = new Turno();
        turno.agregarPaciente();
        turno.mostrarPacientes();
        turno.buscarPaciente(5);
        turno.buscarTodos("critico");
    }

}
