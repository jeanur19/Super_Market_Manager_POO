package model;
//TODO : Classe à compléter par [Nom du camarade - Personne 2]
//Classe indépendante, associée à Employe (voir diagramme de classes)
//Attributs prévus :
//login : String, motDePasse : String, employe : Employe, role : String
public class Utilisateur {
	// Déclaration des champs (attributs de la classe Utilisateur)
	private String login;
	private String motDePasse;
	private Employe employe;
	private String role;
	// Constructeur d'initialisation
	public Utilisateur(String login, String motDePasse, Employe employe, String role) {
	    this.login = login;
	    this.motDePasse = motDePasse;
	    this.employe = employe;
	    this.role = role;
	}
	//Accèss et motification du login
	public String getLogin() {
		return login;
	}
	//Accèss et motification du login
	public void setLogin(String login) {
		this.login = login;
	}
	//Accèss et motification du mot de passe
	public String getMotDePasse() {
		return motDePasse;
	}
	//Accèss et motification du mot de passe
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	//Accèss et modification de l'employé associé
	public Employe getEmploye() {
		return employe;
	}
	//Accèss et modification de l'employé associé
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	//Accèss et modification du rôle
	public String getRole() {
		return role;
	}
	//Accèss et modification du rôle
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Utilisateur [login=" + login + ", motDePasse=" + motDePasse + ", employe=" + employe + ", role=" + role
				+ "]";
	}
	

}
