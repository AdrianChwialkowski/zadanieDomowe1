import java.util.Scanner;

public class zadanie3 {
    public static final double GÓRNA_GRANICA_NIEDOWAGI = 18.49;
    public static final double GÓRNA_GRANICA_NADWAGI = 29.99;

    public static void main (String [] args) {
        /*
        Napisać program, który oblicza wartość współczynnika BMI (ang. body mass
index) wg. wzoru: waga
wzrost2 . Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje
”waga prawidłowa”, jeżeli poniżej to ”niedowaga”, jeżeli powyżej ”nadwaga”.
         */
        System.out.println("Cześc obliczymy twoje BMI");
        // unikamy "magicznych liczb" liczb z nikąd
        System.out.println("podaj swój wzrost w metrach");
        Scanner odczyt = new Scanner(System.in);
        double wzrost = odczyt.nextDouble();


        System.out.println("podaj swóją wagę");
        Scanner odczyt1 = new Scanner(System.in);
        long waga = odczyt1.nextLong();


        double bmi = waga / (wzrost * wzrost);
        /*
        Zamiast czegoś takiego używamy "Final"
        double a = 18.5;
        double b = 24.9;
        */

        System.out.println("twoje BMI wynosi");
        System.out.format("%.2f%n", bmi);

        if (bmi < GÓRNA_GRANICA_NIEDOWAGI)
            System.out.println("Masz niedowagę");
        else if (bmi > GÓRNA_GRANICA_NIEDOWAGI && bmi < GÓRNA_GRANICA_NADWAGI)
            System.out.println("Masz idealną wagę");
        else if (bmi> GÓRNA_GRANICA_NADWAGI)
            System.out.println( "Masz nadwagę" );


    }
}
