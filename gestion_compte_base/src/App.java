import java.util.Scanner;

import entity.Compte;
import entity.Transaction;
import services.CompteService;
import views.CompteView;
import views.MenuOption;
import views.TransactionView;
import views.translation.fr.MenuMessage;
import views.translation.fr.TransactionMessage;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner=new Scanner(System.in) ;
         CompteView compteView=new CompteView();
         TransactionView transactionView=new TransactionView();
         CompteService compteService =new CompteService();
         int choix;
         MenuOption menu;
        do {
                 MenuMessage[] menuMessages =MenuMessage.values();
                 for (int index = 0; index < menuMessages.length; index++) {
                      System.out.println(menuMessages[index].getMessage());
                 }
             choix=scanner.nextInt();
            //Convertir choix(int ) ==> MenuOption(enum)
            menu = MenuOption.getEnumWithValue(choix);
            switch (menu) {
                case ADD_COMPTE:
                   //Saisie du Compte
                    Compte compte=compteView.saisieCompte();
                   //Ajout du Compte
                   if(compteService.addCompte(compte)){
                      //TODO: Ajouter une Transaction de Depot qui correspond au solde du compte
                       System.out.println("Compte a ete ajoute avec succes");
                   }else{
                        System.out.println("Le Tableau est Rempli");
                   }
                    break;
                case SHOW_COMPTE:
                    compteView.afficheCompte(compteService.getComptes(), compteService.getNbreCompte());
                    break;
                case ADD_TRANSACTION_COMPTE:
                   //1-Rechercher le Compte
                     System.out.println("Entrer le numero du compte recherche");
                     String num=scanner.next();
                     compte=compteService.getCompteByNum(num);
                     if (compte==null) {
                          System.out.println("Aucun compte correspond a ce numero");
                     }else{
                           //2-Ajouter la transaction  si le compte existe
                          //saisie la Transaction
                            Transaction transaction=transactionView.saisieTransaction();
                          //Ajouter la Transaction au compte
                           TransactionMessage transactionMessage=  compte.addTransaction(transaction);
                          System.out.println(transactionMessage.getMessage());
                     }

                  
                break;
                case SHOW_TRANSACTION_COMPTE :
                  //1-Rechercher le Compte
                    System.out.println("Entrer le numero du compte recherche");
                    num=scanner.next();
                   compte=compteService.getCompteByNum(num);
                    if (compte==null) {
                       System.out.println("Aucun compte correspond a ce numero");
                    }else{
                          //2-si le compte existe alors on affiche ses transaction
                          transactionView.afficheTransaction(compte.getTransactions(), compte.getNbreTransaction());
                     }

                 
                break;
                default:
                    break;
            }
        } while (menu!=MenuOption.QUITER);
    }
}
