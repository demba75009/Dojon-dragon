package jeu;
import java.util.Scanner;

public class main extends chateaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char reponse = ' '; 
		
	//on lance le jeu	
do {
	  System.out.println ("\t\t\t-------------------Bienvenue dans Dojon et Dragon------------------- :" );

  System.out.println("\n\t\t\t\t\tBienvenue dans mon chateau : \n");
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


