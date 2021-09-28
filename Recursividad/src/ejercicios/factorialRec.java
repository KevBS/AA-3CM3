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
public class factorialRec {
        
    //Sacamos el factorial recursivo
	public int factorialRec(long numero) {
		if (numero <= 1){
                    return 1;
                }else{
                    return (int) (numero * factorialRec(numero - 1));
                }	
	}
        
     
    //Aqui para sacar el tiempo
    public long tInicio;
    public long tFinal;
    public long tTotal;
        
       public int [] arrayFac(int a){
        this.tInicio = System.currentTimeMillis();
        int [] arreglo = new int [a];
        if (arreglo.length == 1 && arreglo[0] == 0){
                arreglo [0] = 1;
            return arreglo;
        }
        else{
            for(int i=0; i< arreglo.length; i++){
               // int aux = a*a-1;
                arreglo [i] = a * a-1;
                a--;
            }
        }
       
        
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
         return arreglo;
    }
    public int gettTotalI() {
        this.tTotal = TimeUnit.MILLISECONDS.toNanos(tTotal);
        return (int) tTotal;
    }  
}
