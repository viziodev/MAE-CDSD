public class Etudiant {
    //Attributs   ==> prive
    /*
     * Les Attributs sont initialises en Java
     *   Type numeriques(entier,reeel) sont initialises a 0
     *   Objet  sont initialises a null
     *   Bolean false
     *   char  ''
     */
     private int id; //0
     private String matricule;//null ==>absence de reference
     private String nom;
     private int age;
     private String classe;

    //Methodes    ==> public
      //Constructeur
      public  Etudiant(){

      }

      //Getters
      public int getId(){
       
        return id;
      }

      //Setters 

      public void setId(int id){
          this.id=id;
      }

      public String toChaine(){
        return "ID "+id+" Nom : "+nom;
      }

      //egal()
      public boolean egal(Etudiant etudiant){
          //meme id et meme matricule
        return id==etudiant.getId();
      }

      //copy()
      public void copy(Etudiant etudiant){
          id=etudiant.getId();

      }

}
