package fr.eni;

public class Operation {

    long longA;
    long longB;


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

    public int soustraire(int a, int b) {
        return a - b;
    }

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
