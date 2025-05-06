package services;
import java.util.ArrayList;
import entity.Client;
import entity.Dette;

public class ClientService {
    private static ArrayList<Client> clients=new ArrayList<>();
    private ClientService(){

    }
    public static ArrayList<Client> getClients() {
        return clients;
    }

    public static void addClient(Client client){
         clients.add(client);
    }

    public static Client searClientByTel(String telephone){
        for (int index = 0; index <clients.size(); index++) {
               if (clients.get(index).getTelephone().equals(telephone)) {
                   return clients.get(index);
               }
        }
        return null;
   }

   public static Dette searchDetteByNum(String numero){
    for (int index = 0; index <clients.size(); index++) {
            ArrayList<Dette> dettesUnClient =clients.get(index).getDettes();
            int nbreDetteUnClient=dettesUnClient.size();
        for (int index1 = 0; index1 < nbreDetteUnClient; index1++) {
            if (dettesUnClient.get(index1).getNumero().equals(numero)) {
                return dettesUnClient.get(index1);
            }
        }   
    }
    return null;
}
}
