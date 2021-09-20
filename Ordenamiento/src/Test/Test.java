/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author kevb6
 */
import Metodos.BubbleSort;
import Metodos.BubbleSortOp;
import static Grafica.GenerarDatos.CasoMedio;
import static Grafica.GenerarDatos.CasoMedioInt;
import static Grafica.GenerarDatos.MejorCaso;
import static Grafica.GenerarDatos.MejorCasoInt;
import static Grafica.GenerarDatos.PeorCaso;
import static Grafica.GenerarDatos.PeorCasoInt;
import Grafica.Grafica;
import Metodos.InsertSort;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
//import static Herramientas.Graficar;

/**
 *
 * @author Vanessa
 */
public class Test {
    public static void main(String[] args) {
    int[] rango = {1, 90};
    int dimension = 10000;
    //int dimension = 50000;
    int[] arreglo1 = CasoMedioInt(dimension, rango);
    int[] arreglo2 = PeorCasoInt(dimension);
    int[] arreglo3 = MejorCasoInt(dimension);
    
    double[] tiempos1 = new double[dimension];
    double[] tiempos2 = new double[dimension];
    double[] tiempos3 = new double[dimension];
    
    BubbleSort bt = new BubbleSort();
    BubbleSortOp bo = new BubbleSortOp();
    InsertSort in = new InsertSort();
    
    System.out.println(ZonedDateTime.now());
    //for(int n=500, i=0; n<550 && i<50; n++, i++){
    for(int n=0; n<dimension; n++){
    //for(int n=0; n<dimension; n+=5){
        int[] arreglo = MejorCasoInt(n);
        
        bt.ordenar(arreglo.clone());
        tiempos1[n] = bt.gettTotal(); 
        bo.ordenar(arreglo.clone());
        tiempos2[n] = bo.gettTotal(); 
        in.ordenar(arreglo.clone());
        tiempos3[n] = in.gettTotal();
        
        System.out.println(n);
        //System.out.println("\n" +n + " " + tiempos[n] + " "+  bo.gettTotal());
    }
    
   
    Grafica gn = new Grafica("N","Tiempo (ms)","MejorCaso");
        gn.agregarSerie("Burbuja Tradicional", tiempos1);
        gn.agregarSerie("Burbuja Optimizada", tiempos2);
        gn.agregarSerie("Insert Sort", tiempos3);
        gn.CrearyMostrarGrafica();
        System.out.println(ZonedDateTime.now());
        
        
 
    }
    
    
    
}
