package proyectoBiblioteca;

public class DetallePrestamo {

    private int cantidad;
    private Prestamo prestamo;
    private Libro libro;
    private double subTotal;

    public DetallePrestamo(int cantidad, Prestamo prestamo, Libro libro){
        this.cantidad=cantidad;
        this.prestamo=prestamo;
        this.libro=libro;
        this.subTotal=calcularSubtotal();
    }

    /*
     * Metodo para mostrar los detalles del prestamo
     * 
     */
public String datosPrestamo (String codigo){
    for (Prestamo prestamo: prestamos){

        if (prestamo.getCodigo().equals(codigo)){
            return prestamo.toString();
        }
    }
    return "El préstamo no se pudo encontrar";
}


/* Metodo que permite calcular el subtotal
 * return subtotal
 */

    public double calcularSubtotal() {
        double subtotal = 0;
        for (DetallePrestamo detallePrestamo : detallePrestamos) {
            subtotal += detallePrestamo.getCantidad() * detallePrestamo.getValorPrestamo();
        }
        return subtotal;
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

    /*
     * Metodo para obtener subtotal
     * return codigo
     */
    public double getSubTotal() {
        return subTotal;
    }

    /*
     * Metodo para modificar subtotal
     * return codigo
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", prestamo=" + prestamo + ", libro=" + libro + ", subTotal="
                + subTotal + "]";
    }

    
    
}