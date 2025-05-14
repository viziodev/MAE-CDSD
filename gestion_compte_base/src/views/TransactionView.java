package views;

import java.util.Scanner;

import entity.Transaction;
import entity.TypeTransaction;

public class TransactionView {
     private Scanner scanner=new Scanner(System.in) ;

     public  Transaction saisieTransaction(){
        Transaction transaction=new Transaction();
        //TODO : Generer Id et Numero
         double montant;
         do {
               System.out.println("Entrer le Montant de la  Transaction"); 
               montant =scanner.nextDouble();
          } while (montant<=0);
          TypeTransaction typeTransaction=saisieTypeTransaction();
           transaction.setType(typeTransaction);
           transaction.setMontant(montant);
         return transaction;
     }

     public TypeTransaction saisieTypeTransaction(){
          int type;
          do {
               System.out.println("1-Retrait"); 
               System.out.println("2-Depot"); 
               type=scanner.nextInt(); 
          } while (type!=1 && type!=2);
          return  type==1?TypeTransaction.RETRAIT:TypeTransaction.DEPOT;

     }

     public void  afficheTransaction(Transaction[] transactions,int nbreTransaction){
       for (int index = 0; index < nbreTransaction; index++) {
            System.out.println(transactions[index].toChaine());
       }
     }


}
