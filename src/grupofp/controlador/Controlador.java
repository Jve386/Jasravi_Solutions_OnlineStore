package grupofp.controlador;

import grupofp.modelo.*;

/**
 * Clase que actúa como intermediario entre la vista y los datos del modelo.
 */
public class Controlador {
    private Datos datos;

    /**
     * Constructor de la clase Controlador que inicializa la instancia de Datos.
     */
    public Controlador() {
        datos = new Datos();
    }

    // Métodos para interactuar con los datos del modelo

    /**
     * Agrega un cliente al modelo.
     *
     * @param cliente El cliente a agregar.
     */
    public void agregarCliente(Cliente cliente) {
        datos.agregarCliente(cliente);
    }

    /**
     * Elimina un cliente del modelo.
     *
     * @param cliente El cliente a eliminar.
     */
    public void eliminarCliente(Cliente cliente) {
        datos.getClientes().remove(cliente);
    }

    /**
     * Agrega un artículo al modelo.
     *
     * @param articulo El artículo a agregar.
     */
    public void agregarArticulo(Articulo articulo) {
        datos.agregarArticulo(articulo);
    }

    /**
     * Elimina un artículo del modelo.
     *
     * @param articulo El artículo a eliminar.
     */
    public void eliminarArticulo(Articulo articulo) {
        datos.getArticulos().remove(articulo);
    }

    /**
     * Agrega un pedido al modelo.
     *
     * @param pedido El pedido a agregar.
     */
    public void agregarPedido(Pedidos pedido) {
        datos.agregarPedido(pedido);
    }

    /**
     * Elimina un pedido del modelo.
     *
     * @param pedido El pedido a eliminar.
     */
    public void eliminarPedido(Pedidos pedido) {
        datos.getPedidos().remove(pedido);
    }

    // Otros métodos y lógica de negocio

    /**
     * Obtiene la instancia de Datos utilizada por el controlador.
     *
     * @return La instancia de Datos.
     */
    public Datos getDatos() {
        return datos;
    }
}
