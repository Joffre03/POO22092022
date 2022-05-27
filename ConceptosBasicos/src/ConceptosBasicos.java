
import Ico.fes.Alumno;
import Ico.fes.Automovil;
import Ico.fes.Persona;
import Ico.fes.Silla;
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 52558
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        
        Silla  s1= new Silla();
        System.out.println(s1);//por defecto se invoca toString()
        System.out.println(s1.toString());
        
        
        Automovil miBocho=new Automovil();
        System.out.println(miBocho);
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);
        
        
        Automovil miMustang=new Automovil("Ford", "Mustang",2010, Color.YELLOW);
        System.out.println(miMustang);
        
        Automovil miAkura=new Automovil("Akura", "NSX", 2013, Color.GRAY);
        System.out.println(miAkura);
        
        // Actividad persona
        
        Persona per1=new Persona();
        //per1.Edad=20; no se permite por seguridad 
        per1.setEdad(22);
        System.out.println(per1);
           
        
        Alumno a1=new Alumno();
        a1.setNombre("Joffre");
        a1.setNumeroCuenta("319098329-9");
        a1.setCarrera("Inegenieria en computacion");
        a1.setGrupo("2209");
        System.out.println(a1);
    }
    
}
