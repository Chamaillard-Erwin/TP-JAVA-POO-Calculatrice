package fr.eni;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.eni.VerificationSaisie;
import fr.eni.Operation;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a =0;
        int b =0;
        String saisie;
        char operateur = 'Q';
        int result;

        do {
            try {
                a = new VerificationSaisie().verifierNombre();
                operateur = new VerificationSaisie().verifierOperateur();
                b = new VerificationSaisie().verifierNombre();
                switch (operateur) {
                    case '+':
                        result = new Operation().ajouter(a, b);
                        break;
                    case '-':
                        result = new Operation().soustraire(a, b);
                        break;
                    case '*':
                        result = new Operation().multiplier(a, b);
                        break;
                    case '/':
                        result = a / b;
                        break;
                    default:
                        break;
                }
            }
            catch(InputMismatchException e) {
                System.err.println("Saisie incorrecte. Réessayez...");
            }
            catch (MauvaisOperateur e) {
                System.err.println("Mauvais opérateur. Réessayez...");
            }
            catch (DepassementCapaciteException e) {
                System.err.println("La valeur saisie dépasse les capacités de cette calculatrice. Réessayez...");
            }
            finally {
                operateur = '+';
            }
        }while(operateur != 'Q');




    }
}
