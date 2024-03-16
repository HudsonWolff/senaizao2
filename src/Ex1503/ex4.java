package Ex1503;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int vogal = 0;
        int aux = 0;

        System.out.println("Digite uma palavra");
String nome = scanner.nextLine();


        while (aux<nome.length()){

            char contcarac = nome.charAt(aux);

            if ((contcarac == 'a' || contcarac == 'e' || contcarac == 'i' || contcarac == 'o' || contcarac=='u')){
                vogal++;
            }



            aux++;



        }

        System.out.println("o numero de vogais é : " + vogal);

    }

}
