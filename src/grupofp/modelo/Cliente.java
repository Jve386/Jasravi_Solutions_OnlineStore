package grupofp.modelo;


/**
 * Clase abstracta que representa a un cliente.
 */
public abstract class Cliente {
    private int codigoCliente;
    private String nombre;
    private String nif;
    private String domicilio;
    private String email;
    private boolean premium;

    /**
     * Constructor de la clase Cliente.
     *
     * @param codigoCliente El código del cliente.
     * @param nombre El nombre del cliente.
     * @param nif El número de identificación fiscal del cliente.
     * @param domicilio El domicilio del cliente.
     * @param email La dirección de correo electrónico del cliente.
     * @param premium Indica si el cliente es premium o no.
     */
    public Cliente(int codigoCliente, String nombre, String nif, String domicilio, String email, boolean premium) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.nif = nif;
        this.domicilio = domicilio;
        this.email = email;
        this.premium = premium;
    }

    /**
     * Obtiene el código del cliente.
     *
     * @return El código del cliente.
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Establece el código del cliente.
     *
     * @param codigoCliente El código del cliente.
     */
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de identificación fiscal del cliente.
     *
     * @return El número de identificación fiscal del cliente.
     */
    public String getNif() {
        return nif;
    }

    /**
     * Establece el número de identificación fiscal del cliente.
     *
     * @param nif El número de identificación fiscal del cliente.
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Obtiene el domicilio del cliente.
     *
     * @return El domicilio del cliente.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Establece el domicilio del cliente.
     *
     * @param domicilio El domicilio del cliente.
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene la dirección de correo electrónico del cliente.
     *
     * @return La dirección de correo electrónico del cliente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece la dirección de correo electrónico del cliente.
     *
     * @param email La dirección de correo electrónico del cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Comprueba si el cliente es premium.
     *
     * @return true si el cliente es premium, false en caso contrario.
     */
    public boolean isPremium() {
        return premium;
    }

    /**
     * Establece si el cliente es premium o no.
     *
     * @param premium true si el cliente es premium, false en caso contrario.
     */
    public void setPremium(boolean premium) {
        this.premium = premium;
    }
/**
    /**
     * Devuelve una representación en forma de cadena del objeto Cliente.
     *
     * @return Representación en cadena del objeto Cliente.
     */

// PENDIENTE REVISIÓN GRUPO. Posiblemente pasar como herencia.
    /**
     * Obtiene el precio con descuento aplicado en función del estado premium.
     *
     * @param precioOriginal El precio original del producto.
     * @return El precio con el descuento aplicado.
     */
    public double getPrecioConDescuento(double precioOriginal) {
        if (premium) {
            // Si es premium, se aplica un 15% de descuento
            return precioOriginal * 0.85; // 85% del precio original
        } else {
            // Si no es premium, no se aplica descuento
            return precioOriginal;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigoCliente=" + codigoCliente +
                ", nombre='" + nombre + '\'' +
                ", nif='" + nif + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", email='" + email + '\'' +
                ", premium=" + premium +
                '}';
    }
}
