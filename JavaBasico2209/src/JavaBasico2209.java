
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 52558
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=20;
        System.out.println("Edad = "+  edad +" años");
        
        Integer edad2 =new Integer(22);
        System.out.println(edad2);
        double x= edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println("---------------");
        // convertir  String  a entero
        
        String cadena= "99";
        int altura= Integer.parseInt(cadena ); //metodo mimbro o metodo de clase 
        Color cl =Color.BLUE; // atributo miembro o metodo 
        altura+=1;
        System.out.println("Altura = "+ altura);
        
        float y = Float.parseFloat(cadena);
        y= y +0.5f;
        System.out.println("Altura = "+ y);
        
        System.out.println("---------------");
        
        Arbol tree1=new Arbol(2.4f, 15);
        Arbol tree2=new Arbol(2.4f, 15);
        Arbol tree3=new Arbol(2.4f, 15);
        Arbol tree4=new Arbol(2.4f, 15);
        System.out.println(tree1);
        System.out.println("Troncos de un arbol "+ Arbol.tronco);
        System.out.println("Troncos de un arbol "+tree1.tronco);
        System.out.println("Troncos de un arbol "+ tree2.tronco);
        System.out.println("Troncos de un arbol "+ tree3.tronco);
        Arbol.generarOxigeno();
        
        
        JOptionPane.showMessageDialog(null, "Hola mundo", "aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad ", "Introducir datos ", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato );
        
         System.out.println("---------------");
        //aqui nos quedamos la clase pasada 
        //oeprador ternario
        //codigo sin operador ternario 
        int edad3=20;
        // validar si es mayor de edad
        String resultado="";
        if (edad3 < 18){
        resultado= "Menor de edad";
        }
        else{
        resultado="Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        // mismo algoritmo pero con operador ternario 
        //<cond>?  <True> : <False>;
        
        int edad4=24;
        String res ="";
        res = edad4 <18 ?" Menor de edad": "Mayor de edad, tequila!!!";
        System.out.println(res);
        
        // cuando tengamos una logica asi se puede utilizar el ternario
        // version minima
        
        int edad5=19;
        System.out.println( edad5 < 18 ? "Menor de edad 5": "YA!, el tequila !!!! ");
        
        // siguiente 
        
        int val1=1;
        int val2=2;
        
        // aremos una comparacion or a nivel  de bits es decir 
        /*
        val1=0000...0001;
        val2=0000...0010;
        
       1 or 1 = 1
       1 or 0 = 1
        0 or 0 = 0
        Entonces vemos como funciona el or a nivel de bits 
        */
        System.out.println("\n\tVal1 OR Val 2\t");
        System.out.println(val1 | val2);
        System.out.println("\n\t Val1 AND Val 2\t");
        System.out.println(val1 & val2);
        /*
        Que esta pasando , esto:
        val1=0000...0001;
        or 
        val2=0000...0010;
        --------------------
                 0000...0011 => 3 
        */
        
        int val3= 1;// 0000...0001
        //int val4 <<= val3;
       // System.out.println("");
        int val4=0;
        val4=val3 <<2;  //el segundo valor es el numero de desplazamientos a la izquierda
        System.out.println(val4);
                
        System.out.println("\n\tARREGLOS\n");
        int[] edades; //primero se declara que sara un arreglo 
        // en este punto no se reserva memoria 
        // el segundo paso es reservarlo, de un tamaño especifico
        edades = new int [5];
        System.out.println(edades);
        //ahora lo usamos como simpre 
        edades[0] =10;
        System.out.println("La primer edad es : "+ edades[0]);
        
        //declarar e inicializar en una sola linea 
        
        int [] estaturas  = new int [5];
        // ahora ... al igual que en C y C++, pueedes asignar  valores 
        int [] pesos  = {86,99,56,76,77};// en kilos 
        // en este ultimo veremos su contenido 
        System.out.println(pesos [0]);// 86
        System.out.println(pesos [1]);// 99
        System.out.println(pesos [2]);// 56
        System.out.println(pesos [3]);// 76
        System.out.println(pesos [4]);// 77
        // imprime lo mismo pero con menos lineas de  codigo
        System.out.println("\n\tCON FOR\n");
        for (int i =0 ; i< pesos.length; i++){
            System.out.println(pesos[i]);
        }
        //imprimimos en inversa 
        System.out.println("\n\tINVERSAMENTE \n");
        for (int k = pesos.length -1 ; k >= 0; k--){
            System.out.println(pesos[k]);
        }

        
        System.out.println("\n\tArreglo de Alumnos \n");
        Alumno[] lista = new Alumno[5]; // 5 alumnos 
        lista [0]= new Alumno("99999", 2, 9.0f);
        lista [1]= new Alumno("77777", 2, 7.0f);
        lista [2]= new Alumno("55555", 2, 7.0f);
        lista [3]= new Alumno("88888", 2, 8.0f);
        lista [4]= new Alumno("66666", 2, 6.0f);
    
        for (int i = 0; i < lista.length; i++) { // fori + tecla tabulador 
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempeño());
                    }
        
        /*For each  es un FOR especial, introducido en la version 2 de java, 
        esta version fue la que sufrio cambios muy grandes java
        EL FOR EACH fue introducido por simplificar los 
        FOR con arreglos 
        fore + tab
        */
        System.out.println("\n\tCon for each\n");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempeño());
            
        }
             
        
        ArrayList<Alumno> grupo2209 = new ArrayList<Alumno>();
                grupo2209.add( new Alumno("9999999", 2, 9.0f));
                grupo2209.add( new Alumno("8888888", 2, 8.0f));
                grupo2209.add( new Alumno("7777777", 2, 7.0f));
                grupo2209.add( new Alumno("6666666", 2, 6.0f));
                grupo2209.add( new Alumno("5555555", 2, 5.0f));
                for (Alumno alumno : grupo2209) {
                    System.out.println(alumno);
        }
                System.out.println("Add con indice");
                grupo2209.add(2, new Alumno("8111111", 3, 9.9f));
             for (Alumno alumno : grupo2209) {
                    System.out.println(alumno);
        }
             
             Alumno  tmp  = grupo2209.get(3); //NC=7777777
             
            System.out.println("Alumno en index 1: "+ tmp);
            System.out.println("Emilinar el index");
            Alumno tmp2 = grupo2209.remove(3);
             System.out.println("El elemento sacado es: " + tmp2);
              for (Alumno alumno : grupo2209) {
                    System.out.println(alumno);
        }
               System.out.println("Remplazar el i- enesimo");
              Alumno tmp3= grupo2209.set(0, new Alumno("4444444", 4, 4.0f));
              System.out.println("El elemento sacado es: " + tmp3);
              for (Alumno alumno : grupo2209) {
                    System.out.println(alumno);
        }
              
              
              
              //excepciones 
              //trycatch + tab
              try {
            System.out.println("Excepciones");
              System.out.println(grupo2209.get(20));
                } catch (Exception e) {
                    System.out.println("Error ...  revisa los indices ");
            
                }
              System.out.println("Fin del Programa");
              
             
             
    }
    
}