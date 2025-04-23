import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
      Etudiant etudiant; 
      etudiant=new Etudiant();
      etudiant.setId(1);
      Etudiant etudiant3=new Etudiant();
      etudiant3.copy(etudiant);
      etudiant3.setId(7);
      System.out.println("Etudiant Id: "+ etudiant.toChaine());
      System.out.println("Etudiant3 Id: "+ etudiant3.toChaine());
      Etudiant etudiant2=new Etudiant();
      etudiant2.setId(1);

      System.out.println("zone de valeur" +etudiant.egal(etudiant2)); //Zone de valeur
      System.out.println("Zone de reference"+(etudiant==etudiant3)); //Zone de reference


        Scanner scanner =new Scanner(System.in);
        int choix ;
    do {
        System.out.println("Que souhaitez-vous faire ?");
        System.out.println("1. Saisir un etudiant");
        System.out.println("2. Afficher un Etudiant");
        System.out.println("3. Ajouter une note à un etudiant");
        System.out.println("4. Afficher les  notes  un etudiant ");
        System.out.println("5. Quitter");
        System.out.println(" Veuillez entrer votre choix");
         choix =scanner.nextInt();
        
      /*  
         if (choix==1) {
              System.out.println("Ajouter un etudiant");
         }else if(choix==2){
            System.out.println("Afficher les Etudiant");
         }
        */
        switch (choix) {
            case 1:
                 System.out.println(" un etudiant");
                break;
            case 2:
                   System.out.println("Afficher les Etudiant");
                break;
            default:
                break;
        }
    } while (choix!=5);
    
    }

}
