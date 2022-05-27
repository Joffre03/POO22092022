
import Asus.com.Computadora;
import Ico.fes.componentes.Monitor;
import Ico.fes.componentes.Mouse;
import Ico.fes.componentes.Procesador;
import Ico.fes.componentes.Teclado;
import Ico.fes.herencia.Alumno;
import Ico.fes.herencia.Poliformismo.Animal;
import Ico.fes.herencia.Poliformismo.Perro;
import Ico.fes.herencia.Servidor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 52558
 */
public class ReutilizaciónCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String("José José ");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
        //fin de ejemplos con String
        
        //*JFrame ventana = new JFrame("Mi primer ventana Java");
        //ventana.setSize(600, 400);
        //ventana.setVisible(true);
        //*
          
        
        Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println( miCompu );
        miCompu.getCpu().setMarca("AMD");
        System.out.println( miCompu );
        
        //ejercicio establecer un mouse marca Logitech de tipo optico
        
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println( miCompu );
        
        Computadora compu2=new Computadora("Apple", "MacBook Proo",
                new Monitor("Toshiba", 14.3f),
                new Mouse("Acteck", "optico"),
                new Teclado("Apple", 101),
                new Procesador("M1", 3.4f));
        
        System.out.println(compu2);
         // mouse apple y tipo touch
        compu2.setRaton(new Mouse("Apple", "touch"));
        System.out.println(compu2);
        
        System.out.println("-------------");
        System.out.println(" ");
        
        Alumno alu1= new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);
        
        
        Alumno alu2= new Alumno("12354897  ",  "ICO ", "Jose Perez ", 19);
        System.out.println(alu2);
                
        alu1.setNumeroCuenta("2333988494");
        alu1.setEdaad(19);
        System.out.println(alu1);
        
        
        System.out.println("-------\tComposicion y herencia en la misma clase\t--------");
        Servidor server=new Servidor();
        server.setNumeroTarjetasRed(2);
        server.setMarca("Hp");
        server.setRaton(new Mouse("Lg", "Optico"));
        System.out.println(server);
        server.getRaton().setMarca("Logitech"); // para solo cambiar la marca y no el tipo 
        System.out.println(server);
       
        
        
        System.out.println("---\tEjemplo polimorfismo\t----");
        Perro dog=new Perro("Bull dog", "% estrellas ", 4);
         
        Animal animal1= new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();
       
       
       
    }
    
}
