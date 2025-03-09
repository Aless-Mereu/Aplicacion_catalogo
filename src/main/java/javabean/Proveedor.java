package javabean;

/**
 * Representa a un proveedor con informacion detallada, como cif, nombre, actividad, etc.
 *  <p>
 *
 *        Cada proveedor tiene un identificador unico y un nombre, actividad que realiza...
 *        que permite su identificacion y categorizacion.
 *        Esta clase sigue el patron Javabean y proporciona metodos para acceder y modificar sus atributos.
 *  * </p>
 *  *
 *  * @author Alessandro Garcia
 *  * @data 09-03-2025
 *  * @version 1.0
 */
public class Proveedor {

    private String cif;
    private String nombre;
    private String actividad;
    private String email;
    private String pais;

    /**
     * Contructor con todos los atributos de la clase Proveedor.
     * @param cif       identificador unico del proveedor
     * @param nombre    Nombre del proveedor
     * @param actividad Tipo de actividad que realiza el proveedor
     * @param email     Correo electronico del proveedor
     * @param pais      Pais de actividad del proveedor
     */

    public Proveedor(String cif, String nombre, String actividad, String email, String pais) {
        this.cif = cif;
        this.nombre = nombre;
        this.actividad = actividad;
        this.email = email;
        this.pais = pais;
    }

    /**
     * Constructor por defecto que permite la creacion de instancias sin inicializar atributos.
     */
    public Proveedor() {
    }

    /**
     * Obtiene el cif del proveedor
     * @return cif del proveedor
     */

    public String getCif() {
        return cif;
    }

    /**
     * Establece un nuevo cif de proveedor
     * @param cif Nuevo cif de proveedor
     */

    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * Obtiene el nombre del proveedor
     * @return nombre del proveedor
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del proveedor
     * @param nombre Nuevo nombre de  proveedor
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo de actividad del proveedor
     * @return actividad del proveedor
     */

    public String getActividad() {
        return actividad;
    }

    /**
     * Establece la actividad del proveedor
     * @param actividad Nueva actividad del proveedor
     */

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    /**
     * Obtiene el email del proveedor
     * @return email del proveedor
     */

    public String getEmail() {
        return email;
    }

    /**
     * Establece el email del proveedor
     * @param email Nuevo mail de proveedor
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el pais del proveedor
     * @return pais del proveedor
     */

    public String getPais() {
        return pais;
    }

    /**
     *Establece el pais del proveedor
     * @param pais Nuevo pais del proveedor
     */

    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Devuelve una representacion en forma de cadena del objeto Proveedor.
     * @return cadena que representa un proveedor con sus atributos.
     */
    @Override
    public String toString() {
        return "Proveedor{" +
                "cif='" + cif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", actividad='" + actividad + '\'' +
                ", email='" + email + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

}

