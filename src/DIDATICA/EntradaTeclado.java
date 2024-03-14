package DIDATICA;

import java.net.SocketAddress;
import java.util.Scanner;

public class EntradaTeclado {
    public static void main(String[] args) {
        //pesquise -> scanner <- ler do teclado
        //faça um programa que pega um texto do teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome : ");

        String nome = scanner.nextLine();

        System.out.println("Muito prazar " + nome + "'-'");


        Scanner alt = new Scanner(System.in);
        System.out.print(" Qual sua altura? : ");

        double altura = scanner.nextDouble();
        System.out.println("Sua altura é de " + altura);

        Scanner idade = new Scanner(System.in);
        System.out.print("Agora " + nome + ", Qual sua idade? : ");

        int ida = scanner.nextInt();
        System.out.println(nome +  " Você tem " + ida + " anos" );

    }
}
