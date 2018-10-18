package jeu;
import java.util.Scanner;

public class main extends chateaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char reponse = ' '; 
do {
		System.out.println("Bienvenu dans mon chateau");
play();
//on demande a l'utilisateur si il veut rejouer .
do{
	    System.out.println("Voulez-vous rejouer ? (O/N)");
	    Scanner sc = new Scanner (System.in);
	    reponse = sc.nextLine().charAt(0);
	  }while(reponse != 'N' && reponse != 'O');      
	}while (reponse == 'O');

  System.out.println("Au revoir !");

}
		
}


