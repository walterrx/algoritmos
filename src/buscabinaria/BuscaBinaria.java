package buscabinaria;

/* Algoritmo eficiente para encontrar um elemento específico em uma lista ordenada.
* Ele funciona dividindo repetidamente a lista ao meio e comparando o valor do elemento do meio com o valor que você esta procurando
* Com base na comparaão, a busca é restrita a metade superior ou inferior da lista, reduzindo drasticamente o numero de elementos a serem considerados*/
public class BuscaBinaria {
    // construir o algoritmo de busca binaria
    public static int buscaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length - 1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (array[meio] == valor) {
                return meio;
            } else if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valor = 10;
        int posicao = buscaBinaria(array, valor);
        System.out.println("A posição do valor " + valor + " é " + posicao);

        int valor2 = 11;
        int posicao2 = buscaBinaria(array, valor2);
        System.out.println("A posição do valor " + valor2 + " é " + posicao2);

        int valor3 = -1;
        int posicao3 = buscaBinaria(array, valor3);
        System.out.println("A posição do valor " + valor3 + " é " + posicao3);

        int valor4 = 0;
        int posicao4 = buscaBinaria(array, valor4);
        System.out.println("A posição do valor " + valor4 + " é " + posicao4);

        int valor5 = 1;
        int posicao5 = buscaBinaria(array, valor5);
        System.out.println("A posição do valor " + valor5 + " é " + posicao5);

        int valor6 = 2;
        int posicao6 = buscaBinaria(array, valor6);
        System.out.println("A posição do valor " + valor6 + " é " + posicao6);

        int valor7 = 3;
        int posicao7 = buscaBinaria(array, valor7);
        System.out.println("A posição do valor " + valor7 + " é " + posicao7);

        int valor8 = 4;
        int posicao8 = buscaBinaria(array, valor8);
        System.out.println("A posição do valor " + valor8 + " é " + posicao8);

        int valor9 = 5;
        int posicao9 = buscaBinaria(array, valor9);
    }
}
