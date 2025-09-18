import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class Main {

    public static void main(String[] args) {
    SavingToFile();
    LoadFromFile();
    }

    public static void SavingToFile() {
        Path path = Path.of("jakisPlik.txt");
        List<String> linesToSaveInFile = new ArrayList<String>();
        linesToSaveInFile.add("haha");
        linesToSaveInFile.add("test");

        try {
            Files.write(path, linesToSaveInFile);
            System.out.println("zapisano dane do pliku");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void LoadFromFile()  {
        Path path = Path.of("jakisPlik.txt");
        try {
            List<String> linesLoadedFormfile = Files.readAllLines(path);
            System.out.println("zawartość pliku");
            for (String linia : linesLoadedFormfile) {
                System.out.println(linia);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
