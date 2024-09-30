package main.java.co.edu.uniquindio.poo;


import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Libro> libros;
    private Collection<Estudiante> estudiantes;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        bibliotecarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
        estudiantes = new LinkedList<>();
    }

     /*
     * Metodo para calcular el pago de los bibliotecarios
     * return total + bonificacion
     */

     public double pagoBibliotecarios(Bibliotecario bibliotecario, int antiguedad) {
        double total= 150000;

        for (Prestamo prestamo: prestamos) {
            total += prestamo.getTotal() * 0.20; 
        }

        double bonificacion = total * (0.02 * antiguedad); 

        return total + bonificacion; 
    }
     
    /*
     * Metodo para reemplzar un libro por otro
     */
    
    public boolean reemplazarLibro(String codigo, Libro nuevoLibro) {
        for (Libro libro: libros) {
            if (libro.getCodigo().equals(codigo)) {
                libros.remove(libro);
                libros.add(nuevoLibro);
                return true; 
            }
        }
        return false;
    }
    /*
     * Metodo para contar los prestamos de un libro 
     */
    public int prestamoLibro(String nombre) {
        int contador = 2;  
        for (Prestamo prestamo : prestamos) {
                if (prestamo.getCodigo().equals(nombre)) { 
                    contador++; 
                
                }
        }
        return contador; 
        
    }
    /*
     * Metodo para mostrar los datos de un libro
     */
    public String datosLibro (String codigo){
        for (Libro libro: libros){
    
            if (libro.getCodigo().equals(codigo)){
                return libro.toString(); 
            }
        }
        return "El préstamo no se encontro";
    }


    /*
     * Metodo para mostrar el dinero recaudado por la empresa
     */
    public double totalDinero() {
        double total = 150000;

            for (Prestamo prestamo : prestamos) {
                total += prestamo.getTotal(); 
            }
        
    
        return total; 
    }
    
    /*
     * Metodo para agregar bibliotecario
     */
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (!verificarBibliotecario(bibliotecario.getCedula())) {
            bibliotecarios.add(bibliotecario);
        }
    }
    /*
     * Metodo para verificar bibliotecario
     */
    public boolean verificarBibliotecario(String cedula) {
        boolean centinela = false;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }
     /*
     * Metodo para agregar libro
     */
    public void agregarPrestamo(Prestamo prestamo) {
        if (!verificarPrestamo(prestamo.getCodigo())) {
            prestamos.add(prestamo);
        }
    }
    /*
     * Metodo para verificar libro
     */
    
    public boolean verificarPrestamo(String codigo) {
        boolean centinela = false;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }
     /*
     * Metodo para agregar libro
     */
    public void agregarLibro(Libro libro) {
        if (!verificarLibro(libro.getCodigo())) {
            libros.add(libro);
        }
    }
    /*
     * Metodo para verificar libro
     */
    
    public boolean verificarLibro(String codigo) {
        boolean centinela = false;
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }
    /*
     * Metodo para agregar estudiante
     */
    public void agregarEstudiante(Estudiante estudiante) {
        if (!verificarEstudiante(estudiante.getCedula())) {
            estudiantes.add(estudiante);
        }
    }
    /*
     * Metodo para verificar estudiante
     */
    
    public boolean verificarEstudiante(String cedula) {
        boolean centinela = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }
    /*
     * Metodo para mostrar datos del estudiante con mas prestamos
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
        if (estudianteMasPrestamos != null) {
            return estudianteMasPrestamos.getNombre(); 
        } else {
            return "No hay estudiantes con préstamos."; 
        }
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
     * Metodo para mostrar la cantidad de prestamos realizados por cada bibliotecario
     * return contador
     */
    public int cantidadPrestamo (String nombre){
        int contador = 0;

    for (Prestamo prestamo : prestamos) {
        if (prestamo.getBibliotecario().toString().equals(nombre)) {
            contador++;
        }
    }
    System.out.println("Los préstamos realizados por el bibliotecario" +nombre+ "son:" + contador);

    return contador; 

}
    /*
     * Metodo para obtener nombre
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Metodo para modificar el nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
     * Metodo para obtener los bibliotecarios
     */
    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }
     /*
     * Metodo para modificar los bibliotecarios
     */
    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }
    /*
     * Metodo para obtener los prestamos
     */
    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }
     /*
     * Metodo para modificar los prestamos
     */
    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    /*
     * Metodo para obtener los libros
     */
    public Collection<Libro> getLibros() {
        return libros;
    }
    /*
     * Metodo para modificar los libros
     */
    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }
    /*
     * Metodo para obtener los libros
     */
    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

     /*
     * Metodo para modificar los estudiantes
     */
    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", bibliotecarios=" + bibliotecarios + ", prestamos=" + prestamos
                + ", libros=" + libros + ", estudiantes=" + estudiantes + "]";
    }

    

    

}
    

