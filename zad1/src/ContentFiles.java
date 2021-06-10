import java.io.File;

    public class ContentFiles {
        public static void main(String[] args) {
            File katalog = new File(".");
            String pliki[] = katalog.list();

            for(int i =0 ; i < pliki.length; i++)
            {
                System.out.println(pliki[i]);
            }
        }
    }
