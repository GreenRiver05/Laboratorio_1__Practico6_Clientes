package Practico6_DirectorioTelefonico;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

public class Directorio {   //cambiamos el nombre de la clase

    private Map<Long, Cliente> guiaTelefonica;   //cambiamos el nombre del mapa

    public Directorio() {
        guiaTelefonica = new HashMap<>();
    }

    public void agregarCliente() {
        long telefono=0;
        Scanner leer = new Scanner(System.in);
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
        
        //investigar clases patter y matcher       CAMBIAR LA CLAVE COMO STRING   O HACER PARCEO
        try{
        telefono = leer.nextLong();
        }catch (Exception ex){
            System.out.println("Error");
        }
        guiaTelefonica.put(telefono, usuario);
        
//        pacientes.put(10, new Paciente("Juan Perez", 35698546, "critico"));
//        pacientes.put(3, new Paciente("Mario Tojas", 34698516, "leve"));
//        pacientes.put(11, new Paciente("Arian Sara", 31600046, "medio"));
//        pacientes.put(1, new Paciente("Jesica Montiveros", 65898546, "critico"));
//        pacientes.put(15, new Paciente("Julieta Ochoa", 31238546, "critico"));
//        pacientes.put(5, new Paciente("Vivi Blasco", 3168946, "leve"));
    }
//
//    public void mostrarPacientes() {
////        //VALORES
////        Collection valores = pacientes.values();
////        Iterator it = valores.iterator();
////        while (it.hasNext()){
////            Paciente p = (Paciente)it.next(); //Castear
////            System.out.println("El paciente es " + p); 
////        }
//////             
////  
////        //CLAVES
////        Set<Integer> claves = pacientes.keySet();
////        Iterator it = claves.iterator();
////        while (it.hasNext()) {
////            Integer clave = (Integer) it.next(); //Castear
////            System.out.println("El paciente es " + pacientes.get(clave));
////        }
//
//        //PAREJAS: recorriendo con entryset
//        for (Map.Entry<Integer, Paciente> parejas : pacientes.entrySet()) {
//            Integer clave = parejas.getKey();
//            Paciente valor = parejas.getValue();
//
//            System.out.println("La clave es " + clave + " el valor es " + valor);
//        }
//    }
//
//    public Paciente buscarCliente(Integer numero) {
//        Paciente p = null;
//        if (pacientes.containsKey(numero)) {
//            p = pacientes.get(numero);
//            System.out.println(p);
//        }
//        return p;
//
//    }
//
//    public void buscarTodos(String tipo) {
//
//        Collection valores = pacientes.values();
//        Iterator it = valores.iterator();
//        while (it.hasNext()) {
//            Paciente p = (Paciente) it.next();
//            if (p.getTipo().equals(tipo)) {
//                System.out.println("PACIENTE CRITICO " + p);
//            }
//        }
//
//    }
//
//    public void borrarPaciente(Integer turno) {
//        if (pacientes.remove(turno) != null) {
//            JOptionPane.showMessageDialog(null, "Exitosamente Borrado");
//        } else {
//            JOptionPane.showMessageDialog(null, "No existe");
//        }
//    }
}
