
package ec.edu.espoch.sistemasolar22.clases;

import ec.edu.espoch.sistemasolar22.enumeraciones.TipoPlaneta;


public class Planeta {
    
    public String nombre;
    public int cantidadDeSatelites;
    public double masaKilogramos;
    public double volumendelplanetaenkilogramosCubicos;
    public int diametrodelplanetaenKilogramos;
    public int distanciadelsolenMillonesdeKilometros;
    //public boolean observable;
    public TipoPlaneta tipoPlaneta;
    public boolean exterior=false;
    
    
    //CONSTRUCTORES (da valores iniciales a un objeto)
    /*public  Planeta(){
        
    }*/

    public Planeta(String nombre, int cantidadDeSatelites, double masaKilogramos, double volumendelplanetaenkilogramosCubicos, int diametrodelplanetaenKilogramos, int distanciadelsolenMillonesdeKilometros, TipoPlaneta tipoPlaneta) {
        this.nombre = nombre;
        this.cantidadDeSatelites = cantidadDeSatelites;
        this.masaKilogramos = masaKilogramos;
        this.volumendelplanetaenkilogramosCubicos = volumendelplanetaenkilogramosCubicos;
        this.diametrodelplanetaenKilogramos = diametrodelplanetaenKilogramos;
        this.distanciadelsolenMillonesdeKilometros = distanciadelsolenMillonesdeKilometros;
        this.tipoPlaneta = tipoPlaneta;
        this.exterior();
    }
    

    
    
    public Planeta(){
        this.exterior();
    }
    
    public void imprimir(){
        System.out.println("Nombre"+nombre);
        System.out.println("Cantidad de Satelites"+cantidadDeSatelites);
        System.out.println("Masa en Kilogramos"+masaKilogramos);
        System.out.println("Volumen del planeta en kilogramos Cubicos"+volumendelplanetaenkilogramosCubicos);
        System.out.println("Diametro del planeta en Kilogramos"+diametrodelplanetaenKilogramos);
        System.out.println("Distancia del sol en millones de kilometros"+distanciadelsolenMillonesdeKilometros);
        System.out.println("Exterior"+exterior);
        System.out.println("Tipo planeta"+tipoPlaneta);
    }
    
    public double calcularDensidadPlaneta(){
        return masaKilogramos/volumendelplanetaenkilogramosCubicos;
    }
    
    public boolean exterior(){
        double maximo=3.4;
        double distancia=149597870;
        
        double limite=maximo*distancia;
        //boolean resp=false;
        if(distanciadelsolenMillonesdeKilometros>limite){
            exterior=true;
        }
        return exterior; 
       
    }
}
