package exerciciosLista50Java;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o raio do c�ruculo: ");
        while (!leia.hasNextDouble()){
            System.out.println("Digite um valor de um n�mero v�lido.");
            leia.next();
        }

        double raio = leia.nextDouble();

        double area = calcularAreaCirculo(raio);

        System.out.printf("A �rea do c�rculo com raio %.2f �: %.2f", raio, area);

        leia.close();
    }

    static double calcularAreaCirculo(double raio){
        return Math.PI * Math.pow(raio, 2);
    }
}
