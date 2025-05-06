package statics;

import java.time.LocalDate;

public class App {
   public static void main(String[] args) {
     // Membre membre1=new Membre();
         //of(builder) permet de creer un objet de la classe
          Membre membre1 =Membre.of();
           membre1.setPrenom("Hawa");
            membre1.setAge(10);
          Membre membre2= Membre.of();
         membre2.setPrenom("Mouhamed");
         membre2.setAge(3);


      Membre.setNom("Wane");
      System.out.println(membre1);
      System.out.println(membre2);



    
   } 
}
