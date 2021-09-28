/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.concurrent.TimeUnit;



/**
 *
 * @author kevb6
 */
public class Suma2 {
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    public int SumaI(int num1, int num2){
        int i,suma=1,s = num1 + num2;
        for(i=1; i <s; i++){
            suma++;
        }
        return suma;
    }
    
    public int [] Suma(int num1, int num2){
         this.tInicio = System.currentTimeMillis();
        int i,sum=1,s = num1 + num2;
        int [] aux = new int [s];
        for(i=0; i <s; i++){
            aux [i] = sum;
            sum++;
        }
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
        return aux;
    }
    
    public int gettTotalI() {
        this.tTotal = TimeUnit.MILLISECONDS.toMicros(tTotal);
        return (int) tTotal;
    }
}
