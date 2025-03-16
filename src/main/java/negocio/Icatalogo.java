package negocio;

import javabean.Producto;

import java.util.List;

/**
 * Interfaz para la gestion de un catalogo de productos
 * @author Alessandro Garcia Mereu
 * @date 10-03-2025
 * @version 1.0
 */

public interface Icatalogo {
    /**
     * Agrega un nuevo producto al catalogo.
     */
    public boolean altaProducto (Producto producto);

    /**
     * Elimina un producto del catalogo.
     */
    public boolean eliminaProducto (long idProducto);

    /**
     * Modifica un producto existente
     */
    public boolean modificaProducto (Producto producto);

    /**
     * Busca un producto por su identificador
     */
    public Producto buscarUno(long idProducto);

    /**
     * Hace una lista con todos los productos.
     */
    List<Producto> buscarTodos();

    /**
     * Busca productos por familia
     */
    List<Producto> buscarPorFamilia(int idFamilia);

    /**
     * Busca productos por precio
     */
    List<Producto> buscarPorPrecio(double precio);

    /**
     * Busca productos por su descripcion
     */
    List<Producto> buscarPorDescripcion(String subcadena);

    /**
     * Busca productos por su proveedor.
     */
    List<Producto> buscarPorProveedor(String cif);
}
