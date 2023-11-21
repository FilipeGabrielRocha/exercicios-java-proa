package exerciciosLista50Java;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Random random = new Random();

        int numeroAleatorio = random.nextInt(20) + 1;

        Scanner leia = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo da adivinhação");
        System.out.println("Tente adivinhar o número entre 1 e 20.");

        int tentativas = 0;
        boolean acertou = false;

        while (!acertou){
            System.out.print("Digite sua tentativa: ");
            int tentativa = leia.nextInt();
            tentativas++;

            if(tentativa == numeroAleatorio){
                acertou = true;
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }

        System.out.printf("Parabêns! Você acertou em %d tentavias", tentativas);

        leia.close();
    }
}
