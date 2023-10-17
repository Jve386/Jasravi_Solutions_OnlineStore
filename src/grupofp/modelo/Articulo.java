package grupofp.modelo;

import java.time.LocalDate;

/**
 * Clase que representa un artículo con sus atributos.
 */
public class Articulo {
    private String codigo;
    private String descripcion;
    private Double precio;
    private Double gastosEnvio;
    private LocalDate preparacionEnvio;

    /**
     * Constructor de la clase Articulo.
     *
     * @param codigo           El código del artículo.
     * @param descripcion      La descripción del artículo.
     * @param precio           El precio del artículo.
     * @param gastosEnvio      Los gastos de envío del artículo.
     * @param preparacionEnvio La fecha de preparación del envío del artículo.
     */
    public Articulo(String codigo, String descripcion, Double precio, Double gastosEnvio, LocalDate preparacionEnvio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.gastosEnvio = gastosEnvio;
        this.preparacionEnvio = preparacionEnvio;
    }

    /**
     * Obtiene el código del artículo.
     *
     * @return El código del artículo.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtiene la descripción del artículo.
     *
     * @return La descripción del artículo.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene el precio del artículo.
     *
     * @return El precio del artículo.
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * Obtiene los gastos de envío del artículo.
     *
     * @return Los gastos de envío del artículo.
     */
    public Double getGastosEnvio() {
        return gastosEnvio;
    }

    /**
     * Obtiene la fecha de preparación del envío del artículo.
     *
     * @return La fecha de preparación del envío del artículo.
     */
    public LocalDate getPreparacionEnvio() {
        return preparacionEnvio;
    }

    /**
     * Establece el código del artículo.
     *
     * @param codigo El código del artículo.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Establece la descripción del artículo.
     *
     * @param descripcion La descripción del artículo.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Establece el precio del artículo.
     *
     * @param precio El precio del artículo.
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * Establece los gastos de envío del artículo.
     *
     * @param gastosEnvio Los gastos de envío del artículo.
     */
    public void setGastosEnvio(Double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    /**
     * Establece la fecha de preparación del envío del artículo.
     *
     * @param preparacionEnvio La fecha de preparación del envío del artículo.
     */
    public void setPreparacionEnvio(LocalDate preparacionEnvio) {
        this.preparacionEnvio = preparacionEnvio;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto Articulo.
     *
     * @return Representación en cadena del objeto Articulo.
     */
    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", gastosEnvio=" + gastosEnvio +
                ", preparacionEnvio=" + preparacionEnvio +
                '}';
    }
}
