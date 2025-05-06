package statics;

public class Membre {
   //prenom
   private String prenom;
   //nom
   private static String nom;
   //age   
   private  int age;
   //nbreMembre
   private static int nbreMembre;


    private Membre() {
      nbreMembre++;
    }

    public static Membre of(){
        return new Membre();
    }
   public String getPrenom() {
    return prenom;
   }
   public void setPrenom(String prenom) {
    this.prenom = prenom;
   }
   public static String getNom() {
       return nom;
   }
   public static void setNom(String nom) {
       Membre.nom = nom;
   }
   public int getAge() {
    return age;
   }
   public void setAge(int age) {
    this.age = age;
   }
   public static int getNbreMembre() {
    return nbreMembre;
   }
   public static void setNbreMembre(int nbreMembre) {
    Membre.nbreMembre = nbreMembre;
   }
   @Override
   public String toString() {
    return "Membre [prenom=" + prenom + ", age=" + age + ", Nom=" + nom + "]";
   }

   
}
