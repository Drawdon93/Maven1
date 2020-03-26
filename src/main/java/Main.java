import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double a = 0.95;
        //double srednia;
        Apartment apartment1 = new Apartment("ząbki", 26, 5000, 26 * 5000 * a);
        Apartment apartment2 = new Apartment("WWA", 260, 40000, 10 * 4000 * a);
        Apartment apartment3 = new Apartment("Pilawa", 310, 8000, 30 * 8000 * a);


        List<Apartment> apartmentList = new ArrayList<>();
        apartmentList.addAll(Arrays.asList(apartment1, apartment2, apartment3));
        System.out.print(apartmentList);

        for (Apartment apartment : apartmentList) {
            System.out.println(apartment.getMiasto());
            System.out.println("cena po zniżce: " + (apartment.getPowierzchnia() * apartment.getCenazametr()));
        }
        double sum = 0;
        for (Apartment one : apartmentList) {
            sum += one.getFullPrice();
        }
               System.out.format("średnia cena mieszkań to: %.2f", sum / apartmentList.size());
    }


    }

//Zadanie Mieszkania
//Stwórz klasę Apartment , która będzie zawierała informacje o mieście, w którym
//się znajduje, powierzchni w metrach kwadratowych, oraz cenie za metr
//mieszkania. Ponadto, klasa ma zawierać metodę double getFullPrice() , która
//zwraca cenę za mieszkanie przemnożoną przez 0.95 (zniżka dla młodych).

//Następnie w metodzie main stwórz tablicę lub kolekcję mieszkań i wypisz dla
//każdego z nich miasto, w którym się znajduje, oraz cenę po zniżce.

//Wyznacz średnią cenę mieszkań. Wszystkie wartości liczbowe w tym zadaniu
//wypisz, zaokrąglając do dwóch miejsc po przecinku (wyszukaj w internecie jeżeli
//nie wiesz jak wypisać liczbę zaokrągloną). Przykładowy output:
//1. Apartment in Warsaw costs 771875.00.
//2. Apartment in Cracow costs 779000.00.
//3. Apartment in Gdansk costs 855000.00.
//Mean price is 801958.31
//Użyj Lomboka. Projekt należy wrzucić na GitHuba