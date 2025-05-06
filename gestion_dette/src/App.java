import java.util.Scanner;

import entity.Client;
import entity.Dette;
import entity.Payement;
import services.ClientService;
import services.DetteService;
import views.ClientView;
import views.DetteView;
import views.PayementView;



public class App {
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choix;
        do {
              choix=menu();
              switch (choix) {
                case 1:
                    Client client =ClientView.saisieClient();
                    ClientService.addClient(client);
                    break;
               case 2:
                     ClientView.afficheClient(ClientService.getClients());
                   break;
                case 3:
                     client=saisieTelAndSearchClient();
                    if(client!=null){
                      Dette dette=DetteView.saisieDette();
                      client.addDette(dette);
                      DetteService.addDette(dette);
                    }else{
                       System.out.println("Aucun Client client ne correspond a ce numero");
                    }
                    break;
                    case 4:
                       client=saisieTelAndSearchClient();
                       if(client!=null){
                          DetteView.afficheDette(client.getDettes());
                       }else{
                           System.out.println("Aucun Client client ne correspond a ce numero");
                        }   
                        break;
                    case 5:
                        client=saisieTelAndSearchClient();
                        if(client!=null){
                           System.out.println(client);
                        }else{
                            System.out.println("Aucun Client client ne correspond a ce numero");
                         }
                         break;

                        case 6:
                        Dette dette=saisieNumeroAndSearchDette();
                          if(dette!=null){
                                  Payement payement=PayementView.saisiePayement();
                                  dette.addPayement(payement); 
                          }else{
                              System.out.println("Aucune Dette   ne correspond a ce numero");
                         }
                         break;
                         case 7:
                          dette=saisieNumeroAndSearchDette();
                         if(dette!=null){
                                PayementView.affichePayement(dette.getPaiements());
                         }else{
                             System.out.println("Aucune Dette   ne correspond a ce numero");
                        }
                default:
                    break;
              }

        } while (choix!=8);
    }

    public static  int menu(){
        System.out.println(
            "1-Ajouter  un client  dans une Liste\n" + 
            "2-Afficher les Clients de Liste \n" + 
            "3-Ajouter une Dette à un client\n" + 
            "4-Lister dettes d’un client\n" + 
            "5-Lister Montant total dû Par client\n" + 
            "6-Ajouter un Paiement une Dette\n" + 
            "7-Lister les Payements d’une Dette d’un client\n" + 
            "8-Quitter");
           return scanner.nextInt();
    }

    public static Dette saisieNumeroAndSearchDette(){
        scanner.nextLine();
        String numero;
        System.out.println("Saisir le Numero de la Dette");
        numero=scanner.nextLine();
        return DetteService.searchDetteByNum(numero);
    }

    public static Client saisieTelAndSearchClient(){
        scanner.nextLine();
        String tel;
        System.out.println("Saisir le Telephone");
        tel=scanner.nextLine();
        return ClientService.searClientByTel(tel);
    }
}
