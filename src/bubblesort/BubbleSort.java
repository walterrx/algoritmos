package bubblesort;

/* Algoritmo de ordenacao mais simples e menos eficiente para grande conjunto de dados. Ele percorre
* o array varias vezes, comparando elementos adjacentes e trocando-os se estiverem fora de ordem
* Existem outros algoritmos de ordenacao mais eficientes como Quick Sort e Merge Sort. */

public class BubbleSort {

    // criar um algoritmo de bubble sort
    public static void bubbleSort(int[] array) {
        int aux;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
