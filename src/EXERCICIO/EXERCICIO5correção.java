package EXERCICIO;

public class EXERCICIO5correção {
    public static void main(String[] args) {
        String frase = "tengoku";
        int aux = 0;

        for (int i = 0; i < frase.length() ; i++) {
            if (!(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i)=='i' ||frase.charAt(i) == 'o' || frase.charAt(i)=='u')){
                aux++;
            }

        }

        System.out.println("Total de consoantes são : " + aux);































    }
    }
