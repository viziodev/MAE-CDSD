package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Payement;


public class PayementView {
     private static Scanner scanner =new Scanner(System.in);
     private PayementView(){

     }
     public static Payement saisiePayement(){
        double montant;
        do {
              System.out.println("Entrer le montant du Paiement");
              montant=scanner.nextDouble();
        } while (montant<=0);
         return new Payement(montant);
     }

     public static void affichePayement(ArrayList<Payement> payements){
        for (int index = 0; index < payements.size(); index++) {
              System.out.println(payements.get(index).toChaine());
        }
      }
}
