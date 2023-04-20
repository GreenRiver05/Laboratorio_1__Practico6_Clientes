
package atencionpacientes;

public class Paciente {
     String nombre;
     int dni;
     String tipo;

    public Paciente(String nombre, int dni, String tipo) {
        this.nombre = nombre;
        this.dni = dni;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", dni=" + dni + ", tipo=" + tipo + '}';
    }

   
     
     
}
