package fr.eni;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.javaws.exceptions.ExitException;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import fr.eni.VerificationSaisie;
import fr.eni.Operation;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a =0;
        int b =0;
        char operateur = ' ';
        int result = 0;

        do {
            try {
                a = new VerificationSaisie().verifierNombre();
                operateur = new VerificationSaisie().verifierOperateur();
                operateur = new VerificationSaisie().verifierExit(operateur);
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
                    case '%':
                        result = a%b;
                    default:
                        break;
                }
                System.out.println("Le résultat est : " + result);
            }
            catch(InputMismatchException  | MauvaisOperateur e) {
                System.err.println("Saisie incorrecte. Réessayez...");
            }
            catch(ArithmeticException e) {
                System.err.println("Division par zéro impossible");
            }
            catch (SortieException e) {
                System.out.println("Fin du programme");
                operateur = 'Q';
            }
            catch (DepassementCapaciteException e) {
                System.err.println("La valeur saisie dépasse les capacités de cette calculatrice. Réessayez...");
            }

        }while(operateur != 'Q');




    }
}
