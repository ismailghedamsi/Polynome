/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynome;

/**
 *
 * @author small44
 */
public class Polynome {
   double[] coeficient;
   
   public Polynome(double[] pCoeficient){
       coeficient = new double[pCoeficient.length];
       for(int i=0;i<pCoeficient.length;i++){
           coeficient[i]=pCoeficient[i];
       }
   }
   
   public int getDegre(){
       return coeficient.length-1;
   }
   
 
   
   
}
