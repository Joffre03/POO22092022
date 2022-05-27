/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.herencia;

import Asus.com.Computadora;
import Ico.fes.componentes.Monitor;
import Ico.fes.componentes.Mouse;
import Ico.fes.componentes.Procesador;
import Ico.fes.componentes.Teclado;

/**
 *
 * @author 52558
 */
public class Servidor  extends  Computadora{ // extends hereda de computaodra 
    
    private int numeroFuentesPoder;
    private int numeroTarjetasRed;
    private int tipoRaid;

    public Servidor() { // constructor por defecto 
    }

    public Servidor(int numeroFuentesPoder, int numeroTarjetasRed, int tipoRaid) { // constructor sobrecargado
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public Servidor(int numeroFuentesPoder, int numeroTarjetasRed, int tipoRaid, String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        super(marca, modelo, pantalla, raton, teclado, cpu);
        this.numeroFuentesPoder = numeroFuentesPoder;  // constructor que tiene los metodos de servidor y computadora
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
        
             
    }

    public int getNumeroFuentesPoder() {
        return numeroFuentesPoder;
    }

    public void setNumeroFuentesPoder(int numeroFuentesPoder) {
        this.numeroFuentesPoder = numeroFuentesPoder;
    }

    public int getNumeroTarjetasRed() {
        return numeroTarjetasRed;
    }

    public void setNumeroTarjetasRed(int numeroTarjetasRed) {
        this.numeroTarjetasRed = numeroTarjetasRed;
    }

    public int getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(int tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    @Override
    public String toString() {
        return super.toString()+"Servidor{" + "numeroFuentesPoder=" + numeroFuentesPoder + ", numeroTarjetasRed=" + numeroTarjetasRed + ", tipoRaid=" + tipoRaid + '}';
    }
    
    
    
    
}
