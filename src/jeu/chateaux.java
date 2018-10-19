package jeu;

import java.util.Scanner;

public class chateaux extends personnage {
	
	public static void play() {
	int reponse;
	int reponse2;
	int reponse3;
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
	    int reponse4;
	    int reponse5;
	    
	    
	    Scanner sc1 = new Scanner (System.in);
		reponse1 = sc.nextInt();
		//si il choisi la pièce 1
		if (reponse1 == 1)
		 {

		  avancer();
		  piece1();
		  //on lui demande si il veut voir une autre piece
		  System.out.println("voulez vous visitez une autre piece:\n\t\t\t\tTappez 1: Oui\tTappez 2: Non ");
		  Scanner sc4 = new Scanner (System.in);
		  reponse4 = sc.nextInt();
		  
		  if(reponse4 == 1) {
		  System.out.println("vous etes dans le couloir... ");
		  System.out.println("Dans quelle piece voulez vous allez?");
		  System.out.println("\t\t\t\t\t\t Tappez 1: piece 2  \tTappez 2 :piece 3 "); 
		  Scanner sc5 = new Scanner (System.in);
		  reponse5 = sc.nextInt();
		  //si l'utilisateur veut allez dans la piece n°2 apres avoir visiter la piece n°1
		  if (reponse5 == 1)
		  {
			  avancer();
			  piece2();		  
			  reculez();
			  System.out.println("vous etes dans le couloir... ");
			  System.out.println("voulez vous allez dans la piece 3?\n\n\t\t\t\tTappez 1: Oui\tTappez 2: Non");
			  int reponse6;
			  Scanner sc6 = new Scanner (System.in);		  
			  reponse6 = sc.nextInt();
			  //si il veut allez dans la piece n°3 apres avoir visiter la piece n°2
			  if(reponse6 == 1)
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
			  //si il ne veut pa allez dans la piece n°3 apres avoir visiter la piece n°2
			  if(reponse6 == 2)
			  {
			     System.out.println("félicitation !!! Vous repartez avec un trésor :)");

			    quittez();
			  			
	           }
			  
		  }	  
		  //si il ne veut pa allez dans la piece n°3 apres avoir visiter la piece n°1
		  
			if (reponse5 == 2)
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
			 
		  
			//si il ne veut pas visiter une autre piece
		  if(reponse4 == 2)
		  System.out.println("félicitation !!! Vous repartez avec un trésor :)");

		  quittez();			
		 }

	
		
	//si il choisi la pièce 2
	if (reponse1 == 2)
 {

		  avancer();
		  piece2();		  
		  reculez();
		  System.out.println("vous etes dans le couloir... ");
		  System.out.println("Dans quelle piece voulez vous allez?");
		  System.out.println("\t\t\t\t\t\t Tappez 1: piece 1  \t Tappez 2: piece 3 ");
		  Scanner sc3 = new Scanner (System.in);
			reponse3 = sc.nextInt();
			 //si il veut dans  la piece n°1
			if (reponse3 == 1)
			 {

			  avancer();
			  piece1();
			  quittez();

				
			 }
			 //si il veut dans  la piece n°3

			if (reponse3 == 2)
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



