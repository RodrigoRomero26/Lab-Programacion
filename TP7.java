import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        int[] array1 = {9, 2, 3, 7, 4, 5, 1};
        Arrays.sort(array1);
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // Ejercicio 2
        Integer[] array2 = {9, 2, 3, 7, 4, 5, 1};
        Arrays.sort(array2, Collections.reverseOrder());
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // Ejercicio 3
        double[] array3 = {9.2, 2.4, 3.8, 7.3, 4.7, 5.3, 1.1};
        Arrays.sort(array3);
        for (double i : array3) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // Ejercicio 4
        Double[] array4 = {9.2, 2.4, 3.8, 7.3, 4.7, 5.3, 1.1};
        Arrays.sort(array4, Collections.reverseOrder());
        for (double i : array4) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // Ejercicio 5
        String[] array5 = {"hola", "agua", "vaso", "merce", "vale", "rami"};
        Arrays.sort(array5);
        for (String i : array5) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // Ejercicio 6
        String[] array6 = {"hola", "agua", "vaso", "merce", "vale", "rami"};
        Arrays.sort(array6, Collections.reverseOrder());
        for (String i : array6) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //Ejercicio 9
        int[] array7 = {9, 2, 3, 7, 4, 5, 1};
        int i, j, aux;
        for (i = 0; i < array7.length - 1; i++) {
            for (j = 0; j < array7.length - i - 1; j++) {
                if (array7[j + 1] < array7[j]) {
                    aux = array7[j + 1];
                    array7[j + 1] = array7[j];
                    array7[j] = aux;
                }
            }
        }
        // Ejercicio 10
        int menor, pos, tmp;
        int[] A = {9, 2, 4, 3, 5, 7};
        for (int k = 0; k < A.length - 1; k++) {
            menor = A[k];
            pos = i;
            for (int r = k + 1; r < A.length; r++) {
                if (A[r] < menor) {
                    menor = A[r];
                    pos = r;
                }
            }
            if (pos != k) {
                tmp = A[k];
                A[k] = A[pos];
                A[pos] = tmp;
            }
        }
        // Ejercicio 14
        Scanner input = new Scanner(System.in);

        int[] array = new int[20];

        System.out.println("Ingrese 20 enteros:");

        for (i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Array original:\n" + Arrays.toString(array));

        System.out.println("Elija la opción de ordenamiento:\n1. Ascendente\n2. Descendente");
        int opcion = input.nextInt();

        if (opcion == 1) {
            bubbleSortAscendente(array);
            System.out.println("Array ordenado ascendente:\n" + Arrays.toString(array));
        } else if (opcion == 2) {
            bubbleSortDescendente(array);
            System.out.println("Array ordenado descendente:\n" + Arrays.toString(array));
        }

        input.close();
    }


    // Ejercicio 11
    public static void insercionDirecta(int A[]) {
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) {
            aux = A[p];
            j = p - 1;
            while ((j >= 0) && (aux < A[j])) {
                A[j + 1] = A[j];
            }
            A[j + 1] = aux;
        }
    }

    // Ejercicio 12
    public static void quicksort(int A[], int izq, int der) {

        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (A[i] <= pivote && i < j) i++;
            while (A[j] > pivote) j--;
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];
        A[j] = pivote;

        if (izq < j - 1)
            quicksort(A, izq, j - 1);
        if (j + 1 < der)
            quicksort(A, j + 1, der);

    }
    // Ejercicio 13
    public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < A.length; i++)
                {
                    if (A[i - salto] > A[i]) {
                        aux = A[i];
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }
    public static void bubbleSortAscendente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescendente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
