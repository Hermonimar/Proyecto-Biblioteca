package main.java.co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {

    private String codigo;
    private LocalDate fechaPrestamo, fechaEntrega;
    private double total;
    private Bibliotecario bibliotecario;
    private Estudiante estudiante;
    private Collection<DetallePrestamo> detallePrestamos;

    public Prestamo(String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega, Bibliotecario bibliotecario,
            Estudiante estudiante) {
        this.codigo = codigo;
        this.fechaEntrega = fechaEntrega;
        this.fechaPrestamo = fechaPrestamo;
        detallePrestamos = new LinkedList<>();
        this.total = calcularTotal();
    }

/*
 * Metodo para adicionar libro
 * return centinela
 */
    public boolean adicionarLibro(String codigo) {
        boolean centinela = false;
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
            if (libro.getUnidadesDisponibles () > 0) {
                libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - 1);
                centinela = true;

            }
            break;
        }
    } 
        return centinela;
    }

/*
 * Metodo que permite calcular el valor del prestamo de cada libro, estado y unidades disponibles
 * return valorPrestamo
 */
    public double entregaPrestamo(String codigo, LocalDate fechaPrestamo,LocalDate fechaEntrega){

        final double VALOR_DIA=1000;
        Period periodo = Period.between(fechaPrestamo, fechaEntrega);
        int diasPrestamo = periodo.getDays();
        double valorPrestamo= diasPrestamo * VALOR_DIA;


        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                if (libro.getUnidadesDisponibles() > 0) {
                    libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() + 1);
                    libro.setEstado(false);
                    break; 
                }
            }
        }

        return valorPrestamo;
    }

    /*
     * Metodo para mostrar la cantidad de prestamos realizados por cada bibliotecario
     * return contador
     */
    public int cantidadPrestamo (String bibliotecario){
        int contador = 0;

    for (Prestamo prestamo : prestamos) {
        if (prestamo.getBibliotecario().equals(bibliotecario)) {
            contador++;
        }
    }
    System.out.println("Los préstamos realizados por el bibliotecario " + bibliotecario + " son: " + contador);

    return contador; 

}

    /*
     * Metodo para calcular total
     * return total
     */
    public double calcularTotal() {
        double total = 0;
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

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /*
     * Metodo para modificar prestamo
     * return codigo
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /*
     * Metodo para obtener fecha de entrega
     * return codigo
     */
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    /*
     * Metodo para modificar fecha de entrega
     * return codigo
     */

    public void setFechaEntrega(LocalDate fechaEntrega) {
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
