package mergesort;

/*
* O algoritmo Merge Sort é uma técnica de ordenação eficiente que segue o paradigma "Dividir para Conquistar". Ele divide recursivamente um array em duas metades, ordena as metades separadamente e, em seguida, mescla (ou combina) as metades ordenadas para obter o resultado final ordenado.

O Merge Sort é conhecido por sua eficiência e estabilidade, mantendo a ordem relativa dos elementos iguais. Possui uma complexidade de tempo O(n log n), tornando-o uma escolha excelente para ordenar grandes quantidades de dados.

Lembre-se de que o Merge Sort usa uma quantidade adicional de memória para os arrays temporários usados durante a mesclagem, o que pode ser uma consideração importante em cenários com restrições de memória.*/
public class MergeSortCodeWhisperer {

    // construir o algoritmo de merge sort
    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    // construir o algoritmo de merge sort recursivo
    private static void mergeSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(array, inicio, meio);
            mergeSort(array, meio + 1, fim);
            merge(array, inicio, meio, fim);
        }
    }

    // construir o algoritmo de merge
    private static void merge(int[] array, int inicio, int meio, int fim) {
        int[] aux = new int[array.length];
        for (int i = inicio; i <= fim; i++) {
            aux[i] = array[i];
        }
        int i = inicio;
        int j = meio + 1;
        int k = inicio;
        while (i <= meio && j <= fim) {
            if (aux[i] <= aux[j]) {
                array[k] = aux[i];
                i++;
            } else {
                array[k] = aux[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            array[k] = aux[i];
            i++;
            k++;
        }
    }

    // teste
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int[] array2 = {5, 2, 4, 6, 1, 3};
        mergeSort(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        int[] array3 = {5, 2, 4, 6, 1, 3};
        mergeSort(array3);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        int[] array4 = {5, 2, 4, 6, 1, 3};
        mergeSort(array4);
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);

        }
    }
}
