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
		System.out.println("vous fuyez...");
		System.out.println("vous echappez au monstre");
		quittez();
		System.out.println(":)");


		return;

		}
	public static void  battre() {
		System.out.println("vous vous battez..");
		System.out.println("malgré un combat acharnez..");
		
		System.out.println("Vous perdez le combat...");
		System.out.println("le monstre vous devore tout cru ");
		System.out.println(":(");

		

		return;

		}
	

}
