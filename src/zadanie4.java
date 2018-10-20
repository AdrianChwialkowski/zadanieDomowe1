import java.util.Scanner;

public class zadanie4 {
    public static void main (String [] args){

        /*
        Napisać program obliczający należny podatek dochodowy od osób fizycznych. Program
ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie
należny podatek. Podatek obliczany jest wg. następujących reguł:
• do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
• od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,0
         */

        System.out.println("Dziś pomogę ci obliczyć należny podatek");
        System.out.println(" wpisz Swój dochód");
        Scanner odczyt = new Scanner(System.in);
        double dochód = odczyt.nextDouble();
        double  prog = 85528;

        if (dochód < prog) {

            double podatek = dochód * 0.18 - 556.02;
            System.out.println("Twój dochód to " + dochód + " a podatek do zapłacenie wynosi " );
            System.out.format("%.2f%n", podatek);
        }
        else if (dochód > prog) {
            double podatek2 = ((dochód - prog) * 0.32) + 14839.02;
            System.out.println("Przekroczyłes próg podatkowy/. Podatek do zapłaty wynosi " );
            System.out.format("%.2f%n", podatek2);

        }


    }

}
