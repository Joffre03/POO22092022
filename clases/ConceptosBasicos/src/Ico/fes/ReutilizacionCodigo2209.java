/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import javax.swing.JFrame;

/**
 *
 * @author W10 USUARIO
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String nombre = new String("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
        
        JFrame ventana = new JFrame("Mi primer ventana java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        
        Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);
        
        // cambiar propiedades 
        Computadora compu2=new Computadora("Apple", "Macbook Pro",
        new Monitor("Toshiba", 14.3f),
        new Mouse("Acteck", "optico"),
        new Teclado("Apple", 101),
        new Procesador("M1", 3.4f));
        System.out.println(compu2);
       
        //codigo para cambiar propiedades del Mouse
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
        System.out.println(compu2);
        
        System.out.println("==============================");
        Alumno alu1=new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);
  
        Alumno alu2=new Alumno("319098329", "ICO", "Jose perez", 19);
        System.out.println(alu2);
        
        alu1.setNumeroCuenta("319098328");
        alu1.setEdad(19);
        System.out.println(alu1);
        
        System.out.println("------Composición y herencia en la misma clase-----");
        Servidor server= new Servidor();
        System.out.println(server);
        //cambiar tarjetas de red a 2
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        //cambiar la marca
        server.setMarca("Hp");
        //colocar
        server.setRaton(new Mouse("LG", "optico"));
       //obtienes el raton y luego le modificas la marca
        server.getRaton().setMarca("Logitech");
        System.out.println(server);
        
        System.out.println("---Ejemplo polimorfismo--");
        Perro dog= new Perro("Bull dog", "5 estrellas", 4);
        //mandar a llamar el metodo general e imprimir
        dog.emitirSonido();
        Animal animal1= new Animal(4);
        animal1.emitirSonido();
        System.out.println(animal1);
        System.out.println(dog);
        
                
        
    }
}
