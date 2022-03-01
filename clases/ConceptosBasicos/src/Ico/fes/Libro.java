/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolibro;

import java.awt.Color;

/**
 *
 * @author W10 USUARIO
 */
public class Libro {
    private String autor;
    private String editorial;
    private int paginas;
    private Color color;

    public Libro() {
    }

    public Libro(String autor, String editorial, int paginas, Color color) {
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", editorial=" + editorial + ", paginas=" + paginas + ", color=" + color + '}';
    }
   
    
    
            
    
}
