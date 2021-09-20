/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author kevb6
 */
public class Grafica {
    private JFreeChart grafica;
    private XYSeriesCollection series;
    private String eX, eY,titulo;
    //El eje x es la longitud del arreglo
    //El eje Y son los tiempos obtenidos
    //El titulo puede ser: caso medio, mejor caso, peor caso
    
    public Grafica(String eX, String eY, String titulo) {
        this.grafica = null;
        this.series = new XYSeriesCollection();
        this.eX = eX;
        this.eY = eY;
        this.titulo = titulo;
    }
    
    public void agregarSerie(String tituloSerie, double[] datos){ 
    
        XYSeries serie = new XYSeries(tituloSerie);
        
        for (int x=0; x < datos.length;x++){
            serie.add(x, datos[x]); 
        }
        this.series.addSeries(serie); 
     
    }
    
    public void agrearSerie(String nombre){
        XYSeries serie = new XYSeries(nombre);
        this.series.addSeries(serie);
    }
    
    public void agregarDatoASerie(String nombre, XYDataItem dato)   { 
        this.series.getSeries(nombre).add(dato);
    }
    
    public void CrearyMostrarGrafica(){
          this.grafica = ChartFactory.
                createXYLineChart(titulo, eX, eY, series, PlotOrientation.VERTICAL, true, true, false);
        ChartFrame panel = new ChartFrame(titulo, grafica);
        panel.pack();
        panel.setVisible(true);
    }
    
}
