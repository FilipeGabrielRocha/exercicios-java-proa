package exerciciosLista50Java;

public class Ex06 {
    public static void main(String[] args) {
        int[] array = {100, 5, 3, 4, 54, 67, 1};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Ordenando o array...");
        for (int num : array){
            System.out.printf("%d ", num);
        }
    }
}
