/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 52558
 */
public class Alumno {
    private String numeroCuenta;// atributos
    private int Semestre;
    private float Promedio;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, int Semestre, float Promedio) {
        this.numeroCuenta = numeroCuenta;
        this.Semestre = Semestre;
        this.Promedio = Promedio;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCuenta + ", Semestre=" + Semestre + ", Promedio=" + Promedio + '}';
    }
    
    public void estudiar (int minutos ){
        System.out.println("Estudiando ... "+ minutos + " minutos ");
    }
    
    public String evaluarDesempeño(){
        return  this.Promedio > 8.0f? "Sobresaliente ": "Regular ";
    }
    
}
