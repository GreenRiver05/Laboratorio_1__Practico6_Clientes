package Practico6_DirectorioTelefonico;

public class Cliente {

    public static final String nada = "\u001B[0m";
    public static final String rojo = "\u001B[31m";
    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String violeta = "\u001B[35m";
    public static final String celeste = "\u001B[36m";
    public static final String negroF = "\u001B[40m";
    String dni;
    String nombre;
    String apellido;
    String ciudad;
    String direccion;

    public Cliente(String dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    public Cliente() {  //eliminamos los constructores ya que no los necesito
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return amarillo + "\nNombre....... " + nada + nombre + amarillo 
                + "\nApellido..... " + nada + apellido + amarillo
                + "\nCiudad....... " + nada + ciudad + amarillo
                + "\nDireccion.... " + nada + direccion + amarillo
                + "\nDNI.......... " + nada + dni;
    }

}
