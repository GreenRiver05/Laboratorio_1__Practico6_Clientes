package Practico6_DirectorioTelefonico;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

public class Directorio {   //cambiamos el nombre de la clase

    private Map<String, Cliente> guiaTelefonica;   //cambiamos el nombre del mapa

    public Directorio() {
        guiaTelefonica = new HashMap<>();
    }

    public void agregarCliente() {
        String telefono;
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
       // try{
        telefono = leer.next();
      //  }catch (Exception ex){
      //      System.out.println("Error");
      //  }
        guiaTelefonica.put(telefono, usuario);
        

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
////
    public Cliente buscarCliente(String telefono){
        Cliente p = null;
        if (guiaTelefonica.containsKey(telefono)) {
            p = guiaTelefonica.get(telefono);
            System.out.println(p);
        }
        return p;

    }

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
