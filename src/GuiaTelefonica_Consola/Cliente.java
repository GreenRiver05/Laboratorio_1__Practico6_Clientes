package GuiaTelefonica_Consola;

//              GRUPO 9
//INTEGRANTES : Pablo Nicolas Peñaloza
//              Alex Gustavo Astudillo Duran
//              Gabriel Ezequiel Becerra Diaz

public class Cliente {

    public static final String nada = "\u001B[0m";                      // se utilizo ANSI escape code, color caractares
    public static final String rojo = "\u001B[31m";                     // se utilizo ANSI escape code, color caractares
    public static final String verde = "\u001B[32m";                    // se utilizo ANSI escape code, color caractares
    public static final String amarillo = "\u001B[33m";                 // se utilizo ANSI escape code, color caractares
    public static final String violeta = "\u001B[35m";                  // se utilizo ANSI escape code, color caractares
    
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String ciudad;
    protected String direccion;

    public Cliente(String dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Cliente() { 
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

    public String toString1() {
           return rojo + "\nNombre....... " + nada + nombre + rojo
                + "\nApellido..... " + nada + apellido + rojo
                + "\nCiudad....... " + nada + ciudad + rojo
                + "\nDireccion.... " + nada + direccion + rojo
                + "\nDNI.......... " + nada + dni;
    }
}
