
public class Libro {

    private String codigo, isbn, autor, titulo, editorial;
    private int unidadesDisponibles;
    private LocalDate fechaPublicacion;
    private boolean estado;

    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, int unidadesDisponibles boolean estado,LocalDate fechaPublicacion,boolean estado){
        this.codigo=codigo;
        this.isbn=isbn;
        this.autor=autor;
        this.editorial=editorial;
        this.titulo=titulo;
        this.unidadesDisponibles=unidadesDisponibles;
        this.fechaPublicacion=fechaPublicacion;
        this.estado=estado;
    }

     /* 
     * Metodo para obtener el codigo
     *  return codigo
     */
    public String getCodigo() {
        return codigo;
    }

     /*
     *  Metodo para cambiar el codigo
     */

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

     /* 
     * Metodo para obtener el isbn
     *  return isbn
     */

    public String getIsbn() {
        return isbn;
    }

     /*
     *  Metodo para cambiar el isbn
     */

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

     /* 
     * Metodo para obtener el autor
     *  return autor
     */

    public String getAutor() {
        return autor;
    }

     /*
     *  Metodo para cambiar el autor
     */

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /* 
     * Metodo para obtener el titulo
     *  return titulo
     */

    public String getTitulo() {
        return titulo;
    }

     /*
     *  Metodo para cambiar el titulo
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

     /* 
     * Metodo para obtener el editorial
     *  return editorial
     */

    public String getEditorial() {
        return editorial;
    }

     /*
     *  Metodo para cambiar el editorial
     */

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

     /* 
     * Metodo para obtener las unidades disponibles
     *  return estudiantes
     */

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

     /*
     *  Metodo para cambiar las unidades disponibles
     */

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

     /* 
     * Metodo para obtener la fecha de publicacion
     *  return estudiantes
     */

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

     /*
     *  Metodo para cambiar la fecha de publicacion
     */

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
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

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", unidadesDisponibles=" + unidadesDisponibles + ", fechaPublicacion=" + fechaPublicacion
                + ", estado=" + estado + "]";
    }

    
    
}
