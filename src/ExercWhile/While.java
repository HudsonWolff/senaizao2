package ExercWhile;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        String nome;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome ou digite X para sair da exercução");
        nome = scanner.nextLine();

        while (!(nome.equals("x"))){
            System.out.println("olá " + nome);
            System.out.println("Digite um nome ou digite x para sair da execução");
            nome= scanner.nextLine();


            System.out.println(nome);

        }



    }
}
