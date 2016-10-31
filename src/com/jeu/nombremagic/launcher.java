package com.jeu.nombremagic;

import java.util.Random;
import java.util.Scanner;
import java.util.*;


public class launcher {

	public launcher() {
		// TODO Auto-generated constructor stub
	}
	
	

	// Fonction de generation du nombre aléatoire
	public static int between(int minValue, int maxValue) {
        Random randGen = new Random();
        int max = maxValue - minValue + 1;
        int randNum = randGen.nextInt(max);
        randNum += minValue;
        return randNum;
    }
	
	
	public static void main(String[] args) {
		// Declaration de variable
		int nombreSaisie;
		int nombreGenerer;
		int nombreEssaie;
		
		// Declaration des variables pour le chronomettre 
		long tempsDebut = 0 ; 
		long tempsFin = 0;
		long tempsPartie = 0; 
		
		//recuperation du nombre generer
		nombreGenerer = between(0, 100);
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		System.out.println("--------Bienvenue dans le jeu Nombre Magic-------------");
		System.out.println("-------------------------------------------------------");
		
		//debut du chronomettre 
		tempsDebut = System.currentTimeMillis() ; 
		
		//initialisation du nombre d'essaie
		nombreEssaie = 0;
		
		
		do{
			System.out.println("chiffre generer" + nombreGenerer);
			// saisie du chiffre par le joueur
			System.out.println("Veuillez saisir un chiffre");
			nombreSaisie = sc.nextInt();
			
			
			// comptage du nombre d'essaie
			nombreEssaie++;
			
			// Comparaison du chiffre saisie avec la valeur générée
			if(nombreSaisie < nombreGenerer){
				System.out.println("le chiffre que vous avez saisie est inferieur a la vraie valeur");
			}else if (nombreSaisie > nombreGenerer){
				System.out.println("le chiffre que vous avez saisie est supérieur a la vraie valeur");
			}else{
				System.out.println("Bravo, vous avez gagné la partie !!!");
				
				//arret du chronomettre 
				tempsFin = System.currentTimeMillis() ; 
				tempsPartie = (tempsFin - tempsDebut)/1000; 
				
				//affichage du resumé de la partie
				System.out.println(" ");
				System.out.println("-------------------------------------");
				System.out.println("-------- Resumé de la partie --------");
				System.out.println("-------------------------------------");
				
				System.out.println("Nombre d'essaie: "+nombreEssaie);
				System.out.println("Durée de la partie: " +tempsPartie);
				
				System.out.println("-------------------------------------");
			}
			
		}while (nombreSaisie != nombreGenerer );
		
		
		
		
	}

}
