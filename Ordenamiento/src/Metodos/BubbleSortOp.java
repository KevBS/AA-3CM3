/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import java.io.*;
/**
 *
 * @author kevb6
 */
public class BubbleSortOp extends Ordenamiento{
    public double TIn, TFin, T;
    public int[] a;

    public BubbleSortOp() {
        super();
    }
    
    
    public double Ordenar(){ 
        int cantidad = this.a.length;
        int tem, bandera = 1;
        this.TIn = System.nanoTime();
        for ( int i = 0 ; i < (cantidad - 1 ) && bandera == 1 ; i ++ ) {
            bandera = 0 ;
            for ( int j = 0 ; j < (cantidad - 1 ); j ++ ) {
                if (this.a [j] > this.a [j + 1 ]) {
                    bandera = 1 ;
                    tem = this.a [j];
                    this.a [j] = this.a [j + 1 ];
                    this.a [j + 1 ] = tem;
                }
            }
        }
        this.TFin = System.nanoTime();
        this.T= this.TFin - this.TIn;
        return this.T;
    }
    
     public BubbleSortOp(int[] x){
        this.a = x;
    }
    
    public void setA(int[] ar){
        this.a = ar;
    }
    
    public double getTFinal() {
        return TFin;
    }

    public double getTInicio() {
        return TIn;
    }

    public double getTTotal() {
        return T;
    }
}
