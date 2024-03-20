package ExercWhile;

import java.util.Random;
import java.util.Scanner;

public class revisaowhile {
    public static void main(String[] args) {

        int numero = 0, radom;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        radom = random.nextInt(1, 10);

        do {
            System.out.println("Digite um valor");
            numero = scanner.nextInt();
            if (numero > radom) {
                System.out.println("Valor digitador maior que random!!");

            } else if (numero < radom) {
                System.out.println("Valor digitador menor que random");

            } else {


                System.out.println("Voce ganhou");
            }


        } while (numero!=radom);


    }
}
