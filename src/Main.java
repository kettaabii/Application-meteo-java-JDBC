import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        int choice;
        City city = new City();
        do {
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("\t\t\t||------------|              weather App             |-----------||");
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("\t\t\t||------------|   1: Ajouter Ville                            |-----------||");
            System.out.println("\t\t\t||------------|   2: Mise a jours Ville                         |-----------||");
            System.out.println("\t\t\t||------------|   3: Supprimer Ville                         |-----------||");
            System.out.println("\t\t\t||------------|   4: Afficher toute les villes                    |-----------||");
            System.out.println("\t\t\t||------------|   5: Quitter application                    |-----------||");
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("Enter votre choix: ");
            choice = (new Scanner(System.in)).nextInt();
            switch (choice){
                case 1:
                    city.enregistrementVille ();
                    break;
                case 2:
                    city.MisdeAjours();
                break;
                case 3 :
                    city.supprimerEnregistrement();
                    break;
                default :
                    System.out.println("pocker");
            }
        }while (choice!=5);;




    }
}