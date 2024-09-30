package main.java.co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;
import java.util.LinkedList;

public class DetallePrestamo {

    private int cantidad;
    private Prestamo prestamo;
    private Libro libro;
    private double subTotal;
    private Collection<DetallePrestamo> detallePrestamos;
    private Collection<Libro> libros;
    
    public DetallePrestamo(int cantidad, Prestamo prestamo, Libro libro){
        this.cantidad=cantidad;
        this.prestamo=prestamo;
        this.libro=libro;
        this.subTotal=calcularSubtotal(null, null);
        detallePrestamos = new LinkedList<>();
    }



    /*
     * Metodo para calcular SubTotal
     */

    public double calcularSubtotal(LocalDate fechaPrestamo, LocalDate fechaEntrega) {
        double subtotal = 5000;
    
        if (detallePrestamos != null) {
            for (DetallePrestamo detallePrestamo : detallePrestamos) {
                if (detallePrestamo != null) {
                    int cantidad = detallePrestamo.getCantidad();
                    double valorUnidad = entregaPrestamo(libro.getCodigo(), fechaPrestamo, fechaEntrega); 
                    subtotal += cantidad * valorUnidad;
                }
            }
        }
        
        return subtotal;
    }
    
    /*
    * Metodo que permite calcular el valor del prestamo de cada libro, estado y unidades disponibles
    * return valorPrestamo
    */
  
    public double entregaPrestamo(String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega) {
        final double VALOR_DIA = 1000;
        Period periodo = Period.between(fechaPrestamo, fechaEntrega);
        int diasPrestamo = periodo.getDays();
        double valorPrestamo = diasPrestamo * VALOR_DIA;
    
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                if (libro.getUnidadesDisponibles() > 0) {
                    libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - 1); 
                    libro.setEstado(false); 
                    break; 
                }
            }
        }
    
        return valorPrestamo;
    }
                


     /*
     * Metodo para obtener cantidad
     * return codigo
     */
    public int getCantidad() {
        return cantidad;
    }

    /*
     * Metodo para modificar cantidad
     * return codigo
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /*
     * Metodo para obtener prestamo
     * return codigo
     */
    public Prestamo getPrestamo() {
        return prestamo;
    }

    /*
     * Metodo para modificar prestamo
     * return codigo
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    /*
     * Metodo para obtener libro
     * return codigo
     */
    public Libro getLibro() {
        return libro;
    }

    /*
     * Metodo para modificar libro
     * return codigo
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }



    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", prestamo=" + prestamo + ", libro=" + libro + ", subTotal="
                + subTotal + ", detallePrestamos=" + detallePrestamos + ", libros=" + libros + "]";
    }

    

    


 
    
    
}