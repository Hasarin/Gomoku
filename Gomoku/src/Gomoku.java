import gui.GomokuController;
import gui.Menu;
import gui.View;
import jeu.Couleur;
import jeu.Joueurs;

public class Gomoku {
   public static void main(String[] args) {

     
      Joueurs joueur1 = new Joueurs(Couleur.Blanc);
      Joueurs joueur2 = new Joueurs(Couleur.Noir);

      Menu menu = new Menu();
      //GomokuController controller = new GomokuController(joueur1, joueur2, menu);

     // controller.updateView();

     
   }

}