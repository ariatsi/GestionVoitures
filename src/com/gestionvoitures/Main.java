package com.gestionvoitures;

public class Main {

	public static void main(String[] args) {
		
        Garage garage = new Garage(5);

        Voiture voiture1 = new Voiture("Toyota", "Corolla", 2020, 180);
        Voiture voiture2 = new Voiture("Honda", "Civic", 2021, 200);

        garage.ajouterVoiture(voiture1);
        garage.ajouterVoiture(voiture2);

        System.out.println("Voitures dans le garage:");
        garage.afficherVoitures();
        
        Voiture.comparerVitesse(voiture1, voiture2);

        // Tentative de modification de la marque (devrait générer une erreur)
        // voiture1.marque = "Ford"; // Ceci devrait générer une erreur de compilation

        garage.retirerVoiture(voiture1);

        System.out.println("\nAprès retrait d'une voiture:");
        garage.afficherVoitures();
        
	}

}
