package javabean;

import java.util.Objects;

/**
 * Representa un producto con informacion detallada
 * <p>
 *
 *       Cada producto tiene un identificador unico y una descripcion corta y otra larga
 *       que permite su identificacion y categorizacion.
 *       Esta clase sigue el patron Javabean y proporciona metodos para acceder y modificar sus atributos.
 * </p>
 *
 * @author Alessandro Garcia
 * @data 09-03-2025
 * @version 1.0
 */

/**
 * Descripcion de los atributos en el Constructor
 */

public class Producto {
    private long idProducto;
    private String descripcionCorta;
    private String descripcionLarga;
    private String marca;
    private double precio;
    private Familia familia;
    private Proveedor proveedor;

    /**
     * Constructor con todos los atributos de la clase Producto.
     *
     * @param idProducto        Identificador unico del producto
     * @param descripcionCorta  Breve descripcion del producto.
     * @param descripcionLarga  Descripcion detallada del producto
     * @param marca             Marca del producto
     * @param precio            Precio del producto
     * @param familia           Familia a la que pertenece el producto
     * @param proveedor         proveedor del producto
     */
    public Producto(long idProducto, String descripcionCorta, String descripcionLarga, String marca, double precio, Familia familia, Proveedor proveedor) {
        this.idProducto = idProducto;
        this.descripcionCorta = descripcionCorta;
        this.descripcionLarga = descripcionLarga;
        this.marca = marca;
        this.precio = precio;
        this.familia = familia;
        this.proveedor = proveedor;
    }

    /**
     * Constructor por defecto que permite la creacion de instancias sin inicializar atributos
     */

    public Producto() {
    }

    /**
     * Obtiene el identificador del producto.
     * @return ID del producto
     */

    public long getIdProducto() {
        return idProducto;
    }

    /**
     * Establece el identificador unico del producto
     * @param idProducto nuevo ID del producto
     */

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Obtiene la descripcion corta del producto
     * @return DescripcionCorta corta del producto
     */

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    /**
     * Establece la descripcion corta del producto.
     * @param descripcionCorta Nueva descripcion corta del producto
     */

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    /**
     * Obtiene la descripcion larga del producto
     * @return descripcion larga del producto.
     */

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    /**
     * Establece la descripcion larga del producto
     * @param descripcionLarga Nueva descripcion larga del producto
     */

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    /**
     * Obtiene la marca del producto
     * @return Marca del producto
     */

    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del producto
     * @param marca Nueva marca del producto
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el precio del producto
     * @return Precio del producto
     */

    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto
     * @param precio Nuevo precio del producto
     */

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio del producto
     * @return Precio del producto
     */

    public Familia getFamilia() {
        return familia;
    }

    /**
     * Establece la familia del producto
     * @param familia Nueva familia del producto
     */

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    /**
     * Obtiene el proveedor del producto
     * @return Proveedor del producto
     */

    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Establece un nuevo proveedor del producto
     * @param proveedor Nuevo proveedor del producto
     */

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * Devuelve una representacion en forma de cadena del objeto Producto.
     * @return Cadena que representa el producto con sus atributos
     */

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", descripcionCorta='" + descripcionCorta + '\'' +
                ", descripcionLarga='" + descripcionLarga + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", familia=" + familia +
                ", proveedor=" + proveedor +
                '}';
    }

    /**
     * Compra si dos objetos son iguales basandose en su identificador unico.
     * @param o Objeto a comparar
     * @return {@code true} si los objetos son iguales, {@code false} en caso contrario.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Si es el mismo objeto en memoria, retorna true
        if (o == null || getClass() != o.getClass()) return false; // Compara la clase exacta
        Producto producto = (Producto) o;
        return idProducto == producto.idProducto;
    }

    /**
     * Calcula el codigo hash del producto basandose en su identificador unico.
     * @return Codigo hash del producto
     */


    @Override
    public int hashCode() {
        return Long.hashCode(idProducto);
    }
}
