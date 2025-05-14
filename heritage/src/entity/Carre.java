package entity;

public  class Carre extends Figure  {

    /*
     * Lorsqu'une classe fille herire d'une methode abstract, elle a deux options
     *   1- De ne pas redefinir les methodes abstract et alors elle devient abstract
     *   2-Redefnir les methodes abstracts c'est a dire les rendre concrete
     */
    //super  ==> Objet Figure
    private double cote;

    public Carre(double cote) {
        super(); //new Figure()
        this.cote = cote;
        super.diagonale=Math.sqrt(2*cote*cote);
        type=TypeFigure.CARRE;
    }

    public Carre() {
        super();  //new Figure()
        type=TypeFigure.CARRE;
     }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    

    @Override
    public String toString() {
        return "Carre [cote=" + this.cote + ", getDiagonale()=" + this.diagonale + "]";
    }

    @Override
    public double perimetre() {
        return cote*4;
    }

   
    
    
}
