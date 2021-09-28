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
public class FibonacciIt {
     public long tInicio;
    public long tFinal;
    public long tTotal;
    public int fibonacciI(int posicion) {
		int siguiente = 1, actual = 0, temporal = 0;
		for (long x = 1; x <= posicion; x++) {
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		return actual;
	}
    
    public int [] fibonacci(int posicion) {
         this.tInicio = System.currentTimeMillis();
		int siguiente = 1, actual = 0, temporal = 0;
                int [] aux = new int [posicion];
		for (int x = 1; x <= posicion; x++) {
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
                        aux [x-1] = actual;
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
