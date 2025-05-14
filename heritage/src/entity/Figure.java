package entity;
//public class NomClasse ==> public class NomClasse extends Object 
public abstract class Figure {
    protected double diagonale;
    protected TypeFigure type;
    
    public TypeFigure getType() {
        return type;
    }
    public abstract double perimetre();
    protected Figure() {
      
    }
    public final double getDiagonale() {
        return diagonale;
    }
    @Override
    public String toString() {
        return "diagonale=" + diagonale ;
        
    }

}
