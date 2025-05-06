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

   private static Scanner scanner=new Scanner(System.in) ;
    public static void main(String[] args) throws Exception {
         MenuOption choix;
        do {
                choix=menu();
               switch (choix) {
                case ADD_COMPTE:
                   //Saisie du Compte
                    Compte compte=CompteView.saisieCompte();
                   //Ajout du Compte
                   if(CompteService.addCompte(compte)){
                      //TODO: Ajouter une Transaction de Depot qui correspond au solde du compte
                       System.out.println("Compte a ete ajoute avec succes");
                   }else{
                        System.out.println("Le Tableau est Rempli");
                   }
                    break;
                case SHOW_COMPTE:
                CompteView.afficheCompte(CompteService.getComptes(), CompteService.getNbreCompte());
                    break;
                case ADD_TRANSACTION_COMPTE:
                   //1-Rechercher le Compte
                     System.out.println("Entrer le numero du compte recherche");
                     String num=scanner.next();
                     compte=CompteService.getCompteByNum(num);
                     if (compte==null) {
                          System.out.println("Aucun compte correspond a ce numero");
                     }else{
                           //2-Ajouter la transaction  si le compte existe
                          //saisie la Transaction
                            Transaction transaction=TransactionView.saisieTransaction();
                          //Ajouter la Transaction au compte
                           TransactionMessage transactionMessage=  compte.addTransaction(transaction);
                          System.out.println(transactionMessage.getMessage());
                     }

                  
                break;
                case SHOW_TRANSACTION_COMPTE :
                  //1-Rechercher le Compte
                    System.out.println("Entrer le numero du compte recherche");
                    num=scanner.next();
                   compte=CompteService.getCompteByNum(num);
                    if (compte==null) {
                       System.out.println("Aucun compte correspond a ce numero");
                    }else{
                          //2-si le compte existe alors on affiche ses transaction
                          TransactionView.afficheTransaction(compte.getTransactions(), compte.getNbreTransaction());
                     }

                 
                break;
                default:
                    break;
            }
        } while (choix!=MenuOption.QUITER);
    }

    public static  MenuOption menu(){
        MenuMessage[] menuMessages =MenuMessage.values();
        for (int index = 0; index < menuMessages.length; index++) {
             System.out.println(menuMessages[index].getMessage());
        }
        int choix=scanner.nextInt();
   //Convertir choix(int ) ==> MenuOption(enum)
       return MenuOption.getEnumWithValue(choix);
    }
}
