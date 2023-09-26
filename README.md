# PoCs de Algoritmos gerados através de Generative AI
Objetivo do projeto é testar as tecnologias de geracao de código utilizando Generate AI da AWS e OpenAI.

Foi utilizada a IDE IntelliJ da JetBrains

## AWS Code Whisperer
Crie aplicações com mais rapidez e segurança com seu companheiro de codificação de IA

[Link da página oficial](https://aws.amazon.com/pt/codewhisperer/?trk=f6a5abea-70e5-45dc-9cf2-5c73627a52bc&sc_channel=ps&ef_id=CjwKCAjwgsqoBhBNEiwAwe5w00kHnS3h-_2vKdgjfXidmVF_8VtPF2IL0Q4jOnkRcil3O-m2Ir5NExoCCKQQAvD_BwE:G:s&s_kwcid=AL!4422!3!654862167298!e!!g!!amazon%20codewhisperer!19966636794!151630008641)

## CodeGPT
Assistente perfeito para qualquer programador que deseja aperfeicoar o desenvovlimento de códigos

[Link da página oficial](This is the perfect assistant for any programmer who wants to improve their coding skills and make more efficient use of the time.)

## CoPilot
//to-do

## Algoritmos utilizados
### Bubblesort
Algoritmo de ordenacao mais simples e menos eficiente para grande conjunto de dados. Ele percorre
o array varias vezes, comparando elementos adjacentes e trocando-os se estiverem fora de ordem.
Existem outros algoritmos de ordenacao mais eficientes como Quick Sort e Merge Sort.

### Busca Binária
 Algoritmo eficiente para encontrar um elemento específico em uma *lista ordenada* . Ele funciona dividindo repetidamente a lista ao meio e comparando o valor do elemento do meio com o valor que você esta procurando. Com base na comparaão, a busca é restrita a metade superior ou inferior da lista, reduzindo drasticamente o numero de elementos a serem considerados.

### Mergesort
O algoritmo Merge Sort é uma técnica de ordenação eficiente que segue o paradigma "Dividir para Conquistar". Ele divide recursivamente um array em duas metades, ordena as metades separadamente e, em seguida, mescla (ou combina) as metades ordenadas para obter o resultado final ordenado.

O Merge Sort é conhecido por sua eficiência e estabilidade, mantendo a ordem relativa dos elementos iguais. Possui uma complexidade de tempo O(n log n), tornando-o uma escolha excelente para ordenar grandes quantidades de dados.

Lembre-se de que o Merge Sort usa uma quantidade adicional de memória para os arrays temporários usados durante a mesclagem, o que pode ser uma consideração importante em cenários com restrições de memória.

### Quicksort
O Quick Sort é um algoritmo de ordenação eficiente que segue a abordagem "Dividir para Conquistar". Ele seleciona um elemento chamado de "pivô" e rearranja os elementos do array de forma que os elementos menores que o pivô fiquem à sua esquerda e os elementos maiores fiquem à sua direita. Em seguida, o algoritmo é recursivamente aplicado às duas partições resultantes (à esquerda e à direita do pivô) até que a lista inteira esteja ordenada.

O Quick Sort tem uma complexidade de tempo médio O(n log n), tornando-o eficiente para ordenar grandes volumes de dados. Comparado ao Bubble Sort, o Quick Sort é significativamente mais rápido.

Lembre-se de que o Quick Sort pode ter um desempenho ruim em conjuntos de dados quase ordenados ou quando a escolha do pivô não é otimizada. Em tais casos, algoritmos como o Merge Sort podem ser mais consistentes em termos de desempenho.

## Resultados da PoC
### Definicões
As perguntas sobre o que é cada algoritmo foram feitas utilizando o ChatGPT. 

A parte que fiquei surpreso foi nos resultados já trazendo tradeoffs do uso de cada algortimo. Ponto este que achei bem interessante para quem não tem a vivência e pode já ganhar tempo em escolher o algortimo mais certeiro para resolver seu problema.

### Percepcões
Os testes da PoCs foram feitos entre o periodo de Julho e Setemebro de 2023 onde pude constatar que o AWS Code Whisperer acaba gerando muitos códigos básicos.



