package fr.hierarchie;

public abstract class Animal {
	
	private String nom;
	private String prenom;
	private String espece;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the espece
	 */
	public String getEspece() {
		return espece;
	}
	/**
	 * @param espece the espece to set
	 */
	public void setEspece(String espece) {
		this.espece = espece;
	}
	
	
}
