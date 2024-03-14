package EX;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        double altura;
        double aux1 = 0;
        double aux2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura : ");



        for (int i = 0; i < 4; i++) {

            altura = scanner.nextDouble();

            if (aux1 < altura) {
                aux1 = altura;


            }
            if (i==0){
                aux2 = altura;


            }
            if (altura < aux2){
                aux2 = altura;
            }


        }
        System.out.println("A maior altura é : " + aux1);
        System.out.println("A menor altura é : " + aux2);
    }

}
