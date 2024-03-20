package exerciciosDOWHILE;

import java.util.Scanner;

public class EXERC3 {
    public static void main(String[] args) {
       String senha;
        Scanner scanner = new Scanner(System.in);


       do {
           System.out.println("Digite sua senha");
senha=scanner.nextLine();
if (!(senha.equalsIgnoreCase("senha123"))){
    System.out.println("Senha incorreta , digite novamente");
}

       }while (!(senha.equalsIgnoreCase("senha123")));
    }
}
