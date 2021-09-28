/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author kevb6
 */
public class FibonacciRec {
    
    private static int funcionFibonacciR(int num){
          if(num == 0 || num==1)
               return num;
          else
               return funcionFibonacciR(num-1) + funcionFibonacciR(num-2);
     }
    
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    
    public int [] fibonacciRecursivo(int posicion) {
        this.tInicio = System.currentTimeMillis();
                int [] arreglo = new int [posicion];
		if (posicion < 2)
			return arreglo;
                else{
                    for(int i=0; i< arreglo.length; i++){
               // int aux = a*a-1;
                    arreglo [i] = posicion-1 + posicion-2;
                        posicion--;
                    }
                }
                 this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
		return arreglo;
	}
}

