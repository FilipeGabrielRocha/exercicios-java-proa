package exerciciosLista50Java;

import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o �ngulo em graus: ");
        double anguloGraus = leia.nextDouble();

        double seno = Math.sin(Math.toRadians(anguloGraus));

        System.out.printf("O seno do �ngulo �: %.2f", seno);
        
        leia.close();
    }
}
