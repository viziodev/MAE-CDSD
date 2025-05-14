package view;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Carre;
import entity.Figure;
import entity.Rectangle;

public class FigureView {
    private static Scanner scanner=new Scanner(System.in);

    private FigureView(){

    }

    public static Figure saisieFigure(){
         Figure figure;
        int choix=0;

        do {
               System.out.println("0-Carre");
               System.out.println("1-Rectangle");
               choix=scanner.nextInt();
        } while (choix!=0&& choix!=1);

        if (choix==0) {
                System.out.println("Entrer le cote du Carre");
                double cote=scanner.nextDouble();
                figure=new Carre(cote);
        }else{
            System.out.println("Entrer la longueur du Rectangle");
            double longueur=scanner.nextDouble();
            double largeur=scanner.nextDouble();
            figure=new Rectangle(longueur,largeur);
        }

         return  figure;
    }

      public static void AfficheFigure(ArrayList<Figure> figures ){
                for (int index = 0; index < figures.size(); index++) {
                     System.out.println(figures.get(index).toString());
                }
     }
}

