/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author kevb6
 */
public abstract class Ordenamiento {
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public Ordenamiento() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
  
    public void ordenar(int[] datos){
        this.tInicio = System.currentTimeMillis(); 
        ordenarDatos(datos);
        this.tFinal = System.currentTimeMillis(); // vuelve a hacer petición del tiempo para saber cuando termina el ordenamiento
        this.tTotal = this.tFinal - this.tInicio; //se estima el tiempo total que le llevo ejecutar el ordenamiento
    }
    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }

    public void ordenarDatos(int[] arreglo) {
    } 
}
