package fr.unilim.iut.spaceinvaders;

public class Dimension {

	private int longueur;
	private int hauteur;
	
	public Dimension(int longueur, int hauteur) {
		this.longueur = longueur;
		this.hauteur = hauteur;
	}

	public int longueur() {
		return longueur;
	}

	public int hauteur() {
		return hauteur;
	}

}