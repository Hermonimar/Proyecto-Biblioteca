package main.java.co.edu.uniquindio.poo;

public class Libro {

    private String codigo, isbn, autor, titulo, editorial;
    private int unidadesDisponibles;
    private String fechaPublicacion;
    private boolean estado;
    

    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, int unidadesDisponibles, String fechaPublicacion,boolean estado){
        this.codigo=codigo;
        this.isbn=isbn;
        this.autor=autor;
        this.editorial=editorial;
        this.titulo=titulo;
        this.unidadesDisponibles=unidadesDisponibles;
        this.estado=estado;
        this.fechaPublicacion=fechaPublicacion;
    }
    /*
     * Metodo para obtener el codigo
     */
    public String getCodigo() {
        return codigo;
    }
    /*
     * Metodo para modificar el codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /*
     * Metodo para obtener el isbn
     */
    public String getIsbn() {
        return isbn;
    }
     /*
     * Metodo para modificar el isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /*
     * Metodo para obtener el autor
     */
    public String getAutor() {
        return autor;
    }
    /*
     * Metodo para modificar el autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /*
     * Metodo para obtener el titulo
     */
    public String getTitulo() {
        return titulo;
    }
    /*
     * Metodo para modificar el titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /*
     * Metodo para obtener la editorial
     */
    public String getEditorial() {
        return editorial;
    }
    /*
     * Metodo para modificar la editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    /*
     * Metodo para obtener las unidades disponibles
     */
    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }
    /*
     * Metodo para modificar las unidades disponibles
     */
    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    /*
     * Metodo para obtener la fecha de publicacion
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    /*
     * Metodo para modificar la fecha de publicacion
     */
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    /*
     * Metodo para obtener el estado
     */
    public boolean isEstado() {
        return estado;
    }
    /*
     * Metodo para modificar el estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", unidadesDisponibles=" + unidadesDisponibles + ", fechaPublicacion=" + fechaPublicacion
                + ", estado=" + estado + "]";
    }

   

    
    
}
