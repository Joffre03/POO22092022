/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.herencia;

/**
 *
 * @author 52558
 */
public class Alumno extends Persona{
    
   private String numeroCuenta;
   private String carrera;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carrera) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public Alumno(String numeroCuenta, String carrera, String nombre, int edaad) {
        super(nombre, edaad);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + " NumeroCuenta= " + numeroCuenta + ", Carrera= " + carrera + '}';
    }
    
    public void estudiar( int cantidad ) {
            System.out.println(this.getNombre()+ "esta estudiando "  +  cantidad + "hrs");
}
   
   // Polimorfismo por sobreescritura
   @Override
    public void dormir(){
        System.out.println(" El estudiante "+ this.getNombre()+ " esta durmiendo 5 horas ...");
    }
    
    //Polimorfismo por sobrecarga
    
    public void dormir(int horasEstudio){
    int horasDormir = 8;
        System.out.println(this.getNombre()+ " esta durmiendo "+(horasDormir - horasEstudio)+ " horas");
    
    
    }
}

