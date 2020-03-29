import lombok.Data;

@Data
public class Dom extends Budynek {

    public String toString() {
        return "Dom{" +
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