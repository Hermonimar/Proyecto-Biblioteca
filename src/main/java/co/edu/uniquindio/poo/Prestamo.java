package main.java.co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {

    private String codigo;
    private String fechaPrestamo, fechaEntrega;
    private double total;
    private Bibliotecario bibliotecario;
    private Estudiante estudiante;
    private Collection<DetallePrestamo> detallePrestamos;

    public Prestamo(String codigo, String fechaPrestamo, String fechaEntrega, Bibliotecario bibliotecario,
            Estudiante estudiante) {
        this.codigo = codigo;
        this.fechaEntrega = fechaEntrega;
        this.fechaPrestamo = fechaPrestamo;
        detallePrestamos = new LinkedList<>();
        this.total = calcularTotal();
    }


    /*
     * Metodo para calcular total
     * return total
     */
    public double calcularTotal() {
        double total = 5000;
        for (DetallePrestamo detallePrestamo : detallePrestamos) {
            total += detallePrestamo.getSubTotal();
        }
        return total;
    }

    /*
     * Metodo para obtener codigo
     * return codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /*
     * Metodo para modificar codigo
     * return codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /*
     * Metodo para obtener prestamo
     * return codigo
     */

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    /*
     * Metodo para modificar prestamo
     * return codigo
     */
    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /*
     * Metodo para obtener fecha de entrega
     * return codigo
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /*
     * Metodo para modificar fecha de entrega
     * return codigo
     */

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

     /*
     * Metodo para obtener total
     * return codigo
     */

    public double getTotal() {
        return total;
    }

    /*
     * Metodo para modificar total
     * return codigo
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /*
     * Metodo para obtener bibliotecario
     * return codigo
     */
    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    /*
     * Metodo para modificar bibliotecario
     * return codigo
     */
    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    /*
     * Metodo para obtener estudiante
     * return codigo
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /*
     * Metodo para modificar estudiante
     * return codigo
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /*
     * Metodo para obtener detalle prestamos
     * return codigo
     */
    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    /*
     * Metodo para modificar detalle prestamos
     * return codigo
     */
    public void setDetallePrestamos(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }


    @Override
    public String toString() {
        return "Prestamo [codigo=" + codigo + ", fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega
                + ", total=" + total + ", bibliotecario=" + bibliotecario + ", estudiante=" + estudiante
                + ", detallePrestamos=" + detallePrestamos + "]";
    }

    

}
