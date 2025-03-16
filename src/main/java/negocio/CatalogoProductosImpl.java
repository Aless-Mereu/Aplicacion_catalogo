package negocio;

import javabean.Familia;
import javabean.Producto;
import javabean.Proveedor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementacion de la interfaz ICatalogo que gestiona un catalogo de productos.
 * Se utiliza un ArrayList para almacenar los productos disponibles.
 * @author Alessandro Garcia Mereu
 * @date 11-03-2025
 * @version 1.0
 */

public class CatalogoProductosImpl implements Icatalogo {
    private ArrayList<Producto> lista;

    /**
     * Constructor que inicializa la lista de productos y carga los datos iniciales.
     */

    public CatalogoProductosImpl() {
        lista = new ArrayList<>();
        cargarDatos();
        lista.clear(); /*Limpiando lista para que no influya en los test*/
    }

    /**
     * Metodo que carga una lista inicial de productos con datos de ejemplo
     */
    private void cargarDatos() {
        Familia familia = new Familia("Normal", 1);
        Familia familia2 = new Familia("Lujo", 2);
        Familia familia3 = new Familia("Superlujo", 3);
        Proveedor proveedor = new Proveedor("100", "Amparo Larrañaga", "Textil", "Amparo@gmail.com", "Spain");

        lista.add(new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00, familia, proveedor));
        lista.add(new Producto(2, "Pantalón", "Pantalón de Hombre negro", "Levi's", 60.00, familia3, proveedor));
        lista.add(new Producto(3, "Zapatillas", "Zapatillas deportivas de Mujer talla 37", "Adidas", 80.00, familia, proveedor));
        lista.add(new Producto(4, "Sudadera", "Sudadera con capucha de mujer", "Puma", 55.00, familia2, proveedor));
        lista.add(new Producto(5, "Chaqueta", "Chaqueta de cuero de mujer talla M", "Zara", 120.00, familia3, proveedor));
    }


    /**
     * Agrega un nuevo producto al catalogo si no existe previamente.
     * @param producto producto a agregar.
     * @return true si el producto se agrego correctamente, false si ya existia.
     */
    @Override
    public boolean altaProducto(Producto producto) {
        if (lista.contains(producto)) {
            return false;
        }
        System.out.println("Producto aniadido con exito" + producto);
        lista.add(producto);
        return true;

    }

    /**
     * Elimina un producto del catalogo por su ID.
     * @param idProducto Identificador del producto a eliminar
     * @return true si el producto se elimino correctamente, false si no se encontro.
     */
    @Override
    public boolean eliminaProducto(long idProducto) {
        return lista.removeIf(producto -> producto.getIdProducto() == idProducto);
        /*Expresion Lambda, equivale a un for tradicional.
        * for (int = 0; i<lista.size(); i++){
        *   if(lista.get(i).getIdProducto() == idProducto){
        *       lista.remove(i);
        *        return true;
        * }
        * return false    */
    }

    /**
     * Modifica un producto existente en el catalogo
     * @param producto producto con los datos actualizados.
     * @return true si el producto existe en la lista, false en caso contrario.
     */
    @Override
    public boolean modificaProducto(Producto producto) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdProducto() == producto.getIdProducto()) {
                lista.set(i, producto);
                return true;
            }
        }
        return false;

    }

    /**
     * Busca un producto por su identificador.
     * @param idProducto Identificador del producto a buscar
     * @return El producto si se encuentra, null en caso contrario.
     */
    @Override
    public Producto buscarUno(long idProducto) {
        for (Producto producto : lista) {
            if (producto.getIdProducto() == idProducto) {
                return producto;
            }
        }
         return null;
    }

    /**
     * Obtiene una lista con todos los productos del catalogo.
     * @return Lista de productos
     */
    @Override
    public List<Producto> buscarTodos() {
        return lista;
    }

    /**
     * Busca productos por familia.
     * @param idFamilia Identificador de la familia.
     * @return Lista de productos que pertenecen a una familia especificada.
     */
    @Override

    public List<Producto> buscarPorFamilia(int idFamilia) {
        List<Producto> aux = new ArrayList<>();
        for (Producto producto : lista) {
            if (producto.getFamilia().getIdFamilia() == idFamilia) {
                aux.add(producto);
            }
        }
        return aux;
    }

    /**
     * Busca productos por su precio.
     * @param precio Precio de referencia.
     * @return Lista de productos que tienen el precio especificado.
     */
    @Override
    public List<Producto> buscarPorPrecio(double precio) {
        List<Producto> aux = new ArrayList<>();
        for (Producto producto : lista) {
            if (producto.getPrecio() == precio) {
                aux.add(producto);
            }
        }
        return aux;
    }

    /**
     * Busca productos que contengan una subcadena en su descripcion.
     * @param subcadena Texto a buscar dentro de la descripcion.
     * @return Lista de productos cuya descripcion contiene la subcadena especificada
     */
    @Override
    public List<Producto> buscarPorDescripcion(String subcadena) {
        List<Producto> aux = new ArrayList<>();
        for (Producto producto : lista) {
            if (producto.getDescripcionCorta().toLowerCase().contains(subcadena)) {
                aux.add(producto);
            }
        }
        return aux;
    }

    /**
     * Busca productos por el CIF del proveedor.
     * @param cif CIF del proveedor.
     * @return Lista de productos suministrados por el proveedor con el CIF especificado.
     */
    @Override
    public List<Producto> buscarPorProveedor(String cif) {
        List<Producto> aux = new ArrayList<>();
        for (Producto producto : lista) {
            if (producto.getProveedor().getCif().equals(cif)) {
                aux.add(producto);
            }
        }
        return aux;
    }

}