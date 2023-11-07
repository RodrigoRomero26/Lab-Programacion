import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        ArrayList<Integer>numeros = new ArrayList<>();
        int mayor = Integer.MIN_VALUE;
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        //Ejercicio 2
        ArrayList<String>nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Gustavo");
        nombres.add("Valentin");
        ArrayList<String>nombrescopia = new ArrayList<>();
        //Ejercicio 3
        for (int i : numeros){
            System.out.print(i+" ");
        }
        //Ejercicio 4
        System.out.println("La longitud del array de caracteres es: "+nombres.size());
        //Ejercicio 5
        nombres.remove("Juan");
        //Ejercicio 6
        if (numeros.isEmpty()){
            System.out.println("El array de numeros esta vacio.");
        }else {
            System.out.println("El array no esta vacio");
        }
        //Ejercicio 7
        for (int i : numeros){
            if (i > mayor){
                mayor = i;
            }
        }
        System.out.println("El mayor numero del array es: "+mayor);
        //Ejercicio 8
        nombrescopia.addAll(nombres);
        System.out.println("Array original: "+nombres+" Array copia: "+nombrescopia);
        //Ejercicio 9
        Collections.reverse(numeros);
        //Ejercicio 10
        nombres.addAll(nombrescopia);
        //Ejercicio 11
        for (int i= 0;i<= numeros.size()-1;i++){
            if (numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }
        }
        //Ejercicio 12
        System.out.println(nombres.indexOf("Valentin"));
        //Ejercicio 13
        ArrayList<Integer>numeros1 = new ArrayList<>();
        ArrayList<Integer>numeros2 = new ArrayList<>();
        numeros1.add(1);
        numeros2.add(1);
        numeros1.add(2);
        numeros2.add(2);
        numeros1.add(3);
        numeros2.add(3);
        boolean iguales = true;
        if (numeros1.size() != numeros2.size()){
            iguales = false;
        }else{
            for (int i = 0; i < numeros1.size();i++){
                if(!numeros1.get(i).equals(numeros2.get(i))){
                    iguales = false;
                    break;
                }
            }
        }
        if (iguales){
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
        //Ejercicio 14
        System.out.println("El valor mas pequeño del arraylist es: "+ Collections.min(numeros1));
        //Ejercicio 15
        ArrayList<Integer>numeros3 = new ArrayList<>();
        int suma = 0;
        numeros3.add(1);
        numeros3.add(2);
        numeros3.add(3);
        numeros3.add(4);
        numeros3.add(5);
        for(int i : numeros3){
            suma+=i;
        }
        System.out.println("La suma de todos los elementos del arraylist es: "+suma);
        //Ejercicio 16
        ArrayList<String>lista1 = new ArrayList<>();
        String frase = "";
        lista1.add("Hola");
        lista1.add("como");
        lista1.add("estas");
        lista1.add("?");
        for (String palabra : lista1){
            frase+=palabra + " ";
        }
        System.out.println(frase);
        //Ejercicio 17
        ArrayList<String>lista2 = new ArrayList<>();
        lista2.add("Hola");
        lista2.add("Hola");
        lista2.add("como");
        lista2.add("como");
        lista2.add("estas");
        lista2.add("?");
        lista2.add("?");
        LinkedHashSet<String> listaunicos = new LinkedHashSet<>();
        listaunicos.addAll(lista2);
        lista2.clear();
        lista2.addAll(listaunicos);
        System.out.println(lista2);
        //Ejercicio 18
        int sumapares = 0;
        ArrayList<Integer> numeros4 = new ArrayList<>();
        numeros4.add(2);
        numeros4.add(1);
        numeros4.add(6);
        numeros4.add(3);
        numeros4.add(10);
        numeros4.add(4);
        for (int i= 0; i<numeros4.size();i++){
            if (i % 2 == 0){
                sumapares += numeros4.get(i);
            }
        }
        System.out.println("La suma de sus valores en posiciones pares es de: "+sumapares);
        //Ejercicio 19
        if (numeros4.contains(3)){
            System.out.println("La lista contiene el valor buscado.");
        }else {
            System.out.println("La lista no contiene el valor buscado.");
        }
        //Ejercicio 20
        int longmaslarga = 0;
        String stringmaslarga= "";
        for (String palabra : lista2){
            if (palabra.length() > longmaslarga){
                longmaslarga = palabra.length();
                stringmaslarga = palabra;
            }
        }
        System.out.println("La elemento de mayor longitud es: "+stringmaslarga);
        //Ejercicio 21
        int suma1 = 0;
        for(int i : numeros4){
            suma1 += i;
        }
        double promedio = (double) suma1 / (numeros4.size()+1);
        System.out.println("El promedio es: "+promedio);
        //Ejercicio 22
        Collections.sort(numeros4);
        System.out.println(numeros4);
        //Ejercicio 23
        for (int i = numeros4.size() - 1; i >= 0; i--){
            if (numeros4.get(i) > 5){
                numeros4.remove(i);
            }
        }
        System.out.println(numeros4);
        //Ejercicio 24
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("banana");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("banana");
        palabras.add("manzana");
        palabras.add("manzana");
        palabras.add("palta");
        String palabrabuscar = "manzana";
        int contador = 0;
        for (String palabra : palabras){
            if (palabra.equals(palabrabuscar)){
                contador ++;
            }
        }
        System.out.println("La palabra manzana aparece: "+contador+" veces.");
        //Ejercicio 25
        Collections.sort(palabras);
        System.out.println(palabras);
    }
}