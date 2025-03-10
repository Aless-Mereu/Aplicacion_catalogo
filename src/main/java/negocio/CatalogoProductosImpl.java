package negocio;

import javabean.Familia;
import javabean.Producto;
import javabean.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class CatalogoProductosImpl implements Icatalogo {
    private ArrayList<Producto> lista;

    public CatalogoProductosImpl() {
        lista =new ArrayList<Producto>();
        cargarDatos();
    }
    private void cargarDatos() {
        Familia familia = new Familia("Bebidas",1);
        Proveedor proveedor = new Proveedor("100","Bodegas Ruiz","bebidas","Ruiz@gmail.com","Spain");

        lista.add(new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike",  40.00, familia , proveedor));
        lista.add(new Producto(2, "Pantalón", "Pantalón de Hombre negro", "Levi's", 60.00,familia , proveedor));
        lista.add(new Producto(3, "Zapatillas", "Zapatillas deportivas de Mujer talla 37", "Adidas", 80.00,familia , proveedor));
        lista.add(new Producto(4, "Sudadera", "Sudadera con capucha de mujer", "Puma", 55.00,familia , proveedor));
        lista.add(new Producto(5, "Chaqueta", "Chaqueta de cuero de mujer talla M", "Zara", 120.00, familia , proveedor));

    }


    /**
     * Agrega un nuevo producto al catalogo.
     *
     * @param producto
     */
    @Override
    public boolean altaProducto(Producto producto) {
        return false;
    }

    /**
     * Elimina un producto del catalogo.
     *
     * @param idProducto
     */
    @Override
    public boolean eliminaProducto(long idProducto) {
        return false;
    }

    /**
     * Modifica un producto existente
     *
     * @param producto
     */
    @Override
    public boolean modificaProducto(Producto producto) {
        return false;
    }

    /**
     * Busca un producto por su identificador
     *
     * @param idProducto
     */
    @Override
    public Producto buscarUno(long idProducto) {
        return null;
    }

    /**
     * Hace una lista con todos los productos.
     */
    @Override
    public List<Producto> buscarTodos() {
        return List.of();
    }

    /**
     * Busca productos por familia
     *
     * @param idFamilia
     */
    @Override
    public List<Producto> buscarPorFamilia(int idFamilia) {
        return List.of();
    }

    /**
     * Busca productos por precio
     *
     * @param precio
     */
    @Override
    public List<Producto> buscarPorPrecio(double precio) {
        return List.of();
    }

    /**
     * Busca productos por su descripcion
     *
     * @param subcadena
     */
    @Override
    public List<Producto> buscarPorDescripcion(String subcadena) {
        return List.of();
    }

    /**
     * Busca productos por su proveedor.
     *
     * @param cif
     */
    @Override
    public List<Producto> buscarPorProveedor(String cif) {
        return List.of();
    }
}
