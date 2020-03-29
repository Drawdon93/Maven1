import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Blok extends Budynek {

    public String toString() {
        return "Blok{" +
                "liczba pokoi wynosi= " + liczbaPokoi +
                ", liczba okien wynosi= " + liczbaOkien +
                ", liczba metrów wynosi= " + liczbaMetrów +
                ", liczba mieszkań wynosi= " + liczbaMieszkań +
                ", czy ma garaż= " + czyGaraż +
                ", czy ma ogródek= " + czyOgródek +
                ", czyJestSiłownia= " + czyJestSiłownia +
                '}';
    }
}