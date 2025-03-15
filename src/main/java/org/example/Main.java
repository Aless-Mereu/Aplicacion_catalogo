package org.example;

import negocio.CatalogoProductosImpl;
import javabean.Producto;

public class Main {
    public static void main(String[] args) {
        CatalogoProductosImpl catalogo = new CatalogoProductosImpl();

        System.out.println("Lista de productos:");
        for (Producto p : catalogo.buscarTodos()) {
            System.out.println(p);
        }
    }
}

