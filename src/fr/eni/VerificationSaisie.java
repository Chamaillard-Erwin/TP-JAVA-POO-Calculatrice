package fr.eni;

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
        System.out.println("Saisir un opérateur : +  -  *  /");
        operateur = scan.nextLine().charAt(0);
        if (operateur == '+' || operateur =='-' || operateur =='*' || operateur =='/' || operateur =='Q') {
            return operateur;
        }
        else {
            throw new MauvaisOperateur();
        }

    }

}
