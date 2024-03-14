package EXERCICIO;

public class EXERCICIO3 {
    public static void main(String[] args) {
        int [] vet = {5,6,2,3};
        int soma= 0;
        for (int i = 0; i < vet.length ; i++) {
            System.out.println(vet[i]);
            soma = vet[i] + soma;

        }
        System.out.println( "A media dos vetores é de : " + (soma/ vet.length));
}
    }
