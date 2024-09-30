package main.java.co.edu.uniquindio.poo;


import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Persona {

    private double salario;
    private int antiguedad;
    private Collection<Prestamo> prestamos;

    public Bibliotecario(String nombre, String cedula, String correo, int telefono, double salario, int antiguedad){
        super(nombre, cedula, correo, telefono);
        this.salario=salario;
        this.antiguedad=antiguedad;
        prestamos = new LinkedList<>();
    }

     /*
     * Metodo para obtener salario
     * return codigo
     */
    public double getSalario() {
        return salario;
    }

    /*
     * Metodo para modificar salario
     * return codigo
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*
     * Metodo para obtener antiguedad
     * return codigo
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /*
     * Metodo para modificar antiguedad
     * return codigo
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

     /*
     * Metodo para obtener prestamos
     * return codigo
     */
    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    /*
     * Metodo para modificar prestamos
     * return codigo
     */
    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", antiguedad=" + antiguedad + ", prestamos=" + prestamos + "]";
    }

    
  
    
}