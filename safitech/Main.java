package safitech;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		int choice;
		boolean Quit = false;
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Utilisateur> Userlist = new ArrayList<Utilisateur>();
		ArrayList<Utilisateur> Managerlist = new ArrayList<Utilisateur>();

		while(Quit != true) {
			System.out.println("1- utilisateurs");
			System.out.println("2- profiles");
			System.out.println("3- manager");
			
			choice = scanner.nextInt();

			switch(choice) {
				case 1:
					System.out.println("1- ajouter un utilisateur");
					System.out.println("2- afficher tous les utilisateurs");
					System.out.println("3- annuler");
					
					int	SelectUser = scanner.nextInt();

				int SelectProfile;
				switch(SelectUser) {
						case 1:
							Utilisateur utilisateur = new Utilisateur();
							
							
							System.out.println("entrer votre profile: ");
							System.out.println("1- Chef de projet (CP): ");
							System.out.println("2- Manager (MN): ");
							System.out.println("3- Directeur de projet (DP): ");
							System.out.println("4- Directeur des ressources humaines (DRH): ");
							System.out.println("5- Directeur général (DG): ");
							
							SelectProfile = scanner.nextInt();
							
							switch(SelectProfile) {
								case 1:
									utilisateur.setLogin("CP");
								break;
								
								case 2:
									utilisateur.setLogin("MN");
								break;
								
								case 3:
									utilisateur.setLogin("DP");
								break;
								
								case 4:
									utilisateur.setLogin("DHR");
								break;
								
								case 5:
									utilisateur.setLogin("DG");
								break;
								
							}
							
							System.out.println("entrer votre mot de passe");
							String password = scanner.next();
							utilisateur.setPassword(password);

							System.out.println("entrer votre service");
							String service = scanner.next();
							utilisateur.setService(service);
							
							System.out.println("entrer votre matrucile");
							String matrucile = scanner.next();
							utilisateur.setMatricule(matrucile);
							
							System.out.println("entrer votre nom");
							String nom = scanner.next();
							utilisateur.setNom(nom);
							
							System.out.println("entrer votre prenom");
							String prenom = scanner.next();
							utilisateur.setPrenom(prenom);
							
							System.out.println("entrer votre email");
							String email = scanner.next();
							utilisateur.setEmail(email);
							
							System.out.println("entrer votre numero de telephone");
							int tele = scanner.nextInt();
							utilisateur.setTele(tele);
							
							System.out.println("entrer votre salair");
							double salair = scanner.nextDouble();
							utilisateur.setSalair(salair);

							if(utilisateur.getLogin().contains("MN")) {
								salair = utilisateur.getSalair() + utilisateur.getSalair() * 0.08;
								utilisateur.setSalair(salair);
								
								Managerlist.add(utilisateur);
							}
							else if(utilisateur.getLogin().contains("DG")) {
								salair = utilisateur.getSalair() + utilisateur.getSalair() * 0.15;
								utilisateur.setSalair(salair);
							}

							Userlist.add(utilisateur);
						break;
						
						case 2:
							for(Utilisateur object:Userlist) {
								System.out.println(object.affiche());
							}
						break;
						
						case 3:
							
						break;
					}
					
				break;
				
				case 2:
					System.out.println("tous les profiles\n");
				break;
				
				case 3:
					for(Utilisateur object:Managerlist) {
						System.out.println(object.affiche());
					}
				break;
			}
			
			}
		scanner.close();
		}

}
