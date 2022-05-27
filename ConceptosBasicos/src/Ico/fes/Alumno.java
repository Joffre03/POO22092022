/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes;

/**
 *
 * @author 52558
 */
    public class Alumno extends Persona{ //hereda atrivutos y metodos de la clase persona 
    private String numeroCuenta;
    private String Carrera;
    private String Grupo;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String Carrera, String Grupo) {
        this.numeroCuenta = numeroCuenta;
        this.Carrera = Carrera;
        this.Grupo = Grupo;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno" + ", numeroCuenta=" + numeroCuenta + ", Carrera=" + Carrera + ", Grupo=" + Grupo + '}';
    }
    
    
    
}
    
