/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpgraphe;
import java.util.ArrayList;

/**
 *
 * @author NIK
 */

public class Arbre implements Comparable<Arbre> {
	protected int id;
	protected Arbre parent;
	protected ArrayList<Arbre> enfants;
	
	/** Constructeurs */
	public Arbre(int i) {
          // a completer
          this.id = i;
          parent = null;
          enfants = new ArrayList<>();
	}
	
	public Arbre(int i, ArrayList<Arbre> a) {
          // a completer
          this.id = i;
          parent = null;
          this.enfants = a;
	}
	
	public Arbre(int i, Arbre[] a) {
          // a completer
          this.id = i;
          parent = null;
          enfants = new ArrayList<>();
            for (Arbre a1 : a) {
                ajouteEnfant(a1);
            }
	}
	/** Fin constructeurs
     * @return  */
	
	// Une feuille n'a pas d'enfants
	public boolean estFeuille() {
            return enfants.isEmpty();
          // a completer
	}
	
	// modifier pere
	public boolean ajouteParent(Arbre p) {
            if(parent == null){
                parent = p;
                return true;
            }
            else{
                System.out.println("Parent existe deja.");
                return false;
            }
            
          // a completer
	}
	
	// Ne rien faire si a est deja un enfant
	public boolean ajouteEnfant(Arbre a) {
           if(!a.ajouteParent(this)){
               return false;
           }
           else{
               return enfants.add(a);
           }
          // a completer
	}

	public int nbEnfants() {
            return enfants.size();
          // a completer
	}
	
	// Le nombre total de noeuds
	public int size() {
            return enfants.size()+1;
          // a completer 
	}
	
	@Override
	public int compareTo(Arbre a) {
		// TODO Auto-generated method stub
		if ( id > a.id ) {
			return 1;
		}
		else if ( id < a.id ) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
