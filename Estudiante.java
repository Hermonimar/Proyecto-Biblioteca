


import java.util.Collection;
import java.util.LinkedList;

public class Estudiante extends Persona {

    private boolean estado;
    private Collection<Prestamo> prestamos;

    public Estudiante(String nombre, String cedula, String correo, int telefono, boolean estado) {
        super(nombre, cedula, correo, telefono);
        this.estado = estado;
        prestamos = new LinkedList<>();
    }

     /* 
     * Metodo para obtener el estado
     *  return estado
     */

    public boolean isEstado() {
        return estado;
    }

    /*
     *  Metodo para cambiar el estado
     */

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

     /* 
     * Metodo para obtener el prestamo
     *  return prestamos
     */

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    /*
     *  Metodo para cambiar los prestamos
     */

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Estudiante [estado=" + estado + ", prestamos=" + prestamos + "]";
    }

}
    

