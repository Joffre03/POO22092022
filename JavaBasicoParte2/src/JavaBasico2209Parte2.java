
import Ico.fes.Aritmetica;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 52558
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   /*
        *Excepciones
        */
        ArrayList<String> nombres=new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        for(String nombre:nombres){
            System.out.println(nombre);    
        }
        System.out.println("------");
        
        Scanner teclado = new Scanner(System.in);
        int seleccion=0;
                
        
        String elNombre="";
        try {
            seleccion=teclado.nextInt();
            elNombre=nombres.get(seleccion);
        } catch(InputMismatchException ie){
            System.out.println("Debe teclear valores numericos");
            elNombre=nombres.get(0);
        }catch(IndexOutOfBoundsException ioe){
           System.out.println("Error, debe ser entre 0 y 4");
            elNombre=nombres.get(0);
        }
        
        catch (Exception e) {
            System.out.println("Generica");
            elNombre=nombres.get(1);
            //generica cubre cualquier excepcion
        }finally{
            System.out.println(elNombre);
            //elNombre=null; hacer limpieza, liberar la variable, llego a su fin
        }
        
        //System.out.println(nombres.get(seleccion));
        
        System.out.println("Continua el programa...");
        Aritmetica cal= new Aritmetica(2, 0);
        System.out.println(cal.getA()+ "+"+cal.getB()+ "="+cal.sumar());
        try{
        System.out.println(cal.getA()+ "/"+cal.getB()+ "="+cal.dividir());
        }catch(Exception e) {
        
    }System.out.println("Error de aritmetica");
    System.out.println("Fin del programa");
}
}
