package ExercWhile;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        String usuario;
        int Senha;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de usuario");
        usuario= scanner.nextLine();
        System.out.println("Digite sua senha");
        Senha = scanner.nextInt();
        scanner.nextLine();
        while (!(usuario.equals("admin") && Senha ==12345)){


            System.out.println("Digite o nome de usuario");
            usuario= scanner.nextLine();
            System.out.println("Digite sua senha");
            Senha = scanner.nextInt();


            scanner.nextLine();


        }

    }
}
