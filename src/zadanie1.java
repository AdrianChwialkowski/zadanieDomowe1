import java.util.Scanner;
/*
1. Napisać program służący do konwersji wartości temperatury podanej w stopniach
Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
Celsjusza + 32.0)
 */


public class zadanie1 {
    public static void main(String[] args) {
        System.out.println("Podaj temperaturę do przeliczenia: ");
        Scanner odczyt = new Scanner(System.in);
        double temp = odczyt.nextDouble();
        double temp2 = (temp * 1.8) + 32;




        System.out.println(temp + " Stopni Celsjusza to " +  temp2 + " stopni Fahrenheita.");



    }
}
