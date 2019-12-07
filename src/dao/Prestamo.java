/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Administrador
 */
public class Prestamo {
    
    private int idprestamo;
    private int idAlumno;
    private int idLibro;
    private String fech_Prestamo;
    private String fech_Devolucion;

    public int getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(int idprestamo) {
        this.idprestamo = idprestamo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getFech_Prestamo() {
        return fech_Prestamo;
    }

    public void setFech_Prestamo(String fech_Prestamo) {
        this.fech_Prestamo = fech_Prestamo;
    }

    public String getFech_Devolucion() {
        return fech_Devolucion;
    }

    public void setFech_Devolucion(String fech_Devolucion) {
        this.fech_Devolucion = fech_Devolucion;
    }

    public Prestamo() {
    }
    
    
}
