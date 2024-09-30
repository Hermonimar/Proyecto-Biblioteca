package main.java.co.edu.uniquindio.poo;


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
        int contador = 0;  
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
                System.out.println(libro);;
            }
            else{
                System.out.println("El libro no se pudo encontrar");
            }
        }
        return "El préstamo no se encontro";
    }


    /*
     * Metodo para mostrar el dinero recaudado por la empresa
     */
    public double totalDinero() {
        double total = 0.0;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotalDineroRecaudo() {
        return totalDineroRecaudo;
    }

    public void setTotalDineroRecaudo(double totalDineroRecaudo) {
        this.totalDineroRecaudo = totalDineroRecaudo;
    }

    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

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
    

