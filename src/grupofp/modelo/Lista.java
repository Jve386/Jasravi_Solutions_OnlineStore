package grupofp.modelo;

import java.util.ArrayList;

/**
 * Clase genérica para gestionar una lista de elementos de tipo T.
 *
 * @param <T> El tipo de elemento que se gestionará en la lista.
 */
public class Lista<T> {
    protected ArrayList<T> lista;

    /**
     * Constructor de la clase Lista que inicializa la lista vacía.
     */
    public Lista() {
        lista = new ArrayList<>();
    }

    /**
     * Agrega un elemento a la lista.
     *
     * @param elemento El elemento a agregar a la lista.
     */
    public void agregar(T elemento) {
        lista.add(elemento);
    }

    /**
     * Elimina un elemento de la lista.
     *
     * @param elemento El elemento a eliminar de la lista.
     */
    public void eliminar(T elemento) {
        lista.remove(elemento);
    }

    /**
     * Obtiene todos los elementos de la lista.
     *
     * @return Una lista que contiene todos los elementos.
     */
    public ArrayList<T> obtenerTodos() {
        return lista;
    }
}
