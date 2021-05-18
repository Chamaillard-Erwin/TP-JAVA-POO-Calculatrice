/**
 * Programme permettant de mettre en pratique la levée d'exception et son traitement à travers
 * l'utilisation d'une calculatrice
 */

package fr.eni;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        /**
         * Déclaration des variables
         */
        int a =0;
        int b =0;
        char operateur = ' ';
        int result = 0;

        /**
         * Boucle principale du programme
         */
        do {
            try {
                //On vérifie que c'est pas un String et que le nombre ne
                //soit pas plus grand que la capacité de son type
                a = new VerificationSaisie().verifierNombre();
                //On vérifie que l'opérateur est bien dans la liste proposé
                operateur = new VerificationSaisie().verifierOperateur();
                //On vérifie que l'opérateur n'est pas 'Q' car sinon on lève
                //une exception permettant de stopper "proprement le programme"
                operateur = new VerificationSaisie().verifierExit(operateur);
                //On vérifie que c'est pas un String et que le nombre ne
                //soit pas plus grand que la capacité de son type
                b = new VerificationSaisie().verifierNombre();
                //Choix de l'opération en fonction de l'opérateur
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
                //On affiche le résultat si pas d'exception
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
        //On reboucle tant que l'opérateur est différent de 'Q'
        }while(operateur != 'Q');

    }
}
