package fr.zoo;

import java.util.Map;

import fr.hierarchie.*;

public class Zoo {
	
	//Le registre des animaux du zoo, il reconnait chaque animal par son nom unique et sa zone
	Map<String, Zone> registre;

	/**
	 * Cette méthode utilise el registre pour nourrir tous les animaux. 
	 * Chaque animal a les particularités qui permettent de savoir si carnivore ou herbivore
	 * donc besoin de paramètre supp
	 */
	public void nourrirTousLesAnimaux() {
		
	}
	
	/**
	 * Permet d'ajouter un animal au registre
	 * le milieu de vie en paramètre permet de savoir dans quelle zone l'animal va vivre
	 * @param newAnimal
	 * @param milieu
	 */
	public void ajouterAnimal(Animal newAnimal, MilieuDeVie milieu) {
		
	}
	
	/**
	 * Permet de changer un animal de zone 
	 * on reconnait l'animal par son nom unique
	 * on l'attribut à une nouvelle zone
	 * la méthode renvoit un message ou une exception quand l'animal ne peut être transféré dans cette zone
	 * @param animal
	 * @param newZone
	 */
	public void changerZone(String animal, Zone newZone) {
		
	}

	/**
	 * Permet de voir tous les animaux du zoo
	 * avec les caractéristiques de chacun, 
	 * ainsi que sa zone de vie dans le zoo
	 */
	@Override
	public String toString() {
		return "Zoo [registre=" + registre + "]";
	}
	
	
	
}
