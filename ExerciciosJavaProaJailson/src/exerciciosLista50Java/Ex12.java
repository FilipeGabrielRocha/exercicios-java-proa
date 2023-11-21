package exerciciosLista50Java;

public class Ex12 {
    public static void main(String[] args) {

        int[] arr = { 12, 99, 5, 34 };

        int menorElemento = menorNumero(arr);

        System.out.printf("O menor número é: %d", menorElemento);

    }

    static int menorNumero(int[] arr){

        if (arr.length == 0){
            System.out.println("O array estÃ¡ vazio.");
            return Integer.MIN_VALUE;
        }

        int menorNumero = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < menorNumero){
                menorNumero = arr[i];
            }
        }

        return menorNumero;
    }
}
