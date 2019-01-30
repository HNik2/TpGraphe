/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpgraphe;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author NIK
 */
public class Graphe {
    private int nbNoeud;
    protected int nbNoeuds;
	protected ArrayList<Noeud> noeuds;
	
	public Graphe() {
    //a completer
            noeuds = new ArrayList<>();
	}
	
	public Graphe(Noeud[] nds) {
    //a completer
            this.noeuds = new ArrayList<>(Arrays.asList(nds));
            this.nbNoeuds = noeuds.size();
	}
	
	
	public void affiche() {
    //a completer
	}
}
