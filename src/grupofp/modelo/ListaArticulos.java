package grupofp.modelo;

/**
 * Clase que gestiona una lista de objetos de tipo Articulo.
 */
public class ListaArticulos extends Lista<Articulo> {

    /**
     * Agrega un artículo a la lista de artículos.
     *
     * @param articulo El artículo a agregar.
     */
    public void agregarArticulo(Articulo articulo) {
        agregar(articulo); // Reutiliza el método genérico de la clase base Lista
    }

    /**
     * Elimina un artículo de la lista de artículos.
     *
     * @param articulo El artículo a eliminar.
     */
    public void eliminarArticulo(Articulo articulo) {
        eliminar(articulo); // Reutiliza el método genérico de la clase base Lista
    }
}
