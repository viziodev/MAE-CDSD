package entity;

public class Rectangle extends Figure {
     private double longueur;
     private double largeur;
     public Rectangle(double longueur, double largeur) {
        type=TypeFigure.RECTANGLE;
        this.longueur = longueur;
        this.largeur = largeur;
        super.diagonale=Math.sqrt(Math.pow(longueur,2.0)+Math.pow(largeur,2.0));
    }


     public Rectangle() {
        super();
        type=TypeFigure.RECTANGLE;
     }

     
     public double getLongueur() {
         return longueur;
     }
     public void setLongueur(double longueur) {
         this.longueur = longueur;
     }
     public double getLargeur() {
         return largeur;
     }
     public void setLargeur(double largeur) {
         this.largeur = largeur;
     }
     @Override
     public String toString() {
        return "Rectangle ["+super.toString() + ", longueur=" + longueur + ", largeur=" + largeur + "]";
     }


     @Override
     public double perimetre() {
        return 2*(longueur+largeur);
     }
}
