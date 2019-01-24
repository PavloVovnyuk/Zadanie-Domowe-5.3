import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("wprowadz temperature");
        double firstTemp = scanner.nextDouble ();
        scanner.nextLine ();
        System.out.println ("Wprowadż ile metrów ma pokój");
        double howmeters = scanner.nextDouble ();
        scanner.close ();
        Room room = new Room (howmeters, firstTemp, true, 3);
        Clima clima = new Clima ();
        clima.setRoom1 (room);

        System.out.println ("Temperatira w pokoju wynosi " + room.temperature);
        System.out.println ("Czy w pokoju zamontowana klimatyzacja? - " + room.isClima);
        System.out.println ("Pokój ma " + room.howMeters + "  metrów kwadratowych");
        System.out.println ("Czy temperatura została obniżona o 1 stopień? - " + room.minusTemperature ());
        System.out.println ("Pokuj chłodzi się o " + clima.climaCoold ());
    }
}
