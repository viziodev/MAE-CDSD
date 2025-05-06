package services;

import java.util.ArrayList;

import entity.Dette;

public class DetteService {
    private static ArrayList<Dette> dettes=new ArrayList<>();
    private DetteService() {

    }
    public static ArrayList<Dette> getDettes() {
      return dettes;
    }
    public static void addDette(Dette dette){ 
          dettes.add(dette);
    }

    public static Dette searchDetteByNum(String numero){  
            for (int index1 = 0; index1 < dettes.size(); index1++) {
                if (dettes.get(index1).getNumero().equals(numero)) {
                    return dettes.get(index1);
                }
            }   
    
        return null;
    }
}
