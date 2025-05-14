package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Cheque;
import entity.Compte;
import entity.Epargne;

public class CompteView {
     private  Scanner scanner=new Scanner(System.in) ;
     public CompteView(){

     }
     public   Compte saisieCompte(){
        Compte compte;
        double solde;
         do {
               System.out.println("Entrer le Solde du Compte"); 
               solde =scanner.nextDouble();
         } while (solde<=0);
        int type;
         do {
             System.out.println("0-CHEQUE");
             System.out.println("1-EPARGNE");
             type= scanner.nextInt();
         } while (type!=0 && type!=1);

         if (type==0) {
             
              compte=new Cheque(solde);
           }else{
               int duree;
               do {
                     System.out.println("Entrer la duree de blocage du Compte"); 
                     duree =scanner.nextInt();
               } while (duree<=0);
               compte=new Epargne(solde, duree);
          }
    
         return compte;
     }

     public void  afficheCompte(ArrayList<Compte> comptes){
       for (int index = 0; index < comptes.size(); index++) {
            System.out.println(comptes.get(index));
       }
     }


}
