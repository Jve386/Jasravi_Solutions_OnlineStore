package grupofp.modelo;

/**
 * Clase que gestiona una lista de objetos de tipo Cliente.
 */
public class ListaClientes extends Lista<Cliente> {

    /**
     * Agrega un cliente a la lista de clientes.
     *
     * @param cliente El cliente a agregar.
     */
    public void agregarCliente(Cliente cliente) {
        agregar(cliente); // Reutiliza el método genérico de la clase base Lista
    }

    /**
     * Elimina un cliente de la lista de clientes.
     *
     * @param cliente El cliente a eliminar.
     */
    public void eliminarCliente(Cliente cliente) {
        eliminar(cliente); // Reutiliza el método genérico de la clase base Lista
    }
}
