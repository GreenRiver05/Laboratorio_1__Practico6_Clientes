package Practico6_DirectorioTelefonico;

public class DirectorioTelefonico{

    public static void main(String[] args) {

        Turno turno = new Turno();
        turno.agregarPaciente();
        turno.mostrarPacientes();
        turno.buscarPaciente(5);
        turno.buscarTodos("critico");
    }

}


//escritorio.removeAll();
//        escritorio.repaint();
//        VistaAgregarPaciente vap = new VistaAgregarPaciente();
//        vap.setVisible(true);
//        escritorio.add(vap);
//this.setExtendedState(JFrame.MAXIMIZED_BOTH);