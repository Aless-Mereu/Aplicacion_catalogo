package negocio;

import javabean.Familia;
import javabean.Producto;

import java.util.ArrayList;

public class CatalogoProductosImpl {
    private ArrayList<Producto> lista;

    public CatalogoProductosImpl() {
        lista =new ArrayList<Producto>();
        cargarDatos();
    }
    private void cargarDatos() {
        Familia familia = new Familia();
    }
}
