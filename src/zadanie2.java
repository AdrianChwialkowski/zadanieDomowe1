import java.util.Scanner;

public class zadanie2 {
    public static void main (String[] args){
        /*
        2. Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
najmniejszą z nich.
         */
         System.out.println("Cześć podaj 3 liczby a ja ci powiem która jest największa a która najmniejsza.");
         System.out.println("Podaj pierwszą liczbę!");
         Scanner odczyt = new Scanner(System.in);
         double a = odczyt.nextDouble();

        System.out.println("Podaj drugą liczbę!");
        Scanner odczyt1 = new Scanner(System.in);
        double b = odczyt1.nextDouble();

        System.out.println("Podaj trzecią liczbę!");
        Scanner odczyt2 = new Scanner(System.in);
        double c = odczyt2.nextDouble();


        if (a >b && a > c)
        System.out.println("Największą cyfrą jest " + a);


        else if (b >a && b >c)
        System.out.println("Największą cyfrą jest " + b);



        else if (c > a && c > b)
        System.out.println("Największą cyfrą jest " + c);

        if (a <b && a <c)
            System.out.println("A najmniejszą liczbą jest liczba "+ a);
        else if (b < a && b < c)
            System.out.println("A najmniejszą liczbą jest liczba "+ b);
        else if (c <a && c < b)
            System.out.println("A najmniejszą liczbą jest liczba "+ c);






    }

}
