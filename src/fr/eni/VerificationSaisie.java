package fr.eni;

import com.sun.javaws.exceptions.ExitException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificationSaisie {

    Scanner scan = new Scanner(System.in);

    public int verifierNombre() throws InputMismatchException  {
        System.out.println("Saisir un nombre entier :");
        return scan.nextInt();
    }

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
