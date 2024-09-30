package main.java.co.edu.uniquindio.poo;

public class App {
    
    public static void main(String[] args) {
       
        Biblioteca biblioteca= new Biblioteca("Biblioteca central");
    
       

        // Se crean los estudiantes
        Estudiante estudiante1 = new Estudiante("Juan","10192920","juan@gmail.com",3145809,true);
        Estudiante estudiante2 = new Estudiante("Maria","4172930","maria@gmail.com",320938,true);
        Estudiante estudiante3 = new Estudiante("Sofia","10927234","sofia@gmail.com",320938,true);
        

        //Se añaden los estudiantes a la biblioteca
        biblioteca.agregarEstudiante(estudiante1);
        biblioteca.agregarEstudiante(estudiante2);
        biblioteca.agregarEstudiante(estudiante3);

        // Se crean los bibliotecarios
        Bibliotecario bibiliotecario1 = new Bibliotecario("Alberto","41820390","alberto@gmail.com",316272,1000000,5);
        Bibliotecario bibiliotecario2 = new Bibliotecario("Marcelo", "34567890", "marcelo@gmail.com", 3224897, 1300000, 3);
        Bibliotecario bibiliotecario3 = new Bibliotecario("Juan", "29384950", "juan@gmail.com", 3274849, 1500000, 7);
         
        
        //Se añaden los bibliotecarios a la bibioteca 
        biblioteca.agregarBibliotecario(bibiliotecario1);
        biblioteca.agregarBibliotecario(bibiliotecario2);
        biblioteca.agregarBibliotecario(bibiliotecario3);

        // Se crean los libros
        Libro libro1 = new Libro("JSL830","02830384","Gabriel Garcia Marquez","Cien años de soledad","Mejia",5,"11/07/2020",true); 
        Libro libro2 = new Libro("LZKT5674","83274894","Miguel de Cervantes","Amigo se escribe con s","Guzman",9,"18/04/2000",true);
        Libro libro3 = new Libro ("LCDJ0120", "01205", "Camilo Bueno", "La Casa de Jose", "Pearson", 5, "12/05/2019", true);
        Libro libro4 = new Libro ("MDA2510", "25105", "Andrea Rivera", "Mirada de Amor", "Aguilar", 3, "03/03/2010", true);
        Libro libro5 = new Libro ("FP1325", "13255", "Edgar Lopez", "Finanzas Personales", "Gredos", 8, "25/09/2015", true);
        
        // Imprimir libros
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);

        //Se añaden los libros a la biblioteca 
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
      
        //Se muestra el dinero recaudado
        System.out.println("Total dinero recaudado: " + biblioteca.totalDinero());
       
        // Agregar préstamos a la lista
        Prestamo prestamo1 = new Prestamo ("l120242","01/09/2024","14/09/2024",bibiliotecario1,estudiante2);
        Prestamo prestamo2 = new Prestamo ("l220242", "15/09/2024", "16/09/2024",bibiliotecario3, estudiante1);
        Prestamo prestamo3 = new Prestamo ("l320242", "20/09/2024", "30/09/2024",bibiliotecario2,estudiante3);
        //Imorimir prestamo
        System.out.println(prestamo1);
        System.out.println(prestamo2);
        System.out.println(prestamo3);
        
         // Agregar los préstamos a la biblioteca
         biblioteca.agregarPrestamo(prestamo1);
         biblioteca.agregarPrestamo(prestamo2);
         biblioteca.agregarPrestamo(prestamo3);

         // datos de un Prestamo segun el codigo
         String resultado = biblioteca.datosPrestamo("l120242");
         System.out.println(resultado);  
         
         String noEncontrado = biblioteca.datosPrestamo("l420242");
         System.out.println(noEncontrado);  

        // Consultar libro por código
        String datos = biblioteca.datosLibro("JSL830");
        System.out.println(datos);
      

        // Contar préstamos de un libro
        int cantidadPrestamos = biblioteca.prestamoLibro("Cien años de soledad");
        System.out.println("Cantidad de préstamos para 'Cien años de soledad': " + cantidadPrestamos);

        // Calcular costo del préstamo
        double costo = prestamo1.calcularTotal();
        System.out.println("Costo del préstamo: " + costo);

        // El pago para el bibliotecario
        double pagoBibliotecario1 = biblioteca.pagoBibliotecarios(bibiliotecario1,5);
        System.out.println("Pago para el bibliotecario " + bibiliotecario1.getNombre() + ": " + pagoBibliotecario1);
     }
 }
     
        
        
    

     
        
    

