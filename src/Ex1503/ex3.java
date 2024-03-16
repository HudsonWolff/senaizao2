package Ex1503;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int n = 0;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");


        while (!(n < 0)){
            n=scanner.nextInt();
            soma = n+soma;
        }
        System.out.println(soma++);
    }
}
