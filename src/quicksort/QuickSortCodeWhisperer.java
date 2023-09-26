package quicksort;

/*
* O Quick Sort é um algoritmo de ordenação eficiente que segue a abordagem "Dividir para Conquistar". Ele seleciona um elemento chamado de "pivô" e rearranja os elementos do array de forma que os elementos menores que o pivô fiquem à sua esquerda e os elementos maiores fiquem à sua direita. Em seguida, o algoritmo é recursivamente aplicado às duas partições resultantes (à esquerda e à direita do pivô) até que a lista inteira esteja ordenada.

O Quick Sort tem uma complexidade de tempo médio O(n log n), tornando-o eficiente para ordenar grandes volumes de dados. Comparado ao Bubble Sort, o Quick Sort é significativamente mais rápido.

Lembre-se de que o Quick Sort pode ter um desempenho ruim em conjuntos de dados quase ordenados ou quando a escolha do pivô não é otimizada. Em tais casos, algoritmos como o Merge Sort podem ser mais consistentes em termos de desempenho.

*
* */
public class QuickSortCodeWhisperer {

    // construir o algoritmo de quicksort
    public static void quickSort(int[] array, int inicio, int fim) {
        int meio;
        int aux;
        int i;
        int j;

        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            aux = array[meio];
            array[meio] = array[fim];
            array[fim] = aux;
            i = inicio;
            j = fim - 1;
            while (i < j) {
                while (array[i] < array[fim]) {
                    i++;
                }
                while (array[j] > array[fim]) {
                    j--;
                }
                if (i < j) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
            aux = array[i];
            array[i] = array[fim];
            array[fim] = aux;
            quickSort(array, inicio, i - 1);
            quickSort(array, i + 1, fim);
        }
    }

    // teste
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
