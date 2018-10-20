import java.util.Scanner;

public class zadanie6 {

    public static void main(String[] args) {
        /*
        Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie
operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach
rzeczywistych. Program ma identyfikować sytuację wprowadzenia błędnego
symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję switch
do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu
operacji. Scenariusz działania programu:
a) Program wyświetla informację o swoim przeznaczeniu.
b) Wczytuje pierwszą liczbę.
c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
d) Wczytuje drugą liczbę.
e) Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania
działania.
f) Program kończy swoje działanie po naciśnięciu przez użytkownika klawisza
Enter.
         */
        char operacja;
        double liczba1;
        double liczba2;
        double wynik  = 0;



        System.out.println("prosty kalkulator");

        System.out.println(" Nie zapomnij że kolejnośc ma znaczenie!!! A teraz podaj pierwszą cyfrę. ");
        Scanner odczyt1 = new Scanner(System.in);
        liczba1 = odczyt1.nextDouble();



        System.out.println("podaj symbo działanie jakie chcesz wykonac ");
        Scanner odczyt = new Scanner(System.in);
        operacja = odczyt.next().charAt(0);




        System.out.println(" Teraz podaj drugą liczbę.");
        Scanner odczyt2 = new Scanner(System.in);
        liczba2 = odczyt2.nextDouble();



        switch (operacja) {
            case '+' :
                 wynik = liczba1 + liczba2;
                break;
            case '-' :
                 wynik = liczba1 - liczba2;
                break;
            case '*' :
                 wynik = liczba1 * liczba2;
                break;
            case '/' :
                if (liczba2 == 0) {
                    System.out.println("Nie dzielimy przez 0!");
                } else wynik = liczba1 / liczba2;

            }





        System.out.println(wynik);

    }

}
