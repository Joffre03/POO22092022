/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes;

/**
 *
 * @author 52558
 */
public class Persona { //java bean es diferente a un enterprise  java bean 
    private int Edad;
    private String Nombre;

    public Persona() {
    }

    public Persona(int Edad, String Nombre) {
        this.Edad = Edad;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        if(Edad >=0 && Edad <=120){
         this.Edad = Edad;
        }else{
            System.out.println("Valor fuera de rango");
        }
    }

    @Override
    public String toString() {
        return "Persona" + "Edad=" + Edad + ", Nombre=" + Nombre + '}';
    }
    
    
}
