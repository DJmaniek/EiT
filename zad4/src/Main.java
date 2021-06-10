import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void odczytPlikuTekstowego(String nazwa) throws IOException {
        String actualWord = "";
        String maxLenWord = "";
        FileReader plikWe = null;
        try {
            plikWe = new FileReader(nazwa);
            System.out.println("Odczyt znak po znaku:\n");
            int c;
            // odczyt pliku znak po znaku
            while ((c = plikWe.read()) != -1) {
                String x = c + "";
                if(x.equals("\s"))
                    actualWord = "";
                else {
                    actualWord = actualWord + x;
                    System.out.println(actualWord);
                }
                if(actualWord.length() > maxLenWord.length())
                    maxLenWord = actualWord;

                //System.out.print((char)c);
            }
           System.out.println(maxLenWord);
        } finally {
            if (plikWe != null) {
                plikWe.close(); // zamknięcie pliku
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String nazwaPliku = "test.txt";

        odczytPlikuTekstowego(nazwaPliku);
    }
}