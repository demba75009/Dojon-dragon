package jeu;

public class personnage extends Couloir {
	
	public static void avancer() {
		System.out.println("vous avancez...");

		}
	public static void reculez() {
		System.out.println("vous reculez...");

		}
	
	public static void quittez() {
		System.out.println("vous quittez le chateau..");
		return;

		}
	
	public static void fuir() {
		System.out.println("vous fuiyez...");
		System.out.println("vous echappez au monstre");
		quittez();

		return;

		}
	public static void  battre() {
		System.out.println("vous vous battez..");
		System.out.println("malgr� un combat acharnez..");
		System.out.println("Vous perdez le combat...");
		System.out.println(":(");

		

		return;

		}
	

}
