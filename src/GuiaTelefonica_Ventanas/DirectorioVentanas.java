package GuiaTelefonica_Ventanas;

import GuiaTelefonica_Consola.Cliente;
import java.util.HashMap;
import java.util.Map;

public class DirectorioVentanas {  //se crea esta clase para poder usarla con las ventanas

    private Map<Long, Cliente> guiaTelefonica;

    public DirectorioVentanas() {                    // al crear el mapa, se crean tambien clientes, mas que nada para ya tener
        guiaTelefonica = new HashMap<>();            //una lista y ir probando y no tener que ingresar cada vez que probramos
       
        guiaTelefonica.put(1L, new Cliente("4589125", "Hernesto", "quito", "villa mercedes", "Mitre 2345"));
        guiaTelefonica.put(2L, new Cliente("77898", "Carlota", "quito", "villa mercedes", "Turrado 125"));
        guiaTelefonica.put(3L, new Cliente("4215", "Charles", "chaplin", "san luis", "España 589"));
        guiaTelefonica.put(4L, new Cliente("689825", "Aquiles", "vaesa", "san luis", "Rivadavia 1158"));
        guiaTelefonica.put(5L, new Cliente("4554899", "Hernesto", "vaesa", "villa mercedes", "Perdernera 555"));
        guiaTelefonica.put(6L, new Cliente("896689", "Esteban", "quito", "justo darac", "San Lorenzo 115"));
      
    }

    public boolean agregarCliente(Long telefono, Cliente usuario) {
        boolean existe = true;
        if (!guiaTelefonica.containsKey(telefono)) {
            guiaTelefonica.put(telefono, usuario);
            existe = false;
        }
        return existe;
    }

    public Cliente buscarCliente(Long telefono) {
        Cliente p = null;
        if (guiaTelefonica.containsKey(telefono)) {
            p = guiaTelefonica.get(telefono);
        }

        return p;
    }

    public Map<Long, Cliente> buscarTelefono(String apellido) {

        Map<Long, Cliente> clientesApellidos = null;

        for (Map.Entry<Long, Cliente> c : guiaTelefonica.entrySet()) {

            if (c.getValue().getApellido().equals(apellido)) {

                clientesApellidos.put(c.getKey(), c.getValue());
            }
        }

        return clientesApellidos;

    }

    public Map<Long, Cliente> buscarClientes(String ciudad) {

        Map<Long, Cliente> clientesCiudad = null;

        for (Map.Entry<Long, Cliente> c : guiaTelefonica.entrySet()) {

            if (c.getValue().getCiudad().equals(ciudad)) {

                clientesCiudad.put(c.getKey(), c.getValue());

            }
        }
        return clientesCiudad;

    }

    public boolean borrarCliente(Long telefono) {

        boolean eliminado = false;

        if (guiaTelefonica.containsKey(telefono)) {

            guiaTelefonica.remove(telefono);
            eliminado = true;
        }
        return eliminado;

    }
}
