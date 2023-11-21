package exerciciosLista50Java;

public class Ex10 {
    public static void main(String[] args){
        int arr[] = {4, 68, 7, 10, 33, 11, 43 };
        int n = arr.length;
        int x = 10;

        int resultado = pesquisaBinaria(arr, 0, n - 1, x);

        if (resultado == - 1){
            System.out.println("Elemento não está presente no array.");
        } else {
            System.out.printf("Elemento encontrado no índice: %d", resultado);
        }

    }

    static int pesquisaBinaria(int arr[], int left, int right, int x){
        if (right >= left){
            int mid = left + (right - left) / 2;

            if (arr[mid] == x){
                return mid;
            }

            if (arr[mid] > x){
                return pesquisaBinaria(arr, left, mid - 1, x);
            }

            return pesquisaBinaria(arr, mid + 1, right, x);
        }

        return - 1;
    }
}
