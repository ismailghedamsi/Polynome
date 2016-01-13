/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynome;

public class PolynomeTest{
	public static void main(String[] args){
		double[] tab1 = {5,1,9,7};
		double[] tab2 = {2,4,2};
		
		Polynome p1 = new Polynome(tab1);
		Polynome p2 = new Polynome(tab2);
		
		Polynome addP1P2 = p1.ajoute(p2);
		addP1P2.affiche();
	}
}