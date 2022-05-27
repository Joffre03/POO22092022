/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.herencia.Poliformismo;

/**
 *
 * @author 52558
 */
public class Perro extends Animal {
    
    private String Raza;
    private String Pedigree;

    public Perro() {
    }

    public Perro(String Raza, String Pedigri) {
        this.Raza = Raza;
        this.Pedigree = Pedigree;
    }

    public Perro(String Raza, String Pedigri, int numeroPatas) {
        super(numeroPatas);
        this.Raza = Raza;
        this.Pedigree = Pedigree;
    }

    public String getPedigri() {
        return Pedigree;
    }

    public void setPedigri(String Pedigri) {
        this.Pedigree = Pedigree;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "Raza=" + Raza + ", Pedigri=" + Pedigree+ '}';
    }
    
    
    @Override
    public void emitirSonido(){// se trae con sobre escritura= Override
        System.out.println("El perro esta ladrando ...  Guau! Guau!");
    }
    
    
}
