package main.java.co.edu.uniquindio.poo;

public class App {
    
    public static void main(String[] args) {
       

        // Se crean los estudiantes
        Estudiante estudiante1 = new Estudiante("Maria","123","maria@gmail.com","32093839","Activo");

        Estudiante estudiante2 = new Estudiante("Maria","123","maria@gmail.com","32093839","Activo");

        Estudiante estudiante3 = new Estudiante("Maria","123","maria@gmail.com","32093839","Activo");

        // Se crean los bibliotecarios
        Bibliotecario bibiliotecario1 = new Bibliotecario("Alberto", "10467589", "alberto@gmail.com", "3114678900",1300000, 2);

        Bibliotecario bibiliotecario2 = new Bibliotecario("Marcelo", "34567890", "marcelo@gmail.com", "3224897766", 1300000, 3);

        // Se crean los estudiantes
        Libro libro1 = new Libro("RTYI93783","8238202","Gabriel García Marquez","Cien años de soledad","Giraldo",2,"04/12/2022",true);              
        Libro libro2 = new Libro("LZKT5674","83274894","Miguel de Cervantes","Amigo se escribe con s","Guzman",9,"18/04/2000",true);
        Libro libro3 = new Libro ("LCDJ0120", "01205", "Camilo Bueno", "La Casa de Jose", "Pearson", 5, "12/05/2019", true);
        Libro libro4 = new Libro ("MDA2510", "25105", "Andrea Rivera", "Mirada de Amor", "Aguilar", 3, "03/03/2010", true);
        Libro libro5 = new Libro ("FP1325", "13255", "Edgar Lopez", "Finanzas Personales", "Gredos", 8, "25/09/2015", true);
       
        System.out.println("Total dinero recaudado: " + biblioteca.totalDinero());
        System.out.println("Total a pagar a bibliotecarios: " + biblioteca.PagoBibliotecarios());

        // Mostrar Estudiante con Más Préstamos
        Estudiante estudiantePrestamoMayor = biblioteca.estudiantePrestamoMayor();
        if (estudiantePrestamoMayor != null) {
        System.out.println("Estudiante con más préstamos: " + estudiantePrestamoMayor);
        } else {
        System.out.println("No hay préstamos registrados.");
        }
        break;
        
        
    

     
        
    }
}
