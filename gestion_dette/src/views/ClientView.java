package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Client;
import services.ClientService;

public class ClientView {
    
      private static Scanner scanner =new Scanner(System.in);

      private ClientView(){

      }
      public static Client saisieClient(){
          Client client=new Client();
          System.out.println("Saisir le nom");
          client.setNom(scanner.nextLine());
          String tel;
         do {
            System.out.println("Saisir le Telephone");
            tel=scanner.nextLine();
         } while (ClientService.searClientByTel(tel)!=null);
          client.setTelephone(tel);
          System.out.println("Saisir l'adresse");
          client.setAdresse(scanner.nextLine());

          return client;
      }

      public static void afficheClient(ArrayList<Client> clients){
        for (int index = 0; index < clients.size(); index++) {
              System.out.println(clients.get(index).toChaine());
        }
      }
}
