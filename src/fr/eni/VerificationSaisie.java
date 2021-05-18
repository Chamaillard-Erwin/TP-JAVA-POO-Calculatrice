/**
 * Classe contenant les vérifications des saisie de l'utilisateur
 */

package fr.eni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificationSaisie {

    Scanner scan = new Scanner(System.in);

    /**
     * Méthode permettant de retourner un int saisie par l'utilisateur
     * et de contrôler également que c'est bien un Int et que la taille soit respecté
     * @return
     * @throws InputMismatchException
     */
    public int verifierNombre() throws InputMismatchException  {
        System.out.println("Saisir un nombre entier :");
        return scan.nextInt();
    }

    /**
     * Vérifie que l'opérateur soit bien dans la liste
     * @return
     * @throws MauvaisOperateur
     */
    public char verifierOperateur() throws MauvaisOperateur {
        char operateur;
        System.out.println("Saisir un opérateur : +  -  *  / % ou 'Q' pour quitter");
        operateur = scan.nextLine().charAt(0);
        if (operateur == '+' || operateur =='-' || operateur =='*' || operateur =='/' || operateur == '%' || operateur == 'Q' || operateur == 'q') {
            return operateur;
        }
        else {
            throw new MauvaisOperateur();
        }
    }

    /**
     * Méthode permettant de vérifier que l'opérateur corresponde bien à l'arrêt de l'application
     * @param operateur
     * @return
     * @throws SortieException
     */
    public char verifierExit(char operateur) throws SortieException {
        if (operateur == 'Q' || operateur == 'q') {
            operateur = 'Q';
            throw new SortieException();
        }
        else {
            return operateur;
        }
    }

}
