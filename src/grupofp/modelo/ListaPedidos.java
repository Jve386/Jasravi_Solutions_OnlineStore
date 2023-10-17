package grupofp.modelo;

/**
 * Clase que gestiona una lista de objetos de tipo Pedidos.
 */
public class ListaPedidos extends Lista<Pedidos> {

    /**
     * Agrega un pedido a la lista de pedidos.
     *
     * @param pedido El pedido a agregar.
     */
    public void agregarPedido(Pedidos pedido) {
        agregar(pedido); // Reutiliza el método genérico de la clase base Lista
    }

    /**
     * Elimina un pedido de la lista de pedidos.
     *
     * @param pedido El pedido a eliminar.
     */
    public void eliminarPedido(Pedidos pedido) {
        eliminar(pedido); // Reutiliza el método genérico de la clase base Lista
    }
}
