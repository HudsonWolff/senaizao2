package DIDATICA;

import java.util.Random;

public class repeticao {
    public static void main(String[] args) {
        Random random = new Random();
        int []vetor = new int[2];

        for (int i = 0; i < vetor.length ; i++) {
            vetor[i]= random.nextInt(100);

        }


for (int j : vetor){
    System.out.println(j);
}















    }
}
