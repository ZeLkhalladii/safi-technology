package safitech;

public class Utilisateur extends Personne{

	private String login;
	private String password;
	private String service;
	private String profil;
	//getters and setters 
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	
	
	public String affiche() {
		return "Utilisateur [ mote De Passe : " + getPassword() + ", service : " + getService()
				+ ", Matricule() : " + getMatricule() + ", Nom : " + getNom() + ", Prenom() : " + getPrenom()
				+ ", Email() : " + getEmail() + ", Telephone() : " + getTele() + ", Salaire() : " + getSalair() + " DH"
				+ "]";
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	

	
}
