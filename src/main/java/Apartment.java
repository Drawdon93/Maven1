import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Apartment {

    private String miasto;
    private double powierzchnia;
    private double cenazametr;
    private double fullPrice;

    //test

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