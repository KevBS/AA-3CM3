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
public class BubbleSort extends Ordenamiento{
     public double TIn, TFin, T;
    public int[] a;

    public BubbleSort() {
        super();
    }
    
    public double Ordenar (){
        int x,y;
        int aux;
        int dim = this.a.length;
        this.TIn = System.nanoTime();
        for (x =0; x< dim; x++){
            for (y=0; y< dim-1; y++){
                if(this.a[y]>this.a[y+1]){
                    aux = this.a[y+1];
                    this.a[y+1] = this.a[y];
                    this.a[y] = aux;
                }
            }
  
        }
        this.TFin = System.nanoTime();
        this.T= this.TFin - this.TIn;
        return this.T;
    } 
    
      public BubbleSort(int[] x){
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
