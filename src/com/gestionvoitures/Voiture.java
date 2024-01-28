package com.gestionvoitures;

public class Voiture {
	final String marque;
    String modele;
    int annee;
    int vitesseMax;
    private static int nombreDeVoitures = 0;


    // Constructeur pour Voiture
    public Voiture(String marque, String modele, int annee, int vitesseMax) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.vitesseMax = vitesseMax;
        nombreDeVoitures++;
    }
    
    public static int getNombreDeVoitures() {
    	return nombreDeVoitures;
    }
    
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
    public static void comparerVitesse(Voiture voiture1, Voiture voiture2) {
        if (voiture1.vitesseMax > voiture2.vitesseMax) {
            System.out.println("\n" + voiture1.marque + " " + voiture1.modele + " est plus rapide.");
        } else if (voiture2.vitesseMax > voiture1.vitesseMax) {
            System.out.println("\n" + voiture2.marque + " " + voiture2.modele + " est plus rapide.");
        } else {
            System.out.println("\n" + "Les deux voitures ont la même vitesse maximale.");
        }
    }
    
    public void showVoiture() {
    	System.out.println(this.marque + " " + this.modele + " " + this.annee + " " + this.vitesseMax + "km/h");
    }
}

