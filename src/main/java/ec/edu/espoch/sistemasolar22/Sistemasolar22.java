/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.sistemasolar22;

import ec.edu.espoch.sistemasolar22.clases.Planeta;
import ec.edu.espoch.sistemasolar22.enumeraciones.TipoPlaneta;

/**
 *
 * @author USER
 */
public class Sistemasolar22 {

    public static void main(String[] args) {
    
        Planeta objPlaneta=new Planeta("Tierra",5,25,10,0,4,TipoPlaneta.TERRESTRE);
        
        //objPlaneta.nombre="marte";
        //objPlaneta.cantidadDeSatelites=0;
        //objPlaneta.masaKilogramos=25;
        //objPlaneta.volumendelplanetaenkilogramosCubicos=10;
        //objPlaneta.diametrodelplanetaenKilogramos=0;
        //objPlaneta.distanciadelsolenMillonesdeKilometros=0;
        //objPlaneta.tipoPlaneta=TipoPlaneta.TERRESTRE;
       // objPlaneta.tipoPlaneta=TipoPlaneta.GASEOSO;
        
        objPlaneta.imprimir();
        
        double densidad=objPlaneta.calcularDensidadPlaneta();
        System.out.println("La densida es: "+densidad);
    }
}
