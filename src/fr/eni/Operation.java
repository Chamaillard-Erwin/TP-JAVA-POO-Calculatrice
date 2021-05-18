/**
 * Classe contenant des opérations élémentaires
 */


package fr.eni;

public class Operation {

    long longA;
    long longB;

    /**
     * Méthode permettant une addition en contrôlant la taille du résultat
     * @param a
     * @param b
     * @return
     * @throws DepassementCapaciteException
     */
    public int ajouter(int a, int b) throws DepassementCapaciteException {
        this.longA = a;
        this.longB = b;
        if((longA+longB) == (a+b)) {
            return a + b;
        }
        else {
            throw new DepassementCapaciteException();
        }
    }

    /**
     * Méthode permettant une soustraction en contrôlant la taille du résultat
     * @param a
     * @param b
     * @return
     * @throws DepassementCapaciteException
     */
    public int soustraire(int a, int b) throws DepassementCapaciteException {
        this.longA = a;
        this.longB = b;
        if((longA-longB) == (a-b)) {
            return a - b;
        }
        else {
            throw new DepassementCapaciteException();
        }
    }

    /**
     * Méthode permettant une multiplication en contrôlant la taille du résultat
     * @param a
     * @param b
     * @return
     * @throws DepassementCapaciteException
     */
    public int multiplier(int a, int b) throws DepassementCapaciteException {
        this.longA = a;
        this.longB = b;
        if((longA*longB) == (a*b)) {
            return a * b;
        }
        else {
            throw new DepassementCapaciteException();

        }
    }
}
