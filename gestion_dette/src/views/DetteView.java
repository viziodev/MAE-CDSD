package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Dette;

public class DetteView {
     private static Scanner scanner =new Scanner(System.in);

     public static Dette saisieDette(){
        double montant;
        do {
              System.out.println("Entrer le montant de la Dette");
              montant=scanner.nextDouble();
        } while (montant<=0);
         return new Dette(montant);

     }

     public static void afficheDette(ArrayList<Dette> dettes){
        for (int index = 0; index < dettes.size(); index++) {
              System.out.println(dettes.get(index).toChaine());
        }
      }
}
