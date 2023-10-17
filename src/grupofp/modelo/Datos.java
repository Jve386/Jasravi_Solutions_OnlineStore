package grupofp.modelo;

import java.util.ArrayList;

/**
 * Clase que gestiona y almacena datos de la aplicación, incluyendo listas de clientes, artículos y pedidos.
 */
public class Datos {
    private ArrayList<Cliente> cli = new ArrayList<>();
    private ArrayList<Articulo> art = new ArrayList<>();
    private ArrayList<Pedidos> ped = new ArrayList<>();

    /**
     * Constructor de la clase Datos.
     */
    public Datos() {
        // Constructor vacío
    }

    /**
     * Agrega un objeto Cliente a la lista de clientes.
     *
     * @param cliente El objeto Cliente a agregar.
     */
    public void agregarCliente(Cliente cliente) {
        cli.add(cliente);
    }

    /**
     * Agrega un objeto Articulo a la lista de artículos.
     *
     * @param articulo El objeto Articulo a agregar.
     */
    public void agregarArticulo(Articulo articulo) {
        art.add(articulo);
    }

    /**
     * Agrega un objeto Pedidos a la lista de pedidos.
     *
     * @param ped El objeto Pedidos a agregar.
     */
    public void agregarPedido(Pedidos ped) {
        this.ped.add(ped);
    }

    /**
     * Obtiene la lista de clientes.
     *
     * @return La lista de clientes.
     */
    public ArrayList<Cliente> getClientes() {
        return cli;
    }

    /**
     * Obtiene la lista de artículos.
     *
     * @return La lista de artículos.
     */
    public ArrayList<Articulo> getArticulos() {
        return art;
    }

    /**
     * Obtiene la lista de pedidos.
     *
     * @return La lista de pedidos.
     */
    public ArrayList<Pedidos> getPedidos() {
        return ped;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto Datos.
     *
     * @return Representación en cadena del objeto Datos.
     */
    @Override
    public String toString() {
        return "Datos{" +
                "clientes=" + cli +
                ", articulos=" + art +
                ", pedidos=" + ped +
                '}';
    }
}
