import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String tekst = scan.nextLine();
        Path p = Paths.get("C:\\Users\\Maniek\\Desktop\\Nowy folder (5)\\test.txt");
        String s = System.lineSeparator() + tekst;

        try (BufferedWriter writer = Files.newBufferedWriter(p, StandardOpenOption.APPEND)) {
            writer.write(s);
        } catch (IOException ioe) {
            System.err.format("IOException: %s%n", ioe);
        }
    }
}
