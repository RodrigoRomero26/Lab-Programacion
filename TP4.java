import java.util.Scanner;
public class TP5Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 1
        int num;
        System.out.print("Ingrese un numero");
        num = sc.nextInt();
        if (num % 10 == 2) System.out.print(num + " Es un numero par");
        else System.out.print(num + " Es un numero impar");
        // Ejercicio 2
        int num1;
        System.out.print("Ingrese un numero");
        num1 = sc.nextInt();
        if (num1 % 10 == 0) {
            System.out.println("El numero " + num1 + "es multiplo de 10");
        } else {
            System.out.print("El numero " + num + "no es multiplo de 10");
        }
        // Ejercicio 3
        char letra;
        System.out.print("Ingrese un caracter");
        letra = sc.next().charAt(0);
        if (Character.isUpperCase(letra)) {
            System.out.print("La letra es mayuscula");
        } else {
            System.out.print("La letra no es mayuscula");
        }
        // Ejercicio 4
        int num2;
        int num3;
        System.out.print("Ingrese un numero");
        num2 = sc.nextInt();
        System.out.print("Ingrese otro numero");
        num3 = sc.nextInt();
        if (num2 == num3) {
            System.out.print("Los numeros son iguales");
        } else {
            System.out.print("Los numeros no son iguales");
        }
        // Ejercicio 5
        int num_1;
        int num_2;
        System.out.print("Ingrese un numero");
        num_1 = sc.nextInt();
        System.out.print("Ingrese otro numero");
        num_2 = sc.nextInt();
        if (num_1 > num2) {
            System.out.print(num1 + " Es mayor que " + num_2);
        } else if (num_2 > num_1) {
            System.out.print(num2 + " Es mayor que " + num_1);
        } else if (num_1 == num_2) {
            System.out.print("Los numeros son iguales");
        } else {
            System.out.print("Valores invalidos");
        }
        // Ejercicio 6
        int num_3;
        int num_4;
        System.out.print("Ingrese un numero de dos cifras");
        num_3 = sc.nextInt();
        System.out.print("Ingrese otro numero de dos cifras");
        num_4 = sc.nextInt();
        num_3 = num_3 % 10;
        num_4 = num_4 % 10;
        if (num_3 == num_4) {
            System.out.print("Los ultimos digitos son iguales");
        } else {
            System.out.print("Los ultimos digitos no son iguales");
        }
        // Ejercicio 7
        int num_5;
        System.out.print("Ingrese un numero de dos cifras");
        num_5 = sc.nextInt();
        if (num_5 % 3 == 0 && num_5 % 5 == 0) {
            System.out.print("El numero es multiplo de 3 y 5");
        } else {
            System.out.print("El numero no es multiplo de 3 y 5");
        }
        // Ejercicio 8
        int num_6;
        System.out.print("Ingrese un numero de dos cifras");
        num_6 = sc.nextInt();
        if (num_6 % 2 == 0 || num_6 % 3 == 0) {
            System.out.print("El numero es multiplo de 2 o 3");
        } else {
            System.out.print("El numero no es multiplo de 2 o 3");
        }
        // Ejercicio 9
        char letra_1, letra_2;
        System.out.print("Ingrese una letra");
        letra_1 = sc.next().charAt(0);
        System.out.print("Ingrese una letra");
        letra_2 = sc.next().charAt(0);
        if (letra_1 == letra_2) {
            System.out.print("Las letras son iguales");
        } else {
            System.out.print("Las letras no son iguales");
        }
        // Ejercicio 10
        char letra_3, letra_4;
        System.out.print("Ingrese una letra");
        letra_3 = sc.next().charAt(0);
        System.out.print("Ingrese una letra");
        letra_4 = sc.next().charAt(0);
        if (letra_3 == Character.toLowerCase(letra_3) && (letra_4 == Character.toLowerCase(letra_4))) {
            System.out.print("Las letras son minusculas");
        } else {
            System.out.print("Alguna de las letras no es minuscula");
        }
        // Ejercicio 11
        char numero_1;
        System.out.print("Ingrese un caracter");
        numero_1 = sc.next().charAt(0);
        if (Character.isDigit(numero_1)) {
            if (numero_1 >= '0' && numero_1 <= '9') {
                System.out.print("El caracter es numerico entre 0 y 9");
            } else {
                System.out.print("El caracter es numerico, pero no esta entre 0 y 9");
            }
        } else {
            System.out.print("El caracter no es numerico");
        }
        // Ejercicio 12
        double num_div;
        double num_divid;
        System.out.print("Ingrese el divisor");
        num_div = sc.nextDouble();
        System.out.print("Ingrese el dividendo");
        num_divid = sc.nextDouble();
        if (num_div == 0) {
            System.out.println("El divisor no puede ser 0");
        } else {
            System.out.println("La division da como resultado: " + (num_div / num_divid));
        }
        // Ejercicio 13
        int anio;
        System.out.println("Ingrese un año para comprobar si es bisiesto");
        anio = sc.nextInt();
        if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
        // EJercicio 14
        int num3c;
        System.out.print("Ingrese un numero de 3 cifras");
        num3c = sc.nextInt();
        if ((num3c / 100) == (num3c % 10)) {
            System.out.print("El numero es capicua");
        } else {
            System.out.print("El numero no es capicua");
        }
        // Ejercicio 15
        int h, m, s;
        System.out.print("Ingrese la hora");
        h = sc.nextInt();
        System.out.print("Ingrese los minutos");
        m = sc.nextInt();
        System.out.print("Ingrese los segundos");
        s = sc.nextInt();
        if ((h >= 0) && (h <= 23)) {
            if ((m >= 0) && (m <= 59)) {
                if ((s >= 0) && (s <= 59)) {
                    System.out.print("La hora es valida");
                }
            }
        }
        // Ejercicio 16
        int mes;
        System.out.print("Ingrese el numero de mes");
        mes = sc.nextInt();
        if ((mes >= 1) && (mes <= 12)) {
            switch (mes) {
                case 1:
                    System.out.print("El mes es enero, tiene 31 dias");
                    break;
                case 2:
                    System.out.print("El mes es febrero, tiene 28 dias");
                    break;
                case 3:
                    System.out.print("El mes es marzo, tiene 31 dias");
                    break;
                case 4:
                    System.out.print("El mes es abril, tiene 30 dias");
                    break;
                case 5:
                    System.out.print("El mes es mayo, tiene 31 dias");
                    break;
                case 6:
                    System.out.print("El mes es junio, tiene 30 dias");
                    break;
                case 7:
                    System.out.print("El mes es julio, tiene 31 dias");
                    break;
                case 8:
                    System.out.print("El mes es agosto, tiene 31 dias");
                    break;
                case 9:
                    System.out.print("El mes es septiembre, tiene 30 dias");
                    break;
                case 10:
                    System.out.print("El mes es octubre, tiene 31 dias");
                    break;
                case 11:
                    System.out.print("El mes es noviembre, tiene 30 dias");
                    break;
                case 12:
                    System.out.print("El mes es diciembre, tiene 31 dias");
                    break;
            }
        }
        // Ejercicio 17
        int cal;
        System.out.println("Ingrese la calificacion");
        cal = sc.nextInt();
        if ((cal >= 0) && (cal <= 10)) {
            if (cal < 5) {
                System.out.println("Insuficiente");
            } else if (cal < 6) {
                System.out.println("Suficiente");
            } else if (cal < 7) {
                System.out.println("Bien");
            } else if (cal < 9) {
                System.out.println("Notable");
            } else if (cal == 10) {
                System.out.println("Sobresaliente");
            }
        } else {
            System.out.println("Nota ingresada invalida");
        }
        // Ejercicio 18
        int cont_b = 0;
        while (cont_b < 100) {
            cont_b++;
            System.out.println(cont_b);
        }
        // Ejercicio 19
        int con_a = 0;
        do {
            con_a++;
            System.out.println(con_a);
        } while (con_a < 100);
        // Ejercicio 20
        int i;
        for (i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        // Ejercicio 21
        int con_b = 101;
        do {
            con_b--;
            System.out.println(con_b);
        } while (con_b != 0);
        // Ejercicio 22
        int con_c = 101;
        do {
            con_c--;
            System.out.println(con_c);
        } while (con_c > 0);
        // Ejercicio 23
        int j;
        for (j = 100; j >= 1; j--) {
            System.out.println(j);
        }
        // Ejercicio 24
        // A
        int max;
        int j_1 = 0;
        System.out.println("Ingrese un valor hasta el cual se contara");
        max = sc.nextInt();
        for (j_1 = 0; j_1 <= max; j_1++) {
            System.out.println(j_1);
        }
        // B
        System.out.println("Ingrese un valor hasta el cual se contara");
        max = sc.nextInt();
        while (j_1 <= max) {
            System.out.println(j_1);
            j_1++;
        }
        // C
        System.out.println("Ingrese un valor hasta el cual se contara");
        max = sc.nextInt();
        do {
            j_1++;
            System.out.println(j_1);
        } while (j_1 <= max - 1);
        // Ejercicio 25
        // A
        int maxx;
        int k;
        System.out.println("Ingrese un valor desde el cual se contara");
        maxx = sc.nextInt();
        for (k = maxx; k >= 1; k--) {
            System.out.println(k);
        }
        // B
        System.out.println("Ingrese un valor desde el cual se contara");
        maxx = sc.nextInt();
        while (maxx >= 1) {
            System.out.println(maxx);
            maxx--;
        }
        // C
        System.out.println("Ingrese un valor desde el cual se contara");
        maxx = sc.nextInt();
        do {
            System.out.println(maxx);
            maxx--;
        } while (maxx >= 1);
        // Ejercicio 26
        int number, number2;
        while (true) {
            System.out.println("Ingrese un numero entero ");
            number = sc.nextInt();
            System.out.println("Ingrese otro numero entero ");
            number2 = sc.nextInt();
            if (number == number2) {
                System.out.println("Los numeros son iguales, ingrese otra vez");
            } else {
                if (number > number2) {
                    System.out.println("El numero mayor es " + number);
                    break;
                } else {
                    System.out.println("El numero mayor es " + number2);
                    break;
                }
            }
        }
        // Ejercicio 27
        int a, b;
        while (true) {
            System.out.println("Ingrese un numero entero ");
            a = sc.nextInt();
            System.out.println("Ingrese otro numero entero, mayor al primero ");
            b = sc.nextInt();
            if (a >= b) {
                System.out.println("El primer numero es mayor, ingrese de nuevo");
            } else {
                break;
            }
        }
        for (int l = a; l <= b; l++) {
            if (l % 2 == 0) {
                System.out.println(l);
            }
        }
        // Ejercicio 28
        int n, m_1;
        while (true) {
            System.out.println("Ingrese un numero entero positivo ");
            n = sc.nextInt();
            System.out.println("Ingrese otro numero entero positivo, mayor al primero ");
            m_1 = sc.nextInt();
            if ((n > 0) && (m_1 > 0) && (n < m_1)) {
                break;
            } else {
                System.out.println("Valores ingresados invalidos");
            }
        }
        System.out.println("Los multiplos de " + n + " contenidos entre 1 y " + m_1 + " son: ");
        for (int p = 1; p <= m_1; p++) {
            if (p % n == 0) {
                System.out.println(p);
            }
        }
        // Ejercicio 29
        double ml=1;
        while (true){
            System.out.println("Ingrese un valor en millas para tranformarlo en km, ingrese 0 para salir");
            ml = sc.nextDouble();
            if (ml!=0) {
                System.out.print(ml + " millas son " + ml * 1.6093 + " kilometros \n");
            }
            else{
                break;
            }
        }
    }
}


