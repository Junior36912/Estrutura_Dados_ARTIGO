package Rascunhos;

public class Teste_MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }


    public static void main(String[] args){
        int[] lista_valores_aleatorios = {-49, 23, 56, -17, 38, -5, -42, 11, 7, -30, 44, 19, 2, -14, -46, 33, 8, -28, -37, 50, -20, 13, -3, 47, 9, 36, -11, -34, 25, -41, 14, 1, -18, 42, 27, -1, -25, -33, 6, -45, 29, -12, -24, 16, 35, 10, -48, -19, 28, -6, -27, -38, -50, -4, -43, 15, -16, -23, -10, -22, 45, 31, -35, 18, 3, 46, 40, -7, 22, -15, 26, -29, -21, -31, 21, 30, 34, 4, -26, -8, -44, -47, 32, 39, 20, 5, -9, 41, 48, -32, -36, 12, -2, 37, 17, 49, -40        };

        int[] lista_valores_ordenados = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};

        int[] lista_valores_reverso = {1000, 999, 998, 997, 996, 995, 994, 993, 992, 991, 990, 989, 988, 987, 986, 985, 984, 983, 982, 981, 980, 979, 978, 977, 976, 975, 974, 973, 972, 971, 970, 969, 968, 967, 966, 965, 964, 963, 962, 961, 960, 959, 958, 957, 956, 955, 954, 953, 952, 951, 950, 949, 948, 947, 946, 945, 944, 943, 942, 941, 940, 939, 938, 937, 936, 935, 934, 933, 932, 931, 930, 929, 928, 927, 926, 925, 924, 923, 922, 921, 920, 919, 918, 917, 916, 915, 914, 913, 912, 911, 910, 909, 908, 907, 906, 905, 904, 903, 902, 901, 900};

        int[] lista_valores_repetidos = {0, 3, 3, 1, 1, 1, 1, 1, 1, 7, 7, 11, 7, 5, 9, 9, 9, 9, 13, 13};
        


        System.out.println(" ");
        {System.out.println("=====================MergeSort Aleatorio======================");

        long tempoInicial = System.currentTimeMillis();

        mergeSort(lista_valores_aleatorios);

        System.out.println("O método foi executado em " + (System.currentTimeMillis() - tempoInicial));

        for (int i = 0; i < lista_valores_aleatorios.length; i++) {
            System.out.print(lista_valores_aleatorios[i] + " ");
        }}
       


        System.out.println(" ");
        {System.out.println("=====================MergeSort Ordenado======================");

        long tempoInicialOr = System.currentTimeMillis();

        mergeSort(lista_valores_ordenados);

        System.out.println("O método foi executado em " + (System.currentTimeMillis() - tempoInicialOr));
        
        for (int i = 0; i < lista_valores_ordenados.length; i++) {
            System.out.print(lista_valores_ordenados[i] + " ");
        }}



        System.out.println(" ");
        {System.out.println("=====================MergeSort Reverso======================");

        long tempoInicialRev = System.currentTimeMillis();

        mergeSort(lista_valores_reverso);

        System.out.println("O método foi executado em " + (System.currentTimeMillis() - tempoInicialRev));

        for (int i = 0; i < lista_valores_reverso.length; i++) {
            System.out.print(lista_valores_reverso[i] + " ");
        }}



        System.out.println(" ");
        {System.out.println("=====================MergeSort Repetido======================");

        long tempoInicialRep = System.currentTimeMillis();

        mergeSort(lista_valores_aleatorios);

        System.out.println("O método foi executado em " + (System.currentTimeMillis() - tempoInicialRep));

        for (int i = 0; i < lista_valores_repetidos.length; i++) {
            System.out.print(lista_valores_repetidos[i] + " ");
        }}
    }
}