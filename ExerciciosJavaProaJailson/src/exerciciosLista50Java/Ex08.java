package exerciciosLista50Java;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.printf("Digite uma palavra para saber se ela � considerada um pal�ndromo: ");
        String palavra = leia.nextLine();
        boolean palindromo = verficarPalindro(palavra);
        System.out.println("A palavra �" + palavra + "' -> " + (palindromo ? "�" : "N�o �") + " um pal�ndromo.");
        leia.close();
    }

    static boolean verficarPalindro(String phrase){
        phrase = phrase.toLowerCase().replace("[^a-z]", "");
        StringBuilder palavraInvertida = new StringBuilder(phrase).reverse();
        return phrase.equals(palavraInvertida.toString());
    }
}
