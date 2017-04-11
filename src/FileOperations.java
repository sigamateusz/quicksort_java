import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;

class FileOperations {

    static ArrayList<Integer> readFromFile(String filename) {

        ArrayList<Integer> arrayFromFile = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(filename));

            while(sc.hasNext()) {
                arrayFromFile.add(Integer.parseInt(sc.next()));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arrayFromFile;
    }

    static void writeToFile(ArrayList<Integer> listToSave, String filename) {
        try {
            String new_file = filename.replace(".txt", "_sorted.txt");
            Formatter f = new Formatter(new_file);

            for (Integer number: listToSave) {
                f.format("%s%s", number, "\n");
            }

            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
