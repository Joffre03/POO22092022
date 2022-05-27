/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.composicion;

/**
 *
 * @author 52558
 */
public class Marco {
    
   private String Marca;
   private String Material;

    public Marco() {
    }

    public Marco(String Marca, String Material) {
        this.Marca = Marca;
        this.Material = Material;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Marco{" + "Marca=" + Marca + ", Material=" + Material + '}';
    }
   
   
    
}
