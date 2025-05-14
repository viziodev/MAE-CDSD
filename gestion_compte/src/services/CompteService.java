package services;

import java.util.ArrayList;

import entity.Compte;

public class CompteService {
    private ArrayList<Compte> comptes=new ArrayList<>();
    public ArrayList<Compte> getComptes() {
        return comptes;
    }
    public CompteService() {
        
    }
    public boolean addCompte(Compte compte){
        comptes.add(compte);
        return true;
    }

    public Compte getCompteByNum(String numero){
      for (int index = 0; index < comptes.size(); index++) {
          if (comptes.get(index).getNumero().equals(numero)) {
              return  comptes.get(index);
          }
      }
        return null;
    }





    
}
