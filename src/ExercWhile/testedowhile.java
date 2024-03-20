package ExercWhile;

import java.util.Scanner;

public class testedowhile {
    public static void main(String[] args) {
        int numero= 10;
        int nimpar=0;


        do {
            System.out.println(numero);
            numero++;

            if (!(numero%2==0)){
                nimpar = numero + nimpar;
                nimpar++;
            }

            System.out.println();







        } while (numero<=5);





    }
}
