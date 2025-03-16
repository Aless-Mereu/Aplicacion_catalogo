package negocio;

import javabean.Familia;
import javabean.Producto;
import javabean.Proveedor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la implementacion de la interfaz ICatalogo {@link CatalogoProductosImpl}.
 *Utiliza JUnit5 para realizar las pruebas unitarias sobra las funcionalidades
 * de la clase CatalogoProductosImpl.
 * @author Alessandro Garcia Mereu
 * @date 12-03-2025
 * @version 1.0
 */
class CatalogoProductosImplTest {
    private CatalogoProductosImpl catalogo;

    /**
     * Configuracion inicial ante de cada prueba.
     * Crea una nueva instancia de CatalogoProductoImpl para asegurar que cada prueba sea independiente.
     */


    @BeforeEach
    void setUp() {
        catalogo = new CatalogoProductosImpl(); // Inicializa un nuevo catalogo antes de cada prueba

    }

    /**
     * Prueba el metodo {@code altaProducto()} para verificar que un producto
     * se agrega correcatmente al catalogo.
     */

    @Test
    void altaProducto() {
        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        boolean resultado1 = catalogo.altaProducto(nuevoProducto);
        assertTrue(resultado1, "El resultado deberia haberse agregado correctamente");

        boolean resultado2 = catalogo.altaProducto(nuevoProducto);
        assertFalse(resultado2, "El producto no deberia agregarse de nuevo");
    }

    /**
     * Prueba el metodo {@code eliminaProducto()} para verificar que un producto
     * se ha eliminado correctamente del catalogo
     */


    @Test
    void eliminaProducto() {
        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        boolean resultado1 = catalogo.altaProducto(nuevoProducto);
        assertTrue(resultado1, "El producto no se agrega con exito");

        boolean resultado2 = catalogo.eliminaProducto(1);
        assertTrue(resultado2, "El producto no se ha eliminado");
    }

    /**
     * Prueba el metodo {@code modificaProducto()} para verificar que un producto
     * de la lista se ha modificado
     */


    @Test
    void modificaProducto() {
        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        boolean resultado1 = catalogo.altaProducto(nuevoProducto);
        assertTrue(resultado1, "El producto no se agrega con exito");

        boolean resultado2 = catalogo.modificaProducto(new Producto(1, "Camisa", "Camisa negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("220", "Sprinter", "Informal", "Sprinter@gmail.com", "EU")));

        assertTrue(resultado2, "El producto no se ha modificado");

    }

    /**
     * Prueba el metodo {@code buscarUno()} para verificar que devuelve un producto del
     * catalogo buscandolo por su ID
     */


    @Test
    void buscarUno() {
        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        boolean resultado1 = catalogo.altaProducto(nuevoProducto);
        assertTrue(resultado1, "El producto no se agrega con exito");

       Producto encontrado =  catalogo.buscarUno(1);
       assertNotNull(encontrado, "El producto no se ha encontrado");

    }

    /**
     * Prueba el metodo {@code buscarTodos()} para verificar que dedvuelve una lista
     * con todos los productos del catalogo
     */


    @Test
    void buscarTodos() {
        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        Producto nuevoProducto2 = new Producto(2, "Camisa", "Camisa negra hombre talla M", "Adidas", 40.00,
                new Familia("Textil", 5),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        boolean resultado1 = catalogo.altaProducto(nuevoProducto);
        assertTrue(resultado1, "El resultado deberia haberse agregado correctamente");

        boolean resultado2= catalogo.altaProducto(nuevoProducto2);
        assertTrue(resultado2, "El resultado deberia haberse agregado correctamente");

        List<Producto> productos = catalogo.buscarTodos();
        assertEquals(2, productos.size(), "Los productos no se han encontrado");

    }

    /**
     * Prueba el metodo {@code buscarPorFamilia()} para verificar que devuelve los
     * productos de una lista filtrados por familia
     */



    @Test
    void buscarPorFamilia() {
        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        Producto nuevoProducto2 = new Producto(2, "Camisa", "Camisa negra hombre talla M", "Adidas", 40.00,
                new Familia("Textil", 5),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        Producto nuevoProducto3 = new Producto(3, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        Producto nuevoProducto4 = new Producto(4, "Camisa", "Camisa negra hombre talla M", "Adidas", 40.00,
                new Familia("Textil", 5),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        boolean producto1 = catalogo.altaProducto(nuevoProducto);
        boolean producto2 = catalogo.altaProducto(nuevoProducto2);
        boolean producto3 = catalogo.altaProducto(nuevoProducto3);
        boolean producto4 = catalogo.altaProducto(nuevoProducto4);


        List<Producto>productos = catalogo.buscarPorFamilia(5);
        assertEquals(2, productos.size(), "Los productos no se han encontrado");

        List<Producto>productos2 = catalogo.buscarPorFamilia(30);
        assertEquals(0, productos2.size(), "Los productos no deberian encontrarse");


    }

    /**
     * Prueba el metodo {@code buscarPorPrecio()} que verfica que devuelve los
     * productos del catalogo filtrados por precio
     */



    @Test
    void buscarPorPrecio() {
        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        Producto nuevoProducto2 = new Producto(2, "Camisa", "Camisa negra hombre talla M", "Adidas", 50.00,
                new Familia("Textil", 5),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        Producto nuevoProducto3 = new Producto(3, "Camiseta", "Camiseta negra hombre talla M", "Nike", 23.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        Producto nuevoProducto4 = new Producto(4, "Camisa", "Camisa negra hombre talla M", "Adidas", 40.00,
                new Familia("Textil", 5),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        boolean producto1 = catalogo.altaProducto(nuevoProducto);
        boolean producto2 = catalogo.altaProducto(nuevoProducto2);
        boolean producto3 = catalogo.altaProducto(nuevoProducto3);
        boolean producto4 = catalogo.altaProducto(nuevoProducto4);

        List<Producto>productos = catalogo.buscarPorPrecio(40.00);
        assertEquals(2, productos.size(), "Los productos no se han encontrado");

        List<Producto>productos2 = catalogo.buscarPorPrecio(50.00);
        assertEquals(1, productos2.size(), "Los productos no se han encontrado");

        List<Producto>productos3 = catalogo.buscarPorPrecio(200.00);
        assertTrue(productos3.isEmpty(), "Los productos no derberia encontrarse");

    }

    /**
     * Prueba el metodo {@code buscarPorDescripcion()} que verifica que devuelve los
     * productos filtrados por su descripcion corta.
     */



    @Test
    void buscarPorDescripcion() {
        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        Producto nuevoProducto2 = new Producto(2, "Camisa", "Camisa negra hombre talla M", "Adidas", 50.00,
                new Familia("Textil", 5),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        Producto nuevoProducto3 = new Producto(3, "Camiseta", "Camiseta negra hombre talla M", "Nike", 23.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        Producto nuevoProducto4 = new Producto(4, "Camisa", "Camisa negra hombre talla M", "Adidas", 40.00,
                new Familia("Textil", 5),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        boolean producto1 = catalogo.altaProducto(nuevoProducto);
        boolean producto2 = catalogo.altaProducto(nuevoProducto2);
        boolean producto3 = catalogo.altaProducto(nuevoProducto3);
        boolean producto4 = catalogo.altaProducto(nuevoProducto4);

        List<Producto>productos = catalogo.buscarPorDescripcion("camisa");// daba error, poner en minusculas.
        assertEquals(2, productos.size(), "Los productos no se han encontrado");

        List<Producto>productos2 = catalogo.buscarPorDescripcion("camiseta");
        assertEquals(2, productos2.size(), "Los productos no se han encontrado");

        List<Producto>productos3 = catalogo.buscarPorDescripcion("pantalon");
        assertTrue(productos3.isEmpty(), "La referencia no deberia existir");

    }

    /**
     * Prueba el metodo {@code buscarPorProveedor} que verifica que devuelve los
     * productos filtrados por proveedor.
     */


    @Test
    void buscarPorProveedor() {

        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("100", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        Producto nuevoProducto2 = new Producto(2, "Camisa", "Camisa negra hombre talla M", "Adidas", 50.00,
                new Familia("Textil", 5),
                new Proveedor("100", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        Producto nuevoProducto3 = new Producto(3, "Camiseta", "Camiseta negra hombre talla M", "Nike", 23.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        Producto nuevoProducto4 = new Producto(4, "Camisa", "Camisa negra hombre talla M", "Adidas", 40.00,
                new Familia("Textil", 5),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        boolean producto1 = catalogo.altaProducto(nuevoProducto);
        boolean producto2 = catalogo.altaProducto(nuevoProducto2);
        boolean producto3 = catalogo.altaProducto(nuevoProducto3);
        boolean producto4 = catalogo.altaProducto(nuevoProducto4);

        List<Producto>productos = catalogo.buscarPorProveedor("100");// daba error, poner en minusculas.
        assertEquals(2, productos.size(), "Los productos no se han encontrado");

        List<Producto>productos2 = catalogo.buscarPorProveedor("200");
        assertEquals(2, productos2.size(), "Los productos no se han encontrado");

        List<Producto>productos3 = catalogo.buscarPorProveedor("1000");
        assertTrue(productos3.isEmpty(), "Los productos no se han encontrado");

    }
}