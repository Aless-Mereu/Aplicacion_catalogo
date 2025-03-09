package javabean;

/**
 * Representa una familia dentro de un sistema de clasificacion.
 * <p>
 *     Cada familia tiene un identificador unico y una descripcion
 *     que permite su identificacion y categorizacion.
 * </p>
 * @author Alessandro García
 * @data 08-03-2025
 * @version 1.0
 */
public class Familia {
    /**
     * Identificador unico de la clase familia
     */
    private int idFamilia;
    /**
     * Descripcion de la familia
     */
    private String descripcion;

    /**
     * Contructor por defecto. Crea una instancia de {@code Famila} sin inicializar atributos
     */
    public Familia() {
    }

    /**
     * Constructor con parametros para inicializar una familia
     * @param idFamilia Identificador unico de la familia
     * @param descripcion Descripcion de la familia
     */
    public Familia(String descripcion, int idFamilia) {
        this.descripcion = descripcion;
        this.idFamilia = idFamilia;
    }

    /**
     * Obtiene el identificador unico de la familia
     * @return El identificador unico de la familia
     */
    public int getIdFamilia() {
        return idFamilia;
    }

    /**
     * Obtiene la descripcion de la familia
     * @return La descripcion de la familia
     */

    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece un nuevo identificador para la familia
     * @param idFamilia El nuevo identificador unico de la famila
     */
    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    /**
     * Establece una nueva descripcion para la familia
     * @param descripcion La nueva descripcion de la familia
     */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Genera un codigo hash basado en el identificador de la familia
     * @return Un valor hash representando el objeto
     */
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Compara este objeto con otro para determinar si son iguales.
     * <p>
     *     Dos objetos de tipo {@code Familia} son iguales si tienen el mismo
     *     identificador unico {code idFamilia}.
     * </p>
     *
     * @param o Objeto a comparar con la instancia actual
     * @return {@code true} si los objetos son iguales, {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Si es el mismo objeto en memoria, retorna true
        if (o == null || getClass() != o.getClass()) return false; // Compara la clase exacta
        Familia familia = (Familia) o;
        return idFamilia == familia.idFamilia;
    }


    /**
     * Devuelve una representacion en cadena del objeto {@code Familia}
     * @return Una cadena con el formato "Familia(idFamilia=x, descripcion='y'}.
     */
    @Override
    public String toString() {
        return super.toString();
    }

}


