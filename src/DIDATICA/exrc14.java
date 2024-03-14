package DIDATICA;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exrc14 {
    public static void main(String[] args) {
        int num;
        int aux1 =0 ,aux2 = 0,aux3 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 20 numeros");

        for (int i = 0; i < 5 ; i++) {
            num = scanner.nextInt();

            if (num > 0 && num <100){
                aux1=aux1+1;

            } if (num >101 && num<200){
                aux2=aux2+1;
            }
            if (num > 200){
                aux3=aux3+1;
            }

        }

        System.out.println("Numero entre 0 a 100 são " + aux1);
        System.out.println("Numeros entre 101 a 200 são " + aux2);
        System.out.println("Numero maiores que 200 são " + aux3);
        }


}
