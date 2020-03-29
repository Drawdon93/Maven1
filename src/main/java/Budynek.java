import lombok.Data;

@Data
public abstract class Budynek {

    int liczbaPokoi;
    int liczbaOkien;
    int liczbaMetrów;
    int liczbaMieszkań;
    boolean czyGaraż;
    boolean czyOgródek;
    boolean czyJestSiłownia;

}