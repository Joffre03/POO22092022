/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.composicion;

/**
 *
 * @author 52558
 */
public class Llanta {
    private String Marca;
    private int Rodada;

    public Llanta() {
    }

    public Llanta(String Marca, int Rodada) {
        this.Marca = Marca;
        this.Rodada = Rodada;
    }

    public int getRodada() {
        return Rodada;
    }

    public void setRodada(int Rodada) {
        this.Rodada = Rodada;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "llanta{" + "Marca=" + Marca + ", Rodada=" + Rodada + '}';
    }
    
    
    
}
