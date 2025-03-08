package negocio;

import javabean.Producto;

import java.util.List;

public interface Icatalogo {
    public boolean altaProducto (Producto producto);
    public boolean eliminaProducto (long idProducto);
    public boolean modificaProducto (Producto producto);
    public Producto buscarUno(long idProducto);
    List<Producto> buscarTodos();
    List<Producto> buscarPorFamilia(int idFamilia);
    List<Producto> buscarPorPrecio(double precio);
    List<Producto> buscarPorDescripcion(String subcadena);
    List<Producto> buscarPorProveedor(String cif);
}
