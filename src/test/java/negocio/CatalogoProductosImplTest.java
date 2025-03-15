package negocio;

import javabean.Familia;
import javabean.Producto;
import javabean.Proveedor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la implementacion de la interfaz ICatalogo {@link CatalogoProductosImpl}.
 *Utiliza JUnit5 para realizar las pruebas unnitarias sobra las funcionalidades
 * de la clase CatalogoProductosImpl.
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



    @Test
    void eliminaProducto() {
        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));
        boolean resultado1 = catalogo.altaProducto(nuevoProducto);
        assertTrue(resultado1, "El producto se agrega con exito");

        boolean resultado2 = catalogo.eliminaProducto(1);
        assertTrue(resultado2, "El producto  se ha eliminado");
    }


    @Test
    void modificaProducto() {
        Producto nuevoProducto = new Producto(1, "Camiseta", "Camiseta negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("200", "Sprinter", "Deportiva", "Sprinter@gmail.com", "USA"));

        boolean resultado1 = catalogo.altaProducto(nuevoProducto);
        assertTrue(resultado1, "El producto se agrega con exito");

        boolean resultado2 = catalogo.modificaProducto(new Producto(1, "Camisa", "Camisa negra hombre talla M", "Nike", 40.00,
                new Familia("Textil", 4),
                new Proveedor("220", "Sprinter", "Informal", "Sprinter@gmail.com", "EU")));

        assertTrue(resultado2, "El producto se ha modificado");

    }


    @Test
    void buscarUno() {

    }


    @Test
    void buscarTodos() {

    }



    @Test
    void buscarPorFamilia() {

    }



    @Test
    void buscarPorPrecio() {

    }



    @Test
    void buscarPorDescripcion() {

    }


    @Test
    void buscarPorProveedor() {

    }
}