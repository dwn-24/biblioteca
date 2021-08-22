/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HORUS
 */
public class Libro {
    int CODIGO_LIBRO;
    String TITULO_LIBRO;
    String EDITORIAL_LIBRO;
    int ANIO_ESCRITO;
    int ANIO_EDICION;
    int ISBN;

    public Libro() {
    }

    public Libro(int CODIGO_LIBRO, String TITULO_LIBRO, String EDITORIAL_LIBRO, int ANIO_ESCRITO, int ANIO_EDICION, int ISBN) {
        this.CODIGO_LIBRO = CODIGO_LIBRO;
        this.TITULO_LIBRO = TITULO_LIBRO;
        this.EDITORIAL_LIBRO = EDITORIAL_LIBRO;
        this.ANIO_ESCRITO = ANIO_ESCRITO;
        this.ANIO_EDICION = ANIO_EDICION;
        this.ISBN = ISBN;
    }

    public int getCODIGO_LIBRO() {
        return CODIGO_LIBRO;
    }

    public void setCODIGO_LIBRO(int CODIGO_LIBRO) {
        this.CODIGO_LIBRO = CODIGO_LIBRO;
    }

    public String getTITULO_LIBRO() {
        return TITULO_LIBRO;
    }

    public void setTITULO_LIBRO(String TITULO_LIBRO) {
        this.TITULO_LIBRO = TITULO_LIBRO;
    }

    public String getEDITORIAL_LIBRO() {
        return EDITORIAL_LIBRO;
    }

    public void setEDITORIAL_LIBRO(String EDITORIAL_LIBRO) {
        this.EDITORIAL_LIBRO = EDITORIAL_LIBRO;
    }

    public int getANIO_ESCRITO() {
        return ANIO_ESCRITO;
    }

    public void setANIO_ESCRITO(int ANIO_ESCRITO) {
        this.ANIO_ESCRITO = ANIO_ESCRITO;
    }

    public int getANIO_EDICION() {
        return ANIO_EDICION;
    }

    public void setANIO_EDICION(int ANIO_EDICION) {
        this.ANIO_EDICION = ANIO_EDICION;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    
}
