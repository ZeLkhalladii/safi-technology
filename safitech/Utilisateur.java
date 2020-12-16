package safitech;

public class Utilisateur extends Personne{

	private String login;
	private String password;
	private String service;
	
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
		return "Utilisateur [profile : " + getLogin() + ", motDePass : " + getPassword() + ", service : " + getService()
				+ ", getMatricule() : " + getMatricule() + ", getNom() : " + getNom() + ", getPrenom() : " + getPrenom()
				+ ", getEmail() : " + getEmail() + ", getTelephone() : " + getTele() + ", getSalaire() : " + getSalair() + " DH"
				+ "]";
	}
	

	
}
