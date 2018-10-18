package jeu;

import java.util.Scanner;

public class chateaux extends personnage {
	
	public static void play() {
	int reponse;
	int reponse2;
	choix();
	Scanner sc = new Scanner (System.in);
	reponse = sc.nextInt();
	//si il veut avancer
	if (reponse == 1)
 {

	  avancer();
	  //on demande à l'utilisateur de choisir entre 3 pièces
	  choix1();
	    int reponse1;
	    Scanner sc1 = new Scanner (System.in);
		reponse1 = sc.nextInt();
		//si il choisi la pièce 1
		if (reponse1 == 1)
		 {

		  avancer();
		  piece1();
		  quittez();

			
		 }
		//si il choisi la pièce 2

		if (reponse1 == 2)
		  {

		  avancer();
		  piece2();
		  
		  reculez();
			
		  
		  }
		//si il choisi la pièce 3

		if (reponse1 == 3)
		  {

		  avancer();
		  piece3();	
		  Scanner sc2 = new Scanner (System.in);
			reponse2 = sc.nextInt();
		  if(reponse2 == 1)
		    
			  fuir();
		  
		  
		if(reponse2 == 2)
		
			  battre();
		  
		
		
  }

		


}
	 //Si il choisi de quittez le chateau
	 if (reponse == 2)
	 {

		  quittez();
		  return;

	  }
}

}



