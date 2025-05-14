package services;

import java.util.ArrayList;

import entity.Figure;
import entity.TypeFigure;

public class FigureService {
    ArrayList<Figure> figures =new ArrayList<>();

    public ArrayList<Figure> listeFigures() {
        return figures;
    }

    public ArrayList<Figure> listeFigures(TypeFigure typeFigure) {
         ArrayList<Figure> figuresParType=new ArrayList<>();
        for (int index = 0; index < figures.size(); index++) {
               if (figures.get(index).getType()==typeFigure) {
                figuresParType.add(figures.get(index));
               }
        }
        return figuresParType;
    }

    public void creerFigure(Figure figure){
          figures.add(figure);
    }

    
    
}
