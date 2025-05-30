import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    private static final String PATH = "chef_berlesek_2024.csv";
    public static ArrayList<Berles> readFile() throws FileNotFoundException {
        ArrayList<Berles> rents = new ArrayList<>();
        File file = new File(PATH);
        Scanner sc = new Scanner(file);
        sc.nextLine();
        while (sc.hasNextLine()) {
            rents.add(new Berles(sc.nextLine()));
        }
        sc.close();
        return rents;
    }
}
