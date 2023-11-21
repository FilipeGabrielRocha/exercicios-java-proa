package exerciciosLista50Java;

public class Ex09 {
    public static void main(String[] args) {
        int[] array = { 4, 6, 8, 10};
        double media = CalculandoMedia(array);
        System.out.printf("A média dos número no array é: %.2f", media);
    }

    static double CalculandoMedia(int[] array){
        int soma = 0;
        for (int num : array){
            soma += num;
        }
        return (double) soma / array.length;
    }
}
