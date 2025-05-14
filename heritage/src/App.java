
import java.util.Scanner;

import entity.Figure;
import entity.TypeFigure;
import services.FigureService;
import view.FigureView;



public class App {
        private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choix;
        FigureService figureService=new FigureService();
        do {
            choix=menu();
            
          switch (choix) {
            case 1:
              Figure fig= FigureView.saisieFigure();
              figureService.creerFigure(fig);
              break;
            case 2:
            FigureView.AfficheFigure(figureService.listeFigures());  
                break;
            case 3:
            int type;
             do {
                System.out.println("0-Carre");
                System.out.println("1-Rectangle");
                type=scanner.nextInt();
             } while (type!=0&& type!=1);
             TypeFigure typeFigure=type==0?TypeFigure.CARRE:TypeFigure.RECTANGLE;
             FigureView.AfficheFigure(figureService.listeFigures(typeFigure));
            default:
                break;
          }
            
        } while (choix!=4);
    
        
    }

    public static int menu(){
            System.out.println("1-Creer Figure");
            System.out.println("2-Lister Figure ");
            System.out.println("3-Lister Figure Par Type ");
            System.out.println("4-Quitter ");
            return scanner.nextInt();
    
    }
}
