package Rascunhos;
public class Teste_HeapSort {
    public static void heapSort(int[] vetor){
        int tamanho = vetor.length;
        int i = tamanho / 2, pai, filho, t;
        System.out.println(i);
        while (true){
            if (i > 0){
                i--; t = vetor[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (vetor[filho + 1] > vetor[filho])) {filho++;}
                if (vetor[filho] > t){
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else{
                    break;
                }
            }
            vetor[pai] = t;
        }
    }
    public static void main(String[] args){
        int[] lista_valores_aleatorios = {-49, 23, 56, -17, 38, -5, -42, 11, 7, -30, 44, 19, 2, -14, -46, 33, 8, -28, -37, 50, -20, 13, -3, 47, 9, 36, -11, -34, 25, -41, 14, 1, -18, 42, 27, -1, -25, -33, 6, -45, 29, -12, -24, 16, 35, 10, -48, -19, 28, -6, -27, -38, -50, -4, -43, 15, -16, -23, -10, -22, 45, 31, -35, 18, 3, 46, 40, -7, 22, -15, 26, -29, -21, -31, 21, 30, 34, 4, -26, -8, -44, -47, 32, 39, 20, 5, -9, 41, 48, -32, -36, 12, -2, 37, 17, 49, -40        };

        int[] lista_valores_ordenados = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};

        int[] lista_valores_reverso = {1000, 999, 998, 997, 996, 995, 994, 993, 992, 991, 990, 989, 988, 987, 986, 985, 984, 983, 982, 981, 980, 979, 978, 977, 976, 975, 974, 973, 972, 971, 970, 969, 968, 967, 966, 965, 964, 963, 962, 961, 960, 959, 958, 957, 956, 955, 954, 953, 952, 951, 950, 949, 948, 947, 946, 945, 944, 943, 942, 941, 940, 939, 938, 937, 936, 935, 934, 933, 932, 931, 930, 929, 928, 927, 926, 925, 924, 923, 922, 921, 920, 919, 918, 917, 916, 915, 914, 913, 912, 911, 910, 909, 908, 907, 906, 905, 904, 903, 902, 901, 900};

        int[] lista_valores_repetidos = {0, 3, 3, 1, 1, 1, 1, 1, 1, 7, 7, 11, 7, 5, 9, 9, 9, 9, 13, 13};
        


        System.out.println(" ");
        {System.out.println("=====================Heap Aleatorio======================");

        long tempoInicial = System.currentTimeMillis();

        heapSort(lista_valores_aleatorios);

        System.out.println("O método foi executado em " + (System.currentTimeMillis() - tempoInicial));

        for (int i = 0; i < lista_valores_aleatorios.length; i++) {
            System.out.print(lista_valores_aleatorios[i] + " ");
        }}
       


        System.out.println(" ");
        {System.out.println("=====================Heap Ordenado======================");

        long tempoInicialOr = System.currentTimeMillis();

        heapSort(lista_valores_ordenados);

        System.out.println("O método foi executado em " + (System.currentTimeMillis() - tempoInicialOr));
        
        for (int i = 0; i < lista_valores_ordenados.length; i++) {
            System.out.print(lista_valores_ordenados[i] + " ");
        }}



        System.out.println(" ");
        {System.out.println("=====================Heap Reverso======================");

        long tempoInicialRev = System.currentTimeMillis();

        heapSort(lista_valores_reverso);

        System.out.println("O método foi executado em " + (System.currentTimeMillis() - tempoInicialRev));

        for (int i = 0; i < lista_valores_reverso.length; i++) {
            System.out.print(lista_valores_reverso[i] + " ");
        }}



        System.out.println(" ");
        {System.out.println("=====================Heap Repetido======================");

        long tempoInicialRep = System.currentTimeMillis();

        heapSort(lista_valores_repetidos);


        System.out.println("O método foi executado em " + (System.currentTimeMillis() - tempoInicialRep));

        for (int i = 0; i < lista_valores_repetidos.length; i++) {
            System.out.print(lista_valores_repetidos[i] + " ");
        }}

}}