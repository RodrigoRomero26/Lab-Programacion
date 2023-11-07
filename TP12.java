import java.util.ArrayList;
import java.util.regex.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> datos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        datos.add("rodriromero11@gmail.com");
        datos.add("26/08/2002");
        datos.add("5005");
        Pattern patternmail = Pattern.compile("^[a-zA-z0-9._%+-]+@[a-zA-z.-]+\\.[a-zA-Z]{3}");
        Pattern patternfecha = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}");
        for (String dato : datos) {
            Matcher matchermail = patternmail.matcher(dato);
            Matcher matcherfecha = patternfecha.matcher(dato);
            if (matchermail.matches()) {
                System.out.println(matchermail.group() + " Es un correo electronico");
            }
            if (matcherfecha.matches()) {
                System.out.println(matcherfecha.group() + " Es una fecha");
            }
        }
        ArrayList<String> datos1 = new ArrayList<>();
        String fecha;
        for (int i=0 ; i<5; i++){
            while (true){
                System.out.println("Ingrese su fecha. En formato DD/MM/AAAA");
                fecha = sc.nextLine();
                Matcher matcherfecha = patternfecha.matcher(fecha);
                if (matcherfecha.matches()){
                    datos1.add(fecha);
                    break;
                }else{
                    System.out.println("Dato ingresado invalido. Intente otra vez.");
                }
            }
        }

            String cadena = "2hola1";
            Pattern patterndigito = Pattern.compile("[0-9]$");
            Matcher matcherdigito = patterndigito.matcher(cadena);
            if (matcherdigito.find()) {
                System.out.println("La cadena termina con un digito.");
            }else{
                System.out.println("La cadena no termina con un digito");
            }
            Pattern patterndigitoprincipio = Pattern.compile("^[0-9]");
            Matcher matcherdigitoprincipio = patterndigitoprincipio.matcher(cadena);
            if (matcherdigitoprincipio.find()){
                System.out.println("La cadena empieza con un digito");
            }else {
                System.out.println("La cadena no empieza con un digito");
            }
        cadena = "AaEeGg";
        Pattern patternformado = Pattern.compile("^[a-zA-Z]{5,10}$");
        Matcher matcherformado = patternformado.matcher(cadena);
        if (matcherformado.matches()){
            System.out.println("La cadena esta formada entre 5 y 10 caracteres mayusculas o minusculas");
        }else {
            System.out.println("La cadena no esta formada por entre 5 y 10 caracteres mayusculas o minusculas");
        }
        String dni = "44-310-653";
        Pattern patterndni = Pattern.compile("^[0-9]{2}-[0-9]{3}-[0-9]{3}");
        Matcher matcherdni = patterndni.matcher(dni);
        if(matcherdni.matches()){
            System.out.println("DNI valido");
        }else {
            System.out.println("DNI no valido");
        }

        ArrayList<String>emails = new ArrayList<>();
        String email="";
        for (int i = 0;i<3;i++){
            while (true){
                System.out.println("Ingrese el correo.");
                email = sc.nextLine();
                Matcher matcheremail= patternmail.matcher(email);
                if (matcheremail.matches()){
                    System.out.println("Email ingresado");
                    emails.add(email);
                    break;
                }else{
                    System.out.println("Email no valido");
                }
            }
        }

        Pattern patternabc = Pattern.compile("abc");
        cadena = "asdasdacasd";
        Matcher matcherabc = patternabc.matcher(cadena);
        if (matcherabc.find()){
            System.out.println("La cadena contiene abc.");
        }else {
            System.out.println("La cadena no contiene abc");
        }
    }
}