package com.gestionvoitures;

public class Garage {
    private Voiture[] voitures;
    private int capacite;
    private int nombreDeVoitures;

    public Garage(int capacite) {
        this.capacite = capacite;
        voitures = new Voiture[capacite];
        nombreDeVoitures = 0;
    }

    public void ajouterVoiture(Voiture voiture) {
        if (nombreDeVoitures < capacite) {
            voitures[nombreDeVoitures] = voiture;
            nombreDeVoitures++;
        } else {
            System.out.println("Garage plein. Impossible d'ajouter plus de voitures.");
        }
    }

    public void retirerVoiture(Voiture voiture) {
        int indexToRemove = -1;

        // Trouver l'index de la voiture à retirer
        for (int i = 0; i < nombreDeVoitures; i++) {
            if (voitures[i].equals(voiture)) {
                indexToRemove = i;
                break;
            }
        }

        // Déplacer manuellement les voitures suivantes vers la gauche
        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < nombreDeVoitures - 1; i++) {
                voitures[i] = voitures[i + 1];
            }

            // Mettre à null la dernière position occupée
            voitures[nombreDeVoitures - 1] = null;

            // Décrémenter le nombre de voitures
            nombreDeVoitures--;
        }
    }

    public void afficherVoitures() {
        for (int i = 0; i < nombreDeVoitures; i++) {
            if (voitures[i] != null) {
            	voitures[i].showVoiture();
            }
        }
    }
}
