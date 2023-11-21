package exerciciosLista50Java;

public class Ex49 {
    public static void main(String[] args) {
        int[] array = {34, 56, 67, 89, 10, 12};
        int tamanhoIntervalo = 3;

        for (int i = 0; i <= array.length - tamanhoIntervalo; i++) {
            int soma = 0;
            for (int j = i; j < i + tamanhoIntervalo; j++) {
                soma += array[j];
            }
            double media = (double) soma / tamanhoIntervalo;
            System.out.printf("Média móvel do intervalo %d - %d: %.2f%n", (i + 1), (i + tamanhoIntervalo), media);
        }
    }
}
