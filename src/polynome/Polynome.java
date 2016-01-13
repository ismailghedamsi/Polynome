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
   
   public Polynome inverse(){
       double[] coeficientInverse = new double[coeficient.length];
       
       for(int i=0;i<coeficientInverse.length;i++){
           coeficientInverse[i]=1/coeficient[i];
       }
       
       return new Polynome(coeficientInverse);
   }
   
   public void affiche(){
		System.out.print("( ");
		for(int i = 0; i<coeficient.length-1; i++)
			System.out.print(coeficient[i]+",");
		System.out.println(coeficient[coeficient.length-1]+")");
	}
   
   public Polynome ajoute(Polynome p){
     double[] plusGrand;
		double[] plusPetit;
		double[] polynomeResultat;
		if(coeficient.length < p.getDegre()){
			plusGrand = p.coeficient;
			plusPetit = coeficient;
		}
		else{
			plusGrand = coeficient;
			plusPetit = p.coeficient;
		}
		polynomeResultat = new double[plusGrand.length];

		//boucle d'addition qui remplit le tableau de coefficient du polynome resultant avec l'addition 
		//des coefficients correspondant des deux polynomes additionnes
		for(int i = 0; i<plusPetit.length; i++){
			polynomeResultat[i] = plusPetit[i]+plusGrand[i];
		}
		//si on a par exemple les deux polynomes:
		//3+1x+2x^2 et
		//3+3x+5x^2+3x^3+4x^4
		//le resultat est:
		//6+4x+7x^2+***3x^3+4x^4***
		//Dans la boucle qui suit, on copie la partie entre *** dans le polynomeResultat
		for(int i = plusPetit.length; i<plusGrand.length; i++)
			polynomeResultat[i] = plusGrand[i];
		return new Polynome(polynomeResultat);
   }
   
 
   
   
}
