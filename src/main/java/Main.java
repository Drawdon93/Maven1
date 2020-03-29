import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double a = 0.95;
        //double srednia;
        Apartment apartment1 = new Apartment("Ząbki", 26, 5000, 26 * 5000 * a);
        Apartment apartment2 = new Apartment("Warszawa", 260, 40000, 10 * 4000 * a);
        Apartment apartment3 = new Apartment("Pilawa", 310, 8000, 30 * 8000 * a);


        List<Apartment> apartmentList = new ArrayList<>();
        apartmentList.addAll(Arrays.asList(apartment1, apartment2, apartment3));
        System.out.print("Oto lista apartamentów: "+ apartmentList);

        for (Apartment apartment : apartmentList) {
            System.out.println(apartment.getMiasto());
            System.out.println("Cena apartamentów po zniżce: " + (apartment.getPowierzchnia() * apartment.getCenaZaMetr()));
        }
        double sum = 0;
        for (Apartment one : apartmentList) {
            sum += one.getFullPrice();
        }
        System.out.format("Średnia cena mieszkań to: %.2f", sum / apartmentList.size());


        Dom dom1 = new Dom();
        dom1.setLiczbaPokoi(4);
        dom1.setLiczbaOkien(8);
        dom1.setLiczbaMetrów(45);
        dom1.setLiczbaMieszkań(1);
        dom1.setCzyGaraż(false);
        dom1.setCzyOgródek(true);
        dom1.setCzyJestSiłownia(false);

        System.out.println("\nDom prezentuje się następująco: " + dom1);

        Dom dom2 = new Dom();
        dom2.setLiczbaPokoi(9);
        dom2.setLiczbaOkien(15);
        dom2.setLiczbaMetrów(110);
        dom2.setLiczbaMieszkań(1);
        dom2.setCzyGaraż(true);
        dom2.setCzyOgródek(true);
        dom2.setCzyJestSiłownia(false);

        System.out.println("Dom prezentuje się następująco: " + dom2);

        Blok blok1 = new Blok();
        blok1.setLiczbaPokoi(5);
        blok1.setLiczbaOkien(7);
        blok1.setLiczbaMetrów(85);
        blok1.setLiczbaMieszkań(12);
        blok1.setCzyGaraż(true);
        blok1.setCzyOgródek(false);
        blok1.setCzyJestSiłownia(false);

        System.out.println("Blok prezentuje się następująco: " + blok1);

        Blok blok2 = new Blok();
        blok2.setLiczbaPokoi(2);
        blok2.setLiczbaOkien(4);
        blok2.setLiczbaMetrów(38);
        blok2.setLiczbaMieszkań(17);
        blok2.setCzyGaraż(false);
        blok2.setCzyOgródek(false);
        blok2.setCzyJestSiłownia(true);

        System.out.println("Blok prezentuje się następująco: " + blok2);

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