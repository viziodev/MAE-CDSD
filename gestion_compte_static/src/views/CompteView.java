package views;

import java.util.Scanner;

import entity.Compte;

public class CompteView {

     private CompteView(){

     }
     private static Scanner scanner=new Scanner(System.in) ;
     public static  Compte saisieCompte(){
        Compte compte=new Compte();
        double solde;
         do {
               System.out.println("Entrer le Solde du Compte"); 
               solde =scanner.nextDouble();
         } while (solde<=0);
         compte.setSolde(solde);
         return compte;
     }

     public static void  afficheCompte(Compte[] comptes,int nbreCompte){
       for (int index = 0; index < nbreCompte; index++) {
            System.out.println(comptes[index].toChaine());
       }
     }


}
