/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;
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
public class grafica {
     // grafica 
    private JFreeChart grafica;
    // colecciÃ³n de series 
    private XYSeriesCollection series;
    private String ejeX,ejeY,titulo;
    
    public grafica (String ejeX,String ejeY,String titulo){
         this.grafica = null;
        this.series = new XYSeriesCollection();
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.titulo = titulo;
    } 
    
    public void agregarSerie(long[] datos, String id){
     // crear la serie
        XYSeries serie = new XYSeries(id);
        for(int x=0;x<datos.length;x++){
            serie.add(x, datos[x]);
        }
        this.series.addSeries(serie);
    
    }
     public void agregarSerie(int num, String id){
     // crear la serie
        int [] datos = new int [num];
        XYSeries serie = new XYSeries(id);
        for(int x=0;x<datos.length;x++){
            serie.add(x, datos[x]);
        }
        this.series.addSeries(serie);
    
    }
        public void agregarSerie(int[] datos, String id){
     // crear la serie
        XYSeries serie = new XYSeries(id);
        for(int x=0;x<datos.length;x++){
            serie.add(x, datos[x]);
        }
        this.series.addSeries(serie);
    }
        
        public void agregarDatoASerie(String nombre, XYDataItem dato)   { 
        this.series.getSeries(nombre).add(dato);
    }
         public void agregarSerie(String tituloSerie, double[] datos){ 
    
        XYSeries serie = new XYSeries(tituloSerie);
        
        for (int x=0; x < datos.length;x++){
            serie.add(x, datos[x]); 
        }
        this.series.addSeries(serie); 
     
    }
    public void creaYmuestraGrafica(){
    
        this.grafica = ChartFactory.
                createXYLineChart(titulo, ejeX, ejeY, series, PlotOrientation.VERTICAL, true, true, false);
        ChartFrame panel = new ChartFrame(titulo, grafica);
        panel.pack();
        panel.setVisible(true);
            
    } 
}
