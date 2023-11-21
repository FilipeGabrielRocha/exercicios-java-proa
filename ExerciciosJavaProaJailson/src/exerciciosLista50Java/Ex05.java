package exerciciosLista50Java;

public class Ex05 {
    public static void main(String[] args) {
        int[] array = {1, 3, 50, 5, 110, 0};

        int maior = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
            }
        }

        System.out.printf("O maior elemento do array é: %d", maior);
    }
}
