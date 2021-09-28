/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import grafica.grafica;
import ejercicios.FibonacciRec;
import ejercicios.FibonacciIt;
import ejercicios.factorialRec;
import ejercicios.Suma2;
import java.util.ArrayList;

/**
 *
 * @author kevb6
 */
public class op {
      public void Factorial(){
        factorialRec f = new factorialRec();
        grafica g1 = new grafica("Factorial de n", "Tiempos","Factorial Recursivo");
        ArrayList<int []> complejidad = new ArrayList<int []>();
        complejidad.add(0,f.arrayFac(1));
        complejidad.add(1,f.arrayFac(5));
        complejidad.add(2,f.arrayFac(7));
        complejidad.add(3,f.arrayFac(10));
       
        
        for (int x=0;x<complejidad.size();x++){
            if (x==0){
                g1.agregarSerie(complejidad.get(x),"n = 1 "+f.factorialRec(1) +"");
            }
            if (x==1){
                g1.agregarSerie(complejidad.get(x),"n = 5 "+f.factorialRec(5)+"");
            }
            if (x==2){
                g1.agregarSerie(complejidad.get(x),"n = 7 "+f.factorialRec(7) +"");
            }
            if (x==3){
                g1.agregarSerie(complejidad.get(x),"n = 10 "+f.factorialRec(10) +"");
            }
            
        }        
        g1.creaYmuestraGrafica();
    }
      
     public void Fibonacci(){
        FibonacciIt fibI = new FibonacciIt();
        FibonacciRec fibR = new FibonacciRec();
        grafica g2 = new grafica("Itetivos", "Tiempos","Fibonacci Recursivo e Iterativo");
        ArrayList<int []> complejidad = new ArrayList<int []>();
        complejidad.add(0,fibI.fibonacci(5));
        complejidad.add(1,fibI.fibonacci(10));
        complejidad.add(2,fibR.fibonacciRecursivo(5));
        complejidad.add(3,fibR.fibonacciRecursivo(10));
       
        

        for (int x=0;x<complejidad.size();x++){
            if (x==0){
                g2.agregarSerie(complejidad.get(x),"n = 1 "+fibI.fibonacciI(5) +" R");
            }
            if (x==1){
                g2.agregarSerie(complejidad.get(x),"n = 5 "+fibI.fibonacciI(10) +" R");
            }
            if (x==2){
                g2.agregarSerie(complejidad.get(x),"n = 1 " + fibR.fibonacciRecursivo(5)+" I");
            }
            if (x==3){
                g2.agregarSerie(complejidad.get(x),"n = 10 "+fibR.fibonacciRecursivo(10)+" I");
            }
            
        }        
        g2.creaYmuestraGrafica();
    }
     
      public void Suma2(){
        Suma2 sum = new Suma2();
        grafica g3 = new grafica("Iteraciones", "Tiempos", "Suma Iterativa");
        ArrayList<int []> complejidad = new ArrayList<int []>();
        complejidad.add(0,sum.Suma(10, 7));
        complejidad.add(1,sum.Suma(20, 89));
        
        for(int i =0; i < complejidad.size(); i++){
            if(i==0){
                g3.agregarSerie(complejidad.get(i),"(num1)10 + (num2)7 = " + sum.SumaI(10, 7) );
            }
            if(i==1){
                g3.agregarSerie(complejidad.get(i),"(num1)20 + (num2)89 = " + sum.SumaI(20, 89) );
            }
        }
        g3.creaYmuestraGrafica();
    }
}
