
import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private double totalDineroRecaudo;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Libro> libros;
    private Collection<Estudiante> estudiantes;

    public Biblioteca(String nombre, double totalDineroRecaudo) {
        this.nombre = nombre;
        this.totalDineroRecaudo = totalDineroRecaudo;
        bibliotecarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
        estudiantes = new LinkedList<>();
    }

    /*
     *Metodo para mostrar los datos de un libro
     */
    public String datosLibro(String codigo){
        for(Libro libro: libros){

            if(libro.getCodigo().equals(codigo)){
                return prestamo.toString;
            }
           

        }

        return"El prestamo no se pudo retornar";
        
    }

    /*
     * Metodo para contar la cantidad de prestamos segun el nombre del libro 
     */
    public int prestamoLibro(String titulo){
        int cantidad=0;
        for(Libro libro: libros){
            if(libro.getTitulo().equals(titulo)){
                int cantidad ++;                  
            }
        }
        return cantidad;
    }
    
    /*
     * Metodo para agregar estudiantes
     */
    public void agregarEstudiante(Estudiante estudiante) {
            estudiantes.add(estudiante);
        }
    }

    /*
     * Metodo para agregar bibliotecarios 
     */
    public void agregarBibliotecario(Bibliotecario bibliotecarios) {
        bibliotecarios.add(bibliotecario);
    }
    
    /*
     * Metodo para calcular el total del dinero
     */
    public double totalDinero() {
        double total = 0.0;

        for (Prestamo prestamo : prestamos) {
            total += prestamo.getTotal(); 
        }

        return total; 
    }

    /*
     * Metodo para reemplazar un libro
     */

    public boolean reemplazarLibro(String codigo, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            if (libro.getCodigo().equals(codigo)) {
                libros.set(i, nuevoLibro);
                return true; 
            }
        }
        return false;
    }

    /*
     * Metodo para determinar los estudiantes con mayor prestamos
     */

    public String estudiantePrestamoMayor() {
        int mayorPrestamos = 0;
        Estudiante estudianteMasPrestamos = null;
    
        for (Estudiante estudiante : estudiantes) {
            int contadorPrestamos = 0;
    
            for (Prestamo prestamo : prestamos) {
                if (prestamo.getEstudiante().equals(estudiante)) {
                    contadorPrestamos++;
                }
            }
    
            if (contadorPrestamos > mayorPrestamos) {
                mayorPrestamos = contadorPrestamos;
                estudianteMasPrestamos = estudiante;
            }
            
        }
        return estudiante;
    }

    /*
     * Metodo para obtener nombre
     * return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /*
     * Metodo para modificar nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
     * Metodo para obtener el total de dinero recaudado
     * return totaDineroRecaudado
     */

    public double getTotalDineroRecaudo() {
        return totalDineroRecaudo;
    }

    /*
     *  Metodo para Modificar el total de dinero recaudado
     */

    public void setTotalDineroRecaudo(double totalDineroRecaudo) {
        this.totalDineroRecaudo = totalDineroRecaudo;
    }

    /*
     *  Metodo para obtener los bibliotecarios
     *  return bibliotecarios
     */

    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    /*
     *  Metodo para cambiar los bibliotecarios
     */

    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    /* 
     * Metodo para obtener los prestamos
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

     /* 
     * Metodo para obtener los libros
     *  return prestamos
     */

    public Collection<Libro> getLibros() {
        return libros;
    }

    /*
     *  Metodo para cambiar los libros
     */

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

     /* 
     * Metodo para obtener los estudiantes
     *  return estudiantes
     */

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /*
     *  Metodo para cambiar los estudiantes
     */

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", totalDineroRecaudo=" + totalDineroRecaudo + ", bibliotecarios="
                + bibliotecarios + ", prestamos=" + prestamos + ", libros=" + libros + ", estudiantes=" + estudiantes
                + "]";
    }

}


    

