package exerciciosLista50Java;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o �ngulo em graus: ");
        double anguloGraus = leia.nextDouble();

        double angulo = Math.toRadians(anguloGraus);

        double cosseno = Math.cos(angulo);

        System.out.printf("O cosseno de %.2f em graus �: %.2f", anguloGraus, cosseno);

        leia.close();
    }
}
