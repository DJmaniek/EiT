import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void odczytPlikuTekstowego(String nazwa) throws IOException {
        // odczyt wiersz po wierszu
        BufferedReader plik2 = null;
        try {
            plik2 = new BufferedReader(new FileReader(nazwa));
            System.out.println("\n\nOdczyt pliku:\n");
            String l = plik2.readLine();
            while (l != null) {
                System.out.println(l);
                l = plik2.readLine();
            }
        } finally {
            if (plik2 != null) {
                plik2.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String nazwaPliku = "test.txt";

        odczytPlikuTekstowego(nazwaPliku);
    }
}