import java.util.Random;
import java.util.Scanner;
public class TP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numarray = new int[10];
        int i, contadorpos = 0, contadorneg = 0, positivos = 0, negativos = 0;
        float mediapos, medianeg;
        for (i = 0; i != numarray.length; i++) {
            System.out.println("Ingrese el " + (i + 1) + " valor");
            numarray[i] = sc.nextInt();
        }
        for (i = 0; i <= 9; i++) {
            if (numarray[i] >= 0) {
                contadorpos += 1;
                positivos += numarray[i];
            } else {
                contadorneg += 1;
                negativos += numarray[i];
            }
        }
        mediapos = (float) positivos / contadorpos;
        medianeg = (float) negativos / contadorneg;
        System.out.println("La media de numeros positivos es de " + mediapos);
        System.out.println("La media de numeros negativos es de " + medianeg);

        // Ejercicio 2
        int[] numarraypar = new int[10];
        int j, pare = 0, contador = 0;
        float mediapar;
        for (j = 0; j != numarraypar.length; j++) {
            System.out.println("Ingrese el " + (j + 1) + " valor");
            numarraypar[j] = sc.nextInt();
        }
        for (j = 0; j != numarraypar.length; j += 2) {
            pare += numarraypar[j];
            contador += 1;
        }
        mediapar = (float) pare / contador;
        System.out.println("La media de los valores en las posiciones pares es: " + mediapar);

        //Ejercicio 3
        int alumnos;
        double notastotales = 0, medianotas;
        System.out.println("Ingrese la cantidad de alumnos");
        alumnos = sc.nextInt();
        double[] notas = new double[alumnos];
        for (i = 0; i != notas.length; i++) {
            System.out.println("Ingrese la nota");
            notas[i] = sc.nextDouble();
        }
        for (i = 0; i != notas.length; i++) {
            notastotales += notas[i];
        }
        medianotas = notastotales / alumnos;
        System.out.println("La media de notas es de " + medianotas);
        for (i = 0; i != notas.length; i++) {
            if (notas[i] > medianotas) {
                System.out.println("La nota " + notas[i] + " es mayor a la media.");
            }
        }

        //Ejercicio 4
        int[] pares = new int[20];
        int par = 2;
        for (i = 0; i != pares.length; i++) {
            pares[i] = par;
            par += 2;
        }
        for (i = 0; i != pares.length; i++) {
            System.out.println(pares[i]);
        }

        // Ejercicio 5
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cer = 0;
        for (i = 0; i != numeros.length; i++) {
            System.out.println("Ingrese el numero");
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i != numeros.length; i++) {
            if (numeros[i] > 0) {
                pos += 1;
            } else if (numeros[i] < 0) {
                neg += 1;
            } else {
                cer += 1;
            }
        }
        System.out.println("Positivos: " + pos + " Negativos: " + neg + " Ceros: " + cer);

        //Ejercicio 6
        int[] numero = new int[10];
        int posi = 0, nega = 0, cantpos = 0, cantneg = 0;
        for (i = 0; i != numero.length; i++) {
            System.out.println("Ingrese el numero");
            numero[i] = sc.nextInt();
        }
        for (i = 0; i != numero.length; i++) {
            if (numero[i] > 0) {
                posi += numero[i];
                cantpos += 1;
            } else {
                nega += numero[i];
                cantneg += 1;
            }
        }
        System.out.println("Media de numeros positivos: " + pos / cantpos + " Media de numeros negativos: " + neg / cantneg);

        //Ejercicio 7
        int cantidad, sup = 0, inf = 0;
        float total = 0, media, contado = 0;
        System.out.println("Ingrese la cantidad de personas.");
        cantidad = sc.nextInt();
        float[] alturas = new float[cantidad];
        for (i = 0; i != alturas.length; i++) {
            System.out.println("Ingrese la altura.");
            alturas[i] = sc.nextFloat();
            total += alturas[i];
            contado += 1;
        }
        media = total / contado;
        for (i = 0; i != alturas.length; i++) {
            if (alturas[i] >= media) {
                sup += 1;
            } else {
                inf += 1;
            }
        }
        System.out.println("Existen " + sup + " personas con una altura superior a la media y " + inf + " inferiores a la media.");

        //Ejercicio 8
        String[] empleados = new String[20];
        int[] sueldos = new int[20];
        int maxsueldo = 0, aux = 0;
        for (i = 0; i != empleados.length; i++) {
            System.out.println("Ingrese el nombre del empleado");
            empleados[i] = sc.nextLine();
            System.out.println("Ingrese cuanto gana el empleado");
            sueldos[i] = sc.nextInt();
            if (sueldos[i] > maxsueldo) {
                maxsueldo = sueldos[i];
                aux = i;
            }
            sc.nextLine();
        }
        System.out.println("El empleado con el mayor sueldo es:");
        System.out.println(empleados[aux] + " su sueldo es: $" + maxsueldo);

        //Ejercicio 9

        int des, has, tama;
        System.out.println("Ingrese el tamaño del array.");
        tama = sc.nextInt();
        System.out.println("Ingrese el minimo valor para los numeros a generar");
        des = sc.nextInt();
        System.out.println("Ingrese el maximo valor para los numeros a generar");
        has = sc.nextInt();
        int[] list = new int[tama];
        list = arrayrandom(des, has, tama);
        for (i = 0; i != list.length; i++) {
            System.out.println(list[i]);
        }

        //Ejercicio 10, A
        Random random = new Random();
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[2][3];
        int[][] matrizC = new int[2][3];
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                matrizA[i][j] = random.nextInt(10);
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                matrizB[i][j] = random.nextInt(10);
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println(" ");
        }
        // Ejercicio 10, B
        int num, filas, columnas;
        System.out.println("Ingrese la cantidad de filas de la matriz");
        filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz");
        columnas = sc.nextInt();
        int [][] matriza = creamatriz(filas,columnas);
        int [][] matrizb = creamatriz(filas,columnas);
        int [][] matrizc = creamatriz(filas,columnas);
        matriza = llenamatriz(matriza,filas,columnas);
        matrizb = llenamatriz(matrizb,filas,columnas);
        mostrarmatriz(matriza,filas,columnas);
        mostrarmatriz(matrizb,filas,columnas);
        matrizc = sumamatriz(matriza,matrizb,filas,columnas);
        mostrarmatriz(matrizc,filas,columnas);

        //Ejercicio 11
        int filas, columnas;
        System.out.println("Ingrese la cantidad de filas de la matriz");
        filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz");
        columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        int[][] matrizt = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j< columnas; j++) {
                matrizt[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j< filas; j++) {
                System.out.print(matrizt[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] arrayrandom(int desde, int hasta, int tamano) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] listanum = new int[tamano];
        for (int i = 0; i != listanum.length; i++) {
            listanum[i] = random.nextInt(hasta) + desde;
        }
        return listanum;
    }

    public static int leerentero() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }

    public static int[][] creamatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        return matriz;
    }

    public static int[][] llenamatriz(int[][] matriz, int fila, int columna) {
        for (int i = 0; i < fila-1; i++) {
            for (int j = 0; j < columna-1; j++) {
                matriz[i][j] = leerentero();
            }
        }
        return matriz;
    }

    public static void mostrarmatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas-1; i++) {
            for (int j = 0; j < columnas-1; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static int[][] sumamatriz(int[][] matriz1, int[][] matriz2, int filas, int columnas) {
        int[][] matrizresultado = new int[filas][columnas];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrizresultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizresultado;
    }
}