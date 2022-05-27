/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes;

import java.awt.Color;

/**
 *
 * @author 52558
 */
public class Automovil {
    private String marca; //los atributos van en notacion lower camel case 
    private String subMarca;// lower camel case, todas en minusculas y apartir de
                   // la segunda palabra,la primer letra en minuscula y la segunda en mayuscula
    private int modelo; 
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + " Marca= " + marca + ", subMarca= " + subMarca + ", Modelo= " + modelo + ", Color= " + color + '}';
    }
    
    
    
    
    
}
