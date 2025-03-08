package javabean;

public class Familia {

    private int idFamilia;
    private String descripcion;

    public Familia() {
    }

    public Familia(String descripcion, int idFamilia) {
        this.descripcion = descripcion;
        this.idFamilia = idFamilia;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}


